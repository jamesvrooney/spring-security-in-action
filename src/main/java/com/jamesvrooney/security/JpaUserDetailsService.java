package com.jamesvrooney.security;

import com.jamesvrooney.domain.User;
import com.jamesvrooney.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class JpaUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findUsersByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("Problem during authentication"));

        CustomUserDetails userDetails = new CustomUserDetails(user);

        return userDetails;
    }
}
