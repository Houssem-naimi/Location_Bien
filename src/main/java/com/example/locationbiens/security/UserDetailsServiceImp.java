package com.example.locationbiens.security;

import com.example.locationbiens.user.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImp implements UserDetailsService {

    private final UserRepository repository;
    @Override
    @Transactional
    public UserDetails loadUserByUsername(String usermEail) throws UsernameNotFoundException {
        return repository.findByEmail(usermEail)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
