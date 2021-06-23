
package com.mundodisney.alkemy.modelo;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pelicula")
public class Pelicula {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_pelicula;
    @Lob
    private byte[] imagen;
    private String titulo;
    private Date fechaCreacion;
    private String calificacion;
    
    @OneToOne(cascade={CascadeType.ALL})
    @JoinColumn(name="id_personaje")
    private Personaje personaje;

    public Pelicula() {
    }

    public Pelicula(int id_pelicula, byte[] imagen, String titulo, Date fechaCreacion, String calificacion, Personaje personaje) {
        this.id_pelicula = id_pelicula;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
        this.personaje = personaje;
    }

    public int getId_pelicula() {
        return id_pelicula;
    }

    public void setId_pelicula(int id_pelicula) {
        this.id_pelicula = id_pelicula;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id_pelicula=" + id_pelicula + ", imagen=" + imagen + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", calificacion=" + calificacion + ", personaje=" + personaje + '}';
    }

   

   
    
}
