package com.pruthwee.quiz.service;

import com.pruthwee.quiz.domain.Question;
import com.pruthwee.quiz.domain.Result;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface QuizService {

    List<Question> getQuestions(int count);

    void submitQuiz(Long userId, List<Question> questions);

    void submitQuizAnswer(Long userId, Map<Long, Long> ansMap);

    List<Result> getResult();
}
