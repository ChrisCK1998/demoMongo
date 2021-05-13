package com.example.demomongo.repository;

import com.example.demomongo.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Kai Chen
 * @create 2021-05-13-20:01
 */
@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
