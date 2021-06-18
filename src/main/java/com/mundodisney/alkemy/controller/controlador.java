
package com.mundodisney.alkemy.controller;


import com.mundodisney.alkemy.InterfaceServive.IPersonajeService;
import com.mundodisney.alkemy.modelo.Personaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controlador {
    
    @Autowired
    private IPersonajeService service;
    
    @GetMapping("/listar")
    public String listar(Model model){
        List<Personaje>personajes=service.listar();
        model.addAttribute("personas", personajes);
        return "index";
    }
    
}
