package com.latewind.boot.module.user.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.latewind.boot.module.user.domain.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
}