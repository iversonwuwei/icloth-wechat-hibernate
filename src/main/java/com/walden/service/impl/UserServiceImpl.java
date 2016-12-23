package com.walden.service.impl;

import com.walden.model.User;
import com.walden.repository.UserRepository;
import com.walden.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by walden on 2016/12/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User getOne(Long id) {
        User user = userRepository.findOne(id);
        return user;
    }
}
