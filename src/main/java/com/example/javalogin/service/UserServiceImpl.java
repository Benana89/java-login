package com.example.javalogin.service;

import java.util.Arrays;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.javalogin.dto.UserDto;
import com.example.javalogin.entity.Role;
import com.example.javalogin.entity.User;
import com.example.javalogin.repository.RoleRepository;
import com.example.javalogin.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
            PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void saveUser(UserDto userDto) {
        User user = new User();
        user.setName(userDto.getName());
        user.setUsername(userDto.getUsername());
        // encrypt the password using spring security
        user.setPassword(userDto.getPassword());
        user.setRole(userDto.getRole());
        Role role = roleRepository.findByName(userDto.getRole());
        if (role == null) {
            role = checkRoleExist();
        }
        user.setRoles(Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public User findUserByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }

    private Role checkRoleExist() {
        Role role = new Role();
        role.setName("User");
        return roleRepository.save(role);
    }

}
