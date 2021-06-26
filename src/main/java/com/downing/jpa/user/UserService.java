package com.downing.jpa.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity findByUserId(String userId) {
        return userRepository.findByUserId(userId);
    }
}
