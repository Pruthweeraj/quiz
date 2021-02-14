package com.pruthwee.quiz.service;

import com.pruthwee.quiz.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User validateAndGetUser(String username, String password);
}
