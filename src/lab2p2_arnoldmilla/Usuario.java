package lab2p2_arnoldmilla;


public class Usuario {
    private String usuario, contraseña, tipo;
    
    public Usuario(String usuario, String contraseña, String tipo){
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tipo = tipo;      
    }
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public String getUsuario(){
        return usuario;
    }
    
    public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }
    
    public String getContraseña(){
        return contraseña;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    @Override
    public String toString(){
        return "Usuario: " + usuario + " contraseña: " + contraseña + " tipo de usuario: " + tipo;
    }
}
