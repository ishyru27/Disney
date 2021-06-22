
package com.mundodisney.alkemy.controller;


import com.mundodisney.alkemy.InterfaceServive.IPersonajeService;
import com.mundodisney.alkemy.modelo.Personaje;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controlador {
    
    @Autowired
    private IPersonajeService service;
    
    @GetMapping("/character")
    public String listar(Model model){
        List<Personaje>personaje=service.listar();
        model.addAttribute("personaje", personaje);
        return "index";
    }
    @GetMapping("/new")
    public String agregar(Model model){
        model.addAttribute("personaje", new Personaje());
        return "form";
    }
     @PostMapping("/save")
    public String save(@Validated Personaje p, Model model){
        service.save(p);
        return "redirect:/character";
    }
    
    
}
