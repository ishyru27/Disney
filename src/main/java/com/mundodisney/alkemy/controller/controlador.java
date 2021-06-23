
package com.mundodisney.alkemy.controller;


import com.mundodisney.alkemy.InterfaceServive.IPersonajeService;
import com.mundodisney.alkemy.modelo.Personaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controlador {
    
    @Autowired
    private IPersonajeService service;
    
    @GetMapping("/characters")
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
        return "redirect:/characters";
    }
    
    @GetMapping("/edit/{id_personaje}")
    public String editar(@PathVariable int id_personaje, Model model){
        Optional<Personaje>personaje=service.listarId(id_personaje);
        model.addAttribute("personaje", personaje);
        return "form";
    }
    @GetMapping("delete/{id_personaje}")
    public String delete(Model model, @PathVariable int id_personaje){
        service.delete(id_personaje);
        return "redirect:/characters";
    }
    
    
    
}
