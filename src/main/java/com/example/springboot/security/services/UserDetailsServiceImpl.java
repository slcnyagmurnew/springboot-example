package com.example.springboot.security.services;

import com.example.springboot.dao.interfaces.TodoUserRepository;
import com.example.springboot.model.User;
import com.example.springboot.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    TodoUserRepository todoUserRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = todoUserRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(
                "User not found with username" + username
        ));
        return UserDetailsImpl.build(user);
    }
}
