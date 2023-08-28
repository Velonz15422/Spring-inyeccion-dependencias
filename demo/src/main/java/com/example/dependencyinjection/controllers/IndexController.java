package com.example.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.dependencyinjection.models.service.IServicio;

@Controller
@Primary
public class IndexController {

    @Autowired 
    private IServicio servicio; 
    
    @GetMapping({"/", "", "/index"})
    public String index (Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }

    
}
