package com.yuvan.dao;

import org.springframework.data.repository.CrudRepository;

import com.yuvan.model.User;

public interface UserDAO extends CrudRepository<User,Integer>{

}
