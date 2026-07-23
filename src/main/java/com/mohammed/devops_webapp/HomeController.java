package com.mohammed.devops_webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Mohammed's DevOps Demo");
        model.addAttribute(
                "message",
                "Welcome to my Azure DevOps and Terraform project!"
        );

        return "index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About This Project");
        model.addAttribute(
                "description",
                "This project demonstrates Spring Boot, Azure DevOps, Terraform and Azure App Service."
        );

        return "about";
    }
}