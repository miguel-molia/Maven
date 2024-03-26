package com.example.flashcash.service;

import com.example.flashcash.model.User;
import com.example.flashcash.model.UserAccount;
import com.example.flashcash.repository.UserRepository;
import com.example.flashcash.service.SessionService;
import com.example.flashcash.service.form.SignUpForm;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    private final SessionService sessionService;
    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;

    public UserService(SessionService sessionService, PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.sessionService = sessionService;
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }


    public User registration(SignUpForm form) {

        User user = new User();
        UserAccount account = new UserAccount();
        account.setAmount(0.0);
        user.setAccount(account);
        user.setFirstName(form.getFirstName());
        user.setLastName(form.getLastName());
        user.setEmail(form.getEmail());
        user.setPassword(passwordEncoder.encode(form.getPassword()));
        return userRepository.save(user);

    }
}

