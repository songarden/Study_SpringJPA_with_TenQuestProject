package com.kns.tenquest.service;

import com.kns.tenquest.entity.User;
import com.kns.tenquest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void write(User user){
        user.setMember_id(UUID.randomUUID());
        userRepository.save(user);
    }
}
