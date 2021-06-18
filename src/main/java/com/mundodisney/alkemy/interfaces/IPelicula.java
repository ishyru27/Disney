
package com.mundodisney.alkemy.interfaces;

import com.mundodisney.alkemy.modelo.Pelicula;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPelicula extends CrudRepository<Pelicula,Integer>{
    
}
