
package com.mundodisney.alkemy.service;

import com.mundodisney.alkemy.interfaces.IPersonaje;
import com.mundodisney.alkemy.InterfaceServive.IPersonajeService;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id_personaje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
}
