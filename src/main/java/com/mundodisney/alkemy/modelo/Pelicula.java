
package com.mundodisney.alkemy.modelo;

import java.util.Date;
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
    private int id;
    @Lob
    private byte[] imagen;
    private String titulo;
    private Date fecha;
    private String calificacion;

    public Pelicula() {
    }

    public Pelicula(byte[] imagen, String titulo, Date fecha, String calificacion) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha = fecha;
        this.calificacion = calificacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "id=" + id + ", imagen=" + imagen + ", titulo=" + titulo + ", fecha=" + fecha + ", calificacion=" + calificacion + '}';
    }
    
    
    
}
