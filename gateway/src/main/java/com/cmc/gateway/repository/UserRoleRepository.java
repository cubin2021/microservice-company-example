package com.cmc.gateway.repository;

import com.cmc.gateway.model.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserRoleRepository {

    @Select("select r.role_code from user_role ur inner join role r on ur.role_id = r.role_id where ur.user_id = #{userId}")
    List<String> findUserRoleByUsername(@Param("userId") Integer userId);
}
