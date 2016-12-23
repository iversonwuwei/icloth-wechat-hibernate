package com.walden.repository;

import com.walden.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by walden on 2016/12/23.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findOne(Long id);

    List<User> findAll();

    User save(User user);
}
