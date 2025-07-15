package com.springSecurity.springSecurity.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        //default configuration using lambda expression

//        http.csrf(customizer -> customizer.disable());                                    //Disables the csrf permissions
//        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
//        http.formLogin(Customizer.withDefaults());              //comment this                                                   //enables default form login for api requests
//        http.httpBasic(Customizer.withDefaults());

        return http.build();  //Finalizes and returns the filter chain
    }
}
