package com.mohammed.devops_webapp;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mohammed.devops_webapp.service.VersionService;

@RestController
public class ApiController {

    @Autowired
    private VersionService versionService;

    @GetMapping("/api/version")
    public Map<String, String> version() {
        return versionService.getVersionInfo();
    }

    @GetMapping("/api/health")
    public Map<String, String> health() {

        java.util.Map<String, String> healthInfo = new java.util.HashMap<>();

        healthInfo.put("status", "UP");
        healthInfo.put("service", "DevOps WebApp");

        return healthInfo;
    }
}