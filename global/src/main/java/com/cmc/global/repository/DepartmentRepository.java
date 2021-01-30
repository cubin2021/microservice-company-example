package com.cmc.global.repository;

import com.cmc.global.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    @Query("select d from Department d  where d.departmentCode = :departmentCode")
    List<Department> findDepartmentByDepartmentCode(@Param("departmentCode") String departmentCode);

}
