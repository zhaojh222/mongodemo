package com.zjh.dao;

import com.zjh.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by jiazhao on 6/14/18.
 */

@Repository
public interface UserDao extends MongoRepository<User,String> {

}
