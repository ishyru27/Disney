
package com.mundodisney.alkemy.InterfaceService;

import com.mundodisney.alkemy.modelo.Pelicula;
import java.util.List;
import java.util.Optional;

public interface IPeliculaService {
     
    public List<Pelicula>listar();
    public Optional<Pelicula>listarId(int id_pelicula);
    public int save(Pelicula p);
    public void delete(int id_pelicula);
}
