package com.loonch.jainja.service;

import com.loonch.jainja.model.User;
import com.loonch.jainja.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void create(User user) {
        userRepository.insert(user);
    }
}
