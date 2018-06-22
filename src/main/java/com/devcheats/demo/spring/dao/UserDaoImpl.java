package com.devcheats.demo.spring.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import com.devcheats.demo.spring.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void save(User user) {
      sessionFactory.getCurrentSession().save(user);
   }
    @Override
   public User getUser(Long userId) {
      @SuppressWarnings("unchecked")
       User user =  (User) sessionFactory.getCurrentSession().get(User.class, userId);
      return user;
   }
   
   

   @Override
   public List<User> list() {
      @SuppressWarnings("unchecked")
      TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }

}
