package lab2p2_arnoldmilla;

//Tiene un título, conferencista, fecha, duración, enlace de
//acceso.
public class Conferencias_virtuales {
    private String titulo, conferencista, fecha, duracion, enlace;
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setConferencista(String conferencista){
        this.conferencista = conferencista;
    }
    
    public String getConferencista(){
        return conferencista;
    }
    
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
    
    public String getDuracion(){
        return duracion;
    }
    
    public void setEnlace(String enlace){
        this.enlace = enlace;
    }
    
    public String getEnlace(){
        return enlace;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo + " conferencista: " + conferencista + " fecha:" + fecha + " Duracion:" + duracion +" enlace a conectarse:" + enlace;
    }
}
