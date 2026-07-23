package com.mohammed.devops_webapp.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class VersionService {

    public Map<String, String> getVersionInfo() {

        Map<String, String> info = new HashMap<>();

        info.put("application", "DevOps WebApp");
        info.put("version", "1.0.0");
        info.put("author", "Mohammed Farooq");

        return info;
    }
}