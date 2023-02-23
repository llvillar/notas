// package com.llv.notas.configuration;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
// import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.http.SessionCreationPolicy;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.crypto.factory.PasswordEncoderFactories;
// import org.springframework.security.crypto.password.PasswordEncoder;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;
// import org.springframework.security.web.SecurityFilterChain;

// import com.llv.notas.services.UserService;

// @Configuration
// // @EnableGlobalMethodSecurity(prePostEnabled = true)
// public class WebSecurityConfig {

//     @Bean
//     public PasswordEncoder passwordEncoder() {
//         return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//         // return NoOpPasswordEncoder.getInstance();
//     }

//     @Bean
//     public UserDetailsService users() {
//         UserDetails user = User.builder()
//                 .username("user")
//                 // .password(passwordEncoder().encode("kaka"))
//                 .password("{noop}kaka")
//                 .authorities("USER")
//                 .build();
//         UserDetails admin = User.builder()
//                 .username("admin")
//                 // .password(passwordEncoder().encode("kaka"))
//                 .password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
//                 .authorities("USER", "ADMIN")
//                 .build();
//         return new InMemoryUserDetailsManager(user, admin);
//     }

//     @Bean
//     UserService myUserService() {
//         return new UserService();
//     }

//     // @Bean
//     // public DaoAuthenticationProvider authenticationProvider() {
//     //     DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();

//     //     authProvider.setUserDetailsService(users());
//     //     // authProvider.setUserDetailsService(myUserService());
//     //     authProvider.setPasswordEncoder(passwordEncoder());

//     //     return authProvider;
//     // }

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         http
//             .csrf().disable()
//             .authorizeRequests()
//             .anyRequest()
//             .authenticated()
//             .and()
//             .httpBasic()
//             .and()
//             .sessionManagement()
//             .sessionCreationPolicy(SessionCreationPolicy.STATELESS);

//         return http.build();
//     }

//     @Bean 
//     AuthenticationManager authManager(HttpSecurity http) throws Exception{
//         return http.getSharedObject(AuthenticationManagerBuilder.class)
//             .userDetailsService(users())
//             .passwordEncoder(passwordEncoder())
//             .and()
//             .build();
//     }

// }