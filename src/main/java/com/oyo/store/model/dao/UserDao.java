package com.oyo.store.model.dao;

import com.oyo.store.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface UserDao  extends JpaRepository<User,Long> {

    /*通过（用户名或者电话号码）+密码查找用户*/
    @Query("from User u where (u.userName = ?1 or u.userTel = ?1) and u.password =?2")
    User findOneUser(String userName,String password);

    // 通过用户id来查找用户
    @Query("from User u where u.userId =?1")
    User findById(@Param("userId") Integer userId);



}
