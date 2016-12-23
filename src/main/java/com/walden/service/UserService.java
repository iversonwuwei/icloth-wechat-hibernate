package com.walden.service;

import com.walden.model.User;
import com.walden.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by walden on 2016/12/23.
 */
public interface UserService {

    User getOne(Long id);
}
