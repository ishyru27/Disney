
package com.mundodisney.alkemy.service;

import com.mundodisney.alkemy.InterfaceService.IPeliculaService;
import com.mundodisney.alkemy.interfaces.IPelicula;
import com.mundodisney.alkemy.modelo.Pelicula;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService implements IPeliculaService{
    
    @Autowired
    private IPelicula data;
    
    
    @Override
    public List<Pelicula> listar() {
        return (List<Pelicula>) data.findAll(); 
    }
    @Override
    public Optional<Pelicula> listarId(int id_pelicula) {
            return data.findById(id_pelicula);
    }

    @Override
    public int save(Pelicula p) {
        int res=0;
       Pelicula pelicula=data.save(p);
        if (!pelicula.equals(null)) {
            res=1;
        }
        return res; 
    }

    @Override
    public void delete(int id_pelicula) {
       data.deleteById(id_pelicula);
    }

    
    
}
