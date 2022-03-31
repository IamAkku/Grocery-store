package com.akram.backend.security;

import com.akram.backend.dao.UserDAO;
import com.akram.backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserDAO userDAO;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException { // (1)
        User user = userDAO.findByName(username);
        if (user == null) throw new UsernameNotFoundException("User not found");

        return new MyUserDetails(user);
    }
}
