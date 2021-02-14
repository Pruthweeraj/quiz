package com.pruthwee.quiz.dao;

import com.pruthwee.quiz.model.OptionVO;
import com.pruthwee.quiz.model.QuestionVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionDao extends JpaRepository<OptionVO, Long> {

    @Query(value = "select * from option where question_id = :questionId", nativeQuery = true)
    List<OptionVO> findByQuestionId(Long questionId);
}
