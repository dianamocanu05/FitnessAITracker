package com.example.services;

import com.example.models.User;
import com.example.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public boolean checkEmailExists(String email){
        List<String> emails = new ArrayList<>();
        userRepository.findAll().forEach(u -> emails.add(u.getEmail()));
        return emails.contains(email);
    }

    public void createUser(User user){
        userRepository.save(user);
    }

}
