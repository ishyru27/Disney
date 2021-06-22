
package com.mundodisney.alkemy.modelo;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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

    public Pelicula() {
    }

    public Pelicula(byte[] imagen, String titulo, Date fechaCreacion, String calificacion) {
        this.id_pelicula = id_pelicula;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fechaCreacion = fechaCreacion;
        this.calificacion = calificacion;
    }

    public int getId_pelicula() {
        return id_pelicula;
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

    @Override
    public String toString() {
        return "Pelicula{" + "id_pelicula=" + id_pelicula + ", imagen=" + imagen + ", titulo=" + titulo + ", fechaCreacion=" + fechaCreacion + ", calificacion=" + calificacion + '}';
    }
   
    
    

   
    
}
