package com.pruthwee.quiz.dao;

import com.pruthwee.quiz.model.QuestionVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<QuestionVO, Long> {

}
