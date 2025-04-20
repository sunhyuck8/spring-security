# 스프링 시큐리티 Chapter 2

## 소개
이 브랜치는 스프링 시큐리티의 기본 인증 기능을 구현한 예제 코드입니다.

## 주요 기능

1. 기본 인증 방식 구현
   - Form 로그인 설정
   - HTTP Basic 인증 설정

2. 권한 설정
   - URL 기반 권한 설정
   - 로그인 페이지 접근 허용
   - 나머지 요청은 인증 필요

## 핵심 코드

### SecurityConfig.java
```java
@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorizeRequests ->
                authorizeRequests
                        .requestMatchers("/login").permitAll()
                        .anyRequest().authenticated()
                )
             .formLogin(Customizer.withDefaults())
             .httpBasic(Customizer.withDefaults());

        return http.build();
    }
}
```

## 기술 스택
- Java 17
- Spring Boot 3.4.3
- Spring Security
- Gradle
