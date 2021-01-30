package com.cmc.gateway.authorization;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Test {
    public static void main(String [] args) {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        System.out.println(bCryptPasswordEncoder.encode("123456"));
        System.out.println(bCryptPasswordEncoder.matches("123456", "$2a$10$a.zMVCOhpEziKRFfJYkpyONOg.r.fSSdXQ78MKN7x9PyiNobd208O"));
    }
}
