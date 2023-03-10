// package com.llv.notas.configuration;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.crypto.factory.PasswordEncoderFactories;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// import com.llv.notas.services.UserService;

// @Configuration
// public class SecurityConfig {

//     @Autowired
//     JWTAuthorizationFilter authorizationFilter;


//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http, AuthenticationManager authManager) throws Exception {

//         JWTAuthenticationFilter authenticationFilter = new JWTAuthenticationFilter();
//         authenticationFilter.setAuthenticationManager(authManager);
//         authenticationFilter.setFilterProcessesUrl("/login");

//         http
//             .csrf().disable()
//             .authorizeRequests()
//             .anyRequest()
//             .authenticated()
//             .and()
//             .httpBasic()
//             .and()
//             .sessionManagement()
//             .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//             .and()
//             .addFilter(authenticationFilter)
//             .addFilterBefore(authorizationFilter, UsernamePasswordAuthenticationFilter.class)
//             ;

//         return http.build();
//     }

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return PasswordEncoderFactories.createDelegatingPasswordEncoder();

// //        return new BCryptPasswordEncoder();
//     }

//     @Bean
//     UserService myUserService() {
//         return new UserService();
//     }

//     @Bean
//     AuthenticationManager authManager(HttpSecurity http) throws Exception {
//         return http.getSharedObject(AuthenticationManagerBuilder.class)
//                 .userDetailsService(myUserService())
//                 .passwordEncoder(passwordEncoder())
//                 .and()
//                 .build();
//     }

// }