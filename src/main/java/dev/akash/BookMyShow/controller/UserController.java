package dev.akash.BookMyShow.controller;

import dev.akash.BookMyShow.dto.UserLoginRequestDto;
import dev.akash.BookMyShow.dto.UserSignUpRequestDto;
import dev.akash.BookMyShow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity logIn(@RequestBody UserLoginRequestDto userLoginRequestDto){
        //validate
        return ResponseEntity.ok(
                userService.login(userLoginRequestDto.getEmail(), userLoginRequestDto.getPassword())
        );
    }

    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody UserSignUpRequestDto userSignUpRequestDto){
        //validate
        return ResponseEntity.ok(userService.signUp(userSignUpRequestDto.getName(), userSignUpRequestDto.getEmail(), userSignUpRequestDto.getPassword()));
    }
}
