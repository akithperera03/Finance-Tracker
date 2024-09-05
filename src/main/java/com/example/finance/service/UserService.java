package com.example.finance.service;

import com.example.finance.dto.UserDTO;
import com.example.finance.model.User;

public interface UserService {
    void registerUser(UserDTO userDTO);
    User findByUsername(String username);
}
