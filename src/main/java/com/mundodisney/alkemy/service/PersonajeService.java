
package com.mundodisney.alkemy.service;

import com.mundodisney.alkemy.interfaces.IPersonaje;
import com.mundodisney.alkemy.InterfaceService.IPersonajeService;
import com.mundodisney.alkemy.modelo.Personaje;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService implements IPersonajeService{
    
    @Autowired
    private IPersonaje data;

    @Override
    public List<Personaje> listar() {
         return (List<Personaje>) data.findAll(); 
    }

    @Override
    public Optional<Personaje> listarId(int id_personaje) {
         return data.findById(id_personaje); 
    }

    @Override
    public int save(Personaje p) {
        int res=0;
       Personaje personaje=data.save(p);
        if (!personaje.equals(null)) {
            res=1;
        }
        return res; 
    }

    @Override
    public void delete(int id_personaje) {
        data.deleteById(id_personaje);
    }
    
    


  
}
