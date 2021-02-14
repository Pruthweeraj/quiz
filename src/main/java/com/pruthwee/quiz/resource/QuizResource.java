package com.pruthwee.quiz.resource;

import com.pruthwee.quiz.domain.Question;
import com.pruthwee.quiz.domain.Result;
import com.pruthwee.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class QuizResource {

    @Autowired
    QuizService quizService;

    @GetMapping("/questions")
    private ResponseEntity<List<Question>> getQuestions(@RequestParam(defaultValue = "10") int size) {
        List<Question> questions = quizService.getQuestions(size);
        if (CollectionUtils.isEmpty(questions)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(questions, HttpStatus.OK);
    }

    @PostMapping("/questions")
    private ResponseEntity<Question> submitQuiz(@RequestParam Long userId, @RequestBody List<Question> questions) {
        quizService.submitQuiz(userId, questions);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("results")
    private ResponseEntity<List<Result>> getResult() {
        List<Result> results = quizService.getResult();
        if (CollectionUtils.isEmpty(results)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(results, HttpStatus.OK);
    }
}
