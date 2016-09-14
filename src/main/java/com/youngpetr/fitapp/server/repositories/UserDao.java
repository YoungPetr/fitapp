package com.youngpetr.fitapp.server.repositories;

import com.youngpetr.fitapp.server.entities.User;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Petr on 13. 9. 2016.
 */
@Transactional
public interface UserDao extends CrudRepository<User, Long> {


    public User findByEmail(String email);

}