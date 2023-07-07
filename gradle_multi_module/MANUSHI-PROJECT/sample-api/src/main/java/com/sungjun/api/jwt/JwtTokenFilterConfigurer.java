//package com.sungjun.api.jwt;
//
//import com.sungjun.api.jwt.JwtTokenFilter;
//import com.sungjun.api.jwt.JwtTokenProvider;
//import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.DefaultSecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//public class JwtTokenFilterConfigurer extends SecurityConfigurerAdapter<DefaultSecurityFilterChain, HttpSecurity> {
//    private final JwtTokenProvider jwtTokenProvider;
//
//    public JwtTokenFilterConfigurer(JwtTokenProvider jwtTokenProvider) {
//        this.jwtTokenProvider = jwtTokenProvider;
//    }
//
//    /**
//     * <p>By this method we configure</p>
//     *
//     * @param http
//     */
//    @Override
//    public void configure(HttpSecurity http) {
//        JwtTokenFilter customFilter = new JwtTokenFilter(jwtTokenProvider);
//        http.addFilterBefore(customFilter, UsernamePasswordAuthenticationFilter.class);
//    }
//
//}
