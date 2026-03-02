package com.example.reservasajedrez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.reservasajedrez.model.UserLogin;
import com.exemple.reservasajedrez.model.dto.LoginRequest;
import com.exemple.reservasajedrez.model.dto.RegisterRequest;
import com.exemple.reservasajedrez.repository.UserLoginRepository;
import com.exemple.reservasajedrez.security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {
   @Autowired
   private AuthenticationManager authenticationManager;
   @Autowired
   private JwtUtil jwtUtil;
   @Autowired
   private UserLoginRepository userRepo;
   @Autowired
   private PasswordEncoder passwordEncoder;
   
   @PostMapping("/login")
   public ResponseEntity<String> login(@RequestBody LoginRequest request) {
       authenticationManager.authenticate(
               new UsernamePasswordAuthenticationToken(
                       request.getUsername(),
                       request.getPassword()
               )
       );
       String token = jwtUtil.generateToken(request.getUsername(), request.getRole());
       return ResponseEntity.ok(token);
   }
   @PostMapping("/register")
   public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
       if (userRepo.findByUsername(request.getUsername()).isPresent()) {
           return ResponseEntity.badRequest()
                   .body("Aquest usuari ja existeix");
       }
       UserLogin user = new UserLogin();
       user.setUsername(request.getUsername());
       user.setPassword(passwordEncoder.encode(request.getPassword()));
       user.setRole(request.getRole());
       userRepo.save(user);
       return ResponseEntity.ok("Usuari registrat correctament");
   }
}