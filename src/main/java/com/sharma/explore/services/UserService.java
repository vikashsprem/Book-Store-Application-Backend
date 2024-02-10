package com.sharma.explore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharma.explore.model.User;
import com.sharma.explore.repositories.UserRepository; 

@Service
public class UserService {

	@Autowired
    private  UserRepository userRepository;

    public User getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
