package com.cmc.gateway.service;

import com.cmc.gateway.model.UserRole;
import com.cmc.gateway.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    public List<String> findRoleByUserId(Integer userId) {
        return userRoleRepository.findUserRoleByUsername(userId);
    }
}
