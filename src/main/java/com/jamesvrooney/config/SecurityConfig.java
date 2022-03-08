package com.jamesvrooney.config;

import com.jamesvrooney.filters.RequestValidationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//    @Bean
//    public UserDetailsService userDetailsService() {
//        var userDetailsService = new InMemoryUserDetailsManager();
//
//        var adam = User.withUsername("adam")
//                .password("password")
//                .roles("ADMIN")
//                .build();
//
//        var mark = User.withUsername("mark")
//                .password("password")
//                .roles("MANAGER")
//                .build();
//
//        userDetailsService.createUser(adam);
//        userDetailsService.createUser(mark);
//
//        return userDetailsService;
//    }

//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return NoOpPasswordEncoder.getInstance();
//    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
//        http.httpBasic();
//
//        http.authorizeRequests()
//                .mvcMatchers(HttpMethod.GET, "/a").authenticated()
//                .mvcMatchers(HttpMethod.POST, "/a").permitAll()
//                .anyRequest().denyAll();
//
//        http.csrf().disable();

        http.addFilterBefore(
          new RequestValidationFilter(),
                BasicAuthenticationFilter.class
        ).authorizeRequests()
                .anyRequest().permitAll();
    }
}
