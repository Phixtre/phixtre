package com.example.login.phixtre.mapper;

import com.example.login.phixtre.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User findUserById(int userId);
}
