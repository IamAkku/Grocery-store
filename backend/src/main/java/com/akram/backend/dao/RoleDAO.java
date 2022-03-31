package com.akram.backend.dao;

import com.akram.backend.entity.Role;

public interface RoleDAO {
    public Role findByName(String name);
}
