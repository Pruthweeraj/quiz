package com.pruthwee.quiz.resource;

import com.pruthwee.quiz.domain.User;
import com.pruthwee.quiz.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserResource {
    private static final Logger logger = LoggerFactory.getLogger(UserResource.class);

    @Autowired
    UserService userService;

    @PostMapping("/user")
    private ResponseEntity validateAndGetUser(@RequestBody User requestUser) {

        User user = userService.validateAndGetUser(requestUser.getName(), requestUser.getPassword());
        if (user != null) {
            return new ResponseEntity(user, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.UNAUTHORIZED);
    }


}
