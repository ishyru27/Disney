
package com.mundodisney.alkemy.InterfaceService;
import com.mundodisney.alkemy.modelo.Personaje;
import java.util.List;
import java.util.Optional;

public interface IPersonajeService {
    
    public List<Personaje>listar();
    public Optional<Personaje>listarId(int id_personaje);
    public int save(Personaje p);
    public void delete(int id_personaje);

}
