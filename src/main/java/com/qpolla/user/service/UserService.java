package com.qpolla.user.service;

import com.qpolla.auth.data.dto.UserSignupDto;
import com.qpolla.user.data.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserDto saveUser(UserDto signupDto);

    UserDto updateProfile(UserDto userDto);
}
