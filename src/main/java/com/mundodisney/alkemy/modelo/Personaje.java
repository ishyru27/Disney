
package com.mundodisney.alkemy.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="personaje")
public class Personaje {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_personaje;
    @Lob
    private byte[] imagen;
    private String nombre;
    private String edad;
    private String peso;
    private String historia;

    public Personaje() {
    }

    public Personaje(int id_personaje, byte[] imagen, String nombre, String edad, String peso, String historia) {
        this.id_personaje = id_personaje;
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
    }

    public int getId_personaje() {
        return id_personaje;
    }

    public void setId_personaje(int id_personaje) {
        this.id_personaje = id_personaje;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    @Override
    public String toString() {
        return "Personaje{" + "id_personaje=" + id_personaje + ", imagen=" + imagen + ", nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", historia=" + historia + '}';
    }

   
    
    
    
    
}
