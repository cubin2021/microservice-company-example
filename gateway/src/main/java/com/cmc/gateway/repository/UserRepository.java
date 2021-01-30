package com.cmc.gateway.repository;

import com.cmc.gateway.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.userName = :userName")
    User loadUserByUsername(@Param("userName") String userName);
}
