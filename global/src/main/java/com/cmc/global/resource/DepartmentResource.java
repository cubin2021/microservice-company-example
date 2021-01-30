package com.cmc.global.resource;

import com.cmc.global.model.Department;
import com.cmc.global.model.ErrorCodeMapper;
import com.cmc.global.model.HttpResponse;
import com.cmc.global.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/global-service")
public class DepartmentResource {

    @Autowired
    public DepartmentRepository departmentRepository;

    @GetMapping("/findDpartment/{departmentCode}")
    public HttpResponse findDepartment(@PathVariable String departmentCode) {
        try {
            List<Department> lstDepartment = departmentRepository.findDepartmentByDepartmentCode(departmentCode);
            return HttpResponse.builder()
                    .errorCode(ErrorCodeMapper.SUCCESS.getErrorCode())
                    .message(ErrorCodeMapper.SUCCESS.getMessage())
                    .data(lstDepartment).build();
        } catch (Exception e) {
            return HttpResponse.builder()
                    .errorCode(ErrorCodeMapper.FAIL.getErrorCode())
                    .message(ErrorCodeMapper.FAIL.getMessage()).build();
        }
    }
}
