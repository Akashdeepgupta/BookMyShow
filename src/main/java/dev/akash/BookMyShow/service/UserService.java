package dev.akash.BookMyShow.service;

import dev.akash.BookMyShow.exception.InvalidUserNameAndPasswordException;
import dev.akash.BookMyShow.exception.UserAlreadyExistsException;
import dev.akash.BookMyShow.exception.UserNotRegisteredException;
import dev.akash.BookMyShow.model.User;
import dev.akash.BookMyShow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User login(String email, String password){
        User savedUser = userRepository.findUserByEmail(email);
        if(savedUser == null){
            throw new UserNotRegisteredException("User not registered with this email");
        }
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        if(encoder.matches(password,savedUser.getPassword())){
            return savedUser;
        }
        throw new InvalidUserNameAndPasswordException("please enter correct email and password");
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public User signUp(String name, String email, String password){
        User savedUser = userRepository.findUserByEmail(email);
        if(savedUser!=null){
            throw new UserAlreadyExistsException("User with same email already present");
        }
        User user = new User();
        user.setEmail(email);
        user.setName(name);
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setPassword(encoder.encode(password));
        user.setTickets(new ArrayList<>());
        userRepository.save(user);
        return user;
    }
}
