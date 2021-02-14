package com.pruthwee.quiz.service;

import com.pruthwee.quiz.dao.UserDao;
import com.pruthwee.quiz.domain.User;
import com.pruthwee.quiz.model.UserVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);


    @Autowired
    UserDao userDao;


    @Override
    public User validateAndGetUser(String username, String password) {
        logger.info("validating User: {}", username);
        UserVO userVO = userDao.findByNameAndPassword(username, password);

        User user = null;
        if (null != userVO) {
            user = new User();
            BeanUtils.copyProperties(userVO, user);
        }

        return user;
    }
}
