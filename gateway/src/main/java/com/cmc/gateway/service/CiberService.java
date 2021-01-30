package com.cmc.gateway.service;

import com.cmc.gateway.model.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CiberService {

    @Autowired
    private RestTemplate restTemplate;

    public HttpResponse getDepartmentByDepartmentCode(String departmentCode) {
        return restTemplate.getForObject("http://ciber:2000/ciber-service/findDpartment/{departmentCode}", HttpResponse.class, departmentCode);
    }
}
