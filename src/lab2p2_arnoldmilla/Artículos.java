package lab2p2_arnoldmilla;


public class Artículos {
    private String titulo, autor, tema, acceso, publicacion;
    
    public Artículos(String titulo, String autor, String tema, String acceso, String publicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.tema= tema;
        this.acceso = acceso;
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
    
    public void setTema(String tema){
        this.tema = tema;
    }
    
    public String getTema(){
        return tema;
    }
    
    public void setAcceso(String acceso){
        this.acceso = acceso;
    }
    
    public String getAcceso(){
        return acceso;
    }
    
    public void setPublicacion(String publicacion){
        this.publicacion = publicacion;
    }
    
    public String getPublicacion(){
        return publicacion;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo + " autor: " + autor + " tema :" + tema + " acceso :" + acceso + " fecha de publicacion: " + publicacion;
    }
}
