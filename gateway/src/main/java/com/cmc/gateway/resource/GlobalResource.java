package com.cmc.gateway.resource;

import com.cmc.gateway.model.HttpResponse;
import com.cmc.gateway.service.GlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/global")
public class GlobalResource {

    @Autowired
    private GlobalService globalService;

    @GetMapping(value = "/department/{departmentCode}")
    public HttpResponse getDepartment(@PathVariable String departmentCode) {

        return globalService.getDepartmentByDepartmentCode(departmentCode);
    }
}
