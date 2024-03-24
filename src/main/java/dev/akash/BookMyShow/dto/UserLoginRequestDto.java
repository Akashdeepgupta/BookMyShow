package dev.akash.BookMyShow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequestDto {
    String email;
    String password;
}
