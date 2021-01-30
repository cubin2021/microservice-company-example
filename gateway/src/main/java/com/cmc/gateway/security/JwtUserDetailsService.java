package com.cmc.gateway.security;

import java.util.ArrayList;
import java.util.List;

import com.cmc.gateway.model.UserRole;
import com.cmc.gateway.repository.UserRepository;
import com.cmc.gateway.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRoleService userRoleService;

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        com.cmc.gateway.model.User user = userRepository.loadUserByUsername(username);

        if (user != null && user.getUserId() != null) {
            List<String> roles = userRoleService.findRoleByUserId(user.getUserId());
            if(roles != null && !roles.isEmpty())
                return User.builder().username(user.getUserName()).password(user.getPassword()).roles(roles.toArray(new String[roles.size()])).build();
            else throw new UsernameNotFoundException("User not found with username: " + username);
        } else throw new UsernameNotFoundException("User not found with username: " + username);
    }
}
