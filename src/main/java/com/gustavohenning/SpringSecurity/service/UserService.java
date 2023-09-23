package com.gustavohenning.SpringSecurity.service;

import com.gustavohenning.SpringSecurity.entity.ApplicationUser;
import com.gustavohenning.SpringSecurity.entity.Role;
import com.gustavohenning.SpringSecurity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       return userRepository.findUserByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
    }
}
