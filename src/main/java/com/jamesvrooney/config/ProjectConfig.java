package com.jamesvrooney.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class ProjectConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public UserDetailsService userDetailsService() {
        var userDetailsService = new InMemoryUserDetailsManager();

        var rob = User.withUsername("rob")
                .password("password")
                .authorities("READ")
                .build();

        var walt = User.withUsername("walt")
                .password("password")
                .authorities("WRITE")
                .build();

        userDetailsService.createUser(rob);
        userDetailsService.createUser(walt);

        return userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.httpBasic();

        http.authorizeRequests()
                .anyRequest()
                .hasAuthority("WRITE");
    }
}
