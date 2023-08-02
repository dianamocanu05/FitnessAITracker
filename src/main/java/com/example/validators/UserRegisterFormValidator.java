package com.example.validators;

import com.example.exceptions.EmailAlreadyInUseException;
import com.example.exceptions.InvalidAgeException;
import com.example.services.UserService;
import com.example.models.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRegisterFormValidator {

    @Autowired
    private UserService userService;
    public void validateUser(User user) throws EmailAlreadyInUseException, InvalidAgeException {
        if(userService.checkEmailExists(user.getEmail())){
            throw new EmailAlreadyInUseException();
        }

        if(user.getAge() < 18 || user.getAge() > 100){
            throw new InvalidAgeException();
        }
    }
}
