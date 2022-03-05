package com.jamesvrooney.config;

import com.jamesvrooney.security.User;
import com.jamesvrooney.security.service.InMemoryUserDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class ProjectConfig {

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {

//        String usersByUsernameQuery =
//                "select username, password, enabled " +
//                        "from users where username = ?";
//
//        String authsByUserQuery =
//                "select username, authority from authorities where username = ?";

        final JdbcUserDetailsManager userDetailsManager = new JdbcUserDetailsManager(dataSource);

//        userDetailsManager.setU

        return userDetailsManager;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}
