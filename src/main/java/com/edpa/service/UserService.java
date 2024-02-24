// package com.edpa.service;
//
// import com.edpa.enums.Role;
// import com.edpa.model.User;
// import com.edpa.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.stereotype.Service;
//
// @Service
// public class UserService {
//
//   private final UserRepository userRepository;
//
//   // private final PasswordEncoder passwordEncoder; // For password encryption
//
//   @Autowired
//   // public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//   public UserService(UserRepository userRepository) {
//     this.userRepository = userRepository;
//     // this.passwordEncoder = passwordEncoder;
//   }
//
//   public User createUser(
//     String username,
//     String email,
//     String password,
//     Role role
//   ) {
//     if (
//       userRepository.existsByUsername(username) ||
//       userRepository.existsByEmail(email)
//     ) {
//       throw new RuntimeException("User already exists");
//     }
//     User newUser = new User(username, email, password, role);
//     return userRepository.save(newUser);
//   }
//   // Additional methods as required...
// }
