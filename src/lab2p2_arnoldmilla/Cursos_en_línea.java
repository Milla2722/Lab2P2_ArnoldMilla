package lab2p2_arnoldmilla;

public class Cursos_en_línea {
    private String titulo, instructor, duracion, plataforma;
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setInstructor(String instructor){
        this.instructor = instructor;
    }
    
    public String getInstructor(){
        return instructor;
    }
    
    public void setDuracion(String duracion){
        this.duracion = duracion;
    }
    
    public String getDuracion(){
        return duracion;
    }
    
    public void setPlataforma(String titulo){
        this.titulo = titulo;
    }
    
    public String getPlataforma(){
        return titulo;
    }
    
    @Override
    public String toString(){
        return "Titulo: " + titulo + " instructor: " + instructor + " duracion en semanas:" + duracion + " plataforma:" + plataforma;
    }
}
