package com.devcheats.demo.spring.dao;

import java.util.List;

import com.devcheats.demo.spring.model.User;

public interface UserDao {
   void save(User user);
   User getUser(Long userId);
   List<User> list();
}
