package com.pruthwee.quiz.dao;

import com.pruthwee.quiz.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserVO, Long> {

    UserVO findByNameAndPassword(String name, String password);
}
