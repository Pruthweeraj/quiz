package com.pruthwee.quiz.dao;

import com.pruthwee.quiz.model.ResultVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultDao extends JpaRepository<ResultVO, Long> {

    @Query(value = "select * from result where user_id = :userId", nativeQuery = true)
    ResultVO findByUserId(Long userId);
}
