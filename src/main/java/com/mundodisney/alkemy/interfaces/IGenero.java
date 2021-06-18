
package com.mundodisney.alkemy.interfaces;

import com.mundodisney.alkemy.modelo.Genero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenero extends CrudRepository<Genero,Integer>{
    
}
