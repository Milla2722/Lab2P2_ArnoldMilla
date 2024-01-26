package lab2p2_arnoldmilla;
import java.util.*;
import javax.swing.JOptionPane;


public class Lab2P2_ArnoldMilla {

    
    public static void main(String[] args) {
        ArrayList Recursos = new ArrayList();
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "-----------Ménu----------\n"
                + "1. Listar Recursos \n"
                + "2. Crear Recurso \n"
                + "3. Eliminar Recurso \n"
                + "4. Modificar Recurso \n"
                + "5. Salir"));
        while (opc != 5){
            switch (opc){
                case 1:{///Listar Recursos
                    JOptionPane.showMessageDialog(null, PrintRecursos(Recursos));
                }break;
                
                case 2:{////Crear Recurso
                    int rec = recurso();
                    switch (rec){
                        case 1:{//Agregar un libro
                            String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo");
                            String autor = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor");
                            String genero = JOptionPane.showInputDialog(null, "Ingrese el genero del libro");
                            String disponibilidad = JOptionPane.showInputDialog(null, "Ingrese la disponibilidad del libro [si/no]");
                            String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de publicacion del libro en formato MM/dd/yyyy");
                            Recursos.add(new Libros(titulo, autor, genero, disponibilidad, fecha));
                        }break;
                        
                        case 2:{//Agregar un articulo
                            
                        }break;
                        
                        case 3:{// agregar un curso en linea
                        
                        }break;
                        
                        case 4:{//conferencia virtual
                        
                        }break;
                                              
                    }
                }break;///fin de crear un recurso
                
                case 3:{///Eliminar Recurso
                    int pos = Integer.parseInt(JOptionPane.showInputDialog(null, PrintRecursos(Recursos) + "\n" + "Ingrese la posicion del recurso que quiere eliminar"));
                    if (pos < 0 || pos >= Recursos.size()){
                        JOptionPane.showMessageDialog(null, "Posicion no valida");
                    }
                    else{
                        Recursos.remove(pos);
                    }                   
                }break;
                
                case 4:{///Modificar Recurso
                    int pos = Integer.parseInt(JOptionPane.showInputDialog(null, PrintRecursos(Recursos) + "\n" + "Ingrese la posicion del recurso que quiere modificar"));
                    if (pos < 0 || pos >= Recursos.size()){
                        JOptionPane.showMessageDialog(null, "Posicion no valida");
                    }
                    else{
                        int rec = recurso();
                        switch (rec){
                        case 1:{//modif un libro
                            String titulo = JOptionPane.showInputDialog(null, "Ingrese el titulo");
                            String autor = JOptionPane.showInputDialog(null, "Ingrese el nombre del autor");
                            String genero = JOptionPane.showInputDialog(null, "Ingrese el genero del libro");
                            String disponibilidad = JOptionPane.showInputDialog(null, "Ingrese la disponibilidad del libro [si/no]");
                            String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de publicacion del libro en formato MM/dd/yyyy");
                            Recursos.set(pos, new Libros(titulo, autor, genero, disponibilidad, fecha));
                        }break;
                        
                        case 2:{//modif un articulo
                        
                        }break;
                        
                        case 3:{//modif un curso en linea
                        
                        }break;
                        
                        case 4:{//modif una conferencia virtual
                        
                        }break;
                                              
                        }
                    }                   
                }break;
                
            }
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, "-----------Ménu----------\n"
                + "1. Listar Recursos \n"
                + "2. Crear Recurso \n"
                + "3. Eliminar Recurso \n"
                + "4. Modificar Recurso \n"
                + "5. Salir"));
        }
            
    }
    
    public static String PrintRecursos(ArrayList Recursos){
        String rec = "";
                    for (int contador = 0; contador < Recursos.size(); contador++) {
                        rec += contador + ". " + Recursos.get(contador) + "\n";
                    }
        return rec;
    }
    
    public static Integer recurso(){
        int recurso = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tipo de recurso que quiere ingresar \n"
                            + "1. Libro \n"
                            + "2. Articulos \n"
                            + "3. Cursos en linea \n"
                            + "4. Conferencias virtuales"));
        
        return recurso;
    }
    
}
