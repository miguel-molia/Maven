package com.example.flashcash.service;

import com.example.flashcash.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthentificationService implements UserDetailsService {

    private final UserRepository userRepository;

    public AuthentificationService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

@Override
public UserDetails loadUserByName(String s) throws UsernameNotFoundException {

    Optional<User> user = userRepository
            .findUserByMail(s);

    if (user.isPresent()) {

        return new org.springframework.security.core.userdetails.User(user.get().getEmail(), user.get().getPassword())
    }

    throw new UsernameNotFoundException(s);

}


}
