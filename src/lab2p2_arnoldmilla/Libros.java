package lab2p2_arnoldmilla;

import java.util.ArrayList;
import java.util.Date;


public class Libros {
    private String titulo, autor, genero,disponibilidad;
    private Date publicacion;
    
    public Libros(String titulo, String autor, String genero, String disponibilidad, Date publicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.disponibilidad = disponibilidad;
        this.publicacion = publicacion;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setDisponibilidad(String disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    
    public String getDisponibilidad(){
        return disponibilidad;
    }
    
    public void setPublicacion(Date publicacion){
        this.publicacion = publicacion;
    }
    
    public Date getPublicacion(){
        return publicacion;
    }
    
   @Override
    public String toString(){
        return "Titulo: " + titulo + "autor: " + autor + "genero :" + genero + "disponibilidad :" + disponibilidad + "fecha de publicacion: " + publicacion;
    }
    
    
    
}
