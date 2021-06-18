
package com.mundodisney.alkemy.interfaces;

import com.mundodisney.alkemy.modelo.Personaje;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaje extends CrudRepository<Personaje,Integer>{
    
}
