package com.pruthwee.quiz.service;

import com.pruthwee.quiz.dao.OptionDao;
import com.pruthwee.quiz.dao.QuestionDao;
import com.pruthwee.quiz.dao.ResultDao;
import com.pruthwee.quiz.dao.UserDao;
import com.pruthwee.quiz.domain.Option;
import com.pruthwee.quiz.domain.Question;
import com.pruthwee.quiz.domain.Result;
import com.pruthwee.quiz.domain.User;
import com.pruthwee.quiz.model.OptionVO;
import com.pruthwee.quiz.model.QuestionVO;
import com.pruthwee.quiz.model.ResultVO;
import com.pruthwee.quiz.model.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class QuizServiceImpl implements QuizService {

    private static final Logger logger = LoggerFactory.getLogger(QuizServiceImpl.class);


    @Autowired
    ResultDao resultDao;

    @Autowired
    QuestionDao questionDao;

    @Autowired
    UserDao userDao;

    @Autowired
    OptionDao optionDao;

    @Override
    public List<Question> getQuestions(int size) {
        logger.info("Requesting questions of size: {}", size);
        PageRequest pageRequest = PageRequest.of(0, size);
        Page<QuestionVO> pageOfQuestions = questionDao.findAll(pageRequest);

        List<Question> questionList = pageOfQuestions.stream().map(questionVO -> {
            Question question = new Question();
            BeanUtils.copyProperties(questionVO, question);
            List<OptionVO> optionsList = optionDao.findByQuestionId(question.getId());
            List<Option> options = optionsList.stream().map(optionVO -> {
                Option option = new Option();
                BeanUtils.copyProperties(optionVO, option);
                return option;
            }).collect(Collectors.toList());
            question.setOptions(options);
            return question;
        }).collect(Collectors.toList());

        return questionList;
    }

    @Override
    public void submitQuiz(Long userId, List<Question> questions) {
        logger.info("Submitting Quiz  for userId: {}", userId);

        List<Option> attemptedOptions = questions.stream().flatMap(question -> question.getOptions().stream()
                .filter(Option::isSelected)).collect(Collectors.toList());
        logger.debug("Attempts Options count for userId: {} and options: {}", userId, attemptedOptions);

        long score = attemptedOptions.stream().map(option -> optionDao.findById(option.getId())).filter(Optional::isPresent)
                .map(Optional::get).filter(OptionVO::isAnswer).count();

        logger.info("Score: {} for the userId: {}", score, userId);

        Optional<UserVO> OptionalUserVO = userDao.findById(userId);
        if (OptionalUserVO.isEmpty()) {
            logger.info("Invalid UserId: {}", userId);
            return;
        }

        ResultVO vo = resultDao.findByUserId(OptionalUserVO.get().getId());
        ResultVO resultVO = new ResultVO();
        if (null != vo) {
            logger.info("Updating exiting score for the userId: {}", userId);
            resultVO.setId(vo.getId());
        }
        resultVO.setUser(OptionalUserVO.get());
        resultVO.setScore(score);
        resultDao.save(resultVO);
    }

    @Override
    public List<Result> getResult() {
        logger.info("Retrieving all results.");
        List<ResultVO> resultVOList = resultDao.findAll();

        List<Result> resultList = new ArrayList<>();
        resultVOList.forEach(resultVO -> {
            Result result = new Result();
            BeanUtils.copyProperties(resultVO, result);
            User user = new User();
            BeanUtils.copyProperties(resultVO.getUser(), user);
            result.setUser(user);
            resultList.add(result);
        });

        return resultList;
    }
}
