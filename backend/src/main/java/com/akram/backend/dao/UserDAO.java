package com.akram.backend.dao;

import com.akram.backend.entity.User;

public interface UserDAO {
    public User findByName(String name);
    public void add(User user);
}
