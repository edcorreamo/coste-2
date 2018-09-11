
package data;

import java.util.Date;
import java.util.List;

public class Estudiante {
    //Atributos
    private Nota nota;
    private double papa;
    private int id;
    private String usuario;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private List<Grupo> asistencia;
     //CONSTRUCTOR
    public Estudiante(Nota nota,double papa,int id,String usuario,String nombre,
            String apellido,Date fechaNacimiento,List<Grupo> asistencia){
    
   this.setNota(nota);
   this.setPapa(papa);
   this.setId(id);
   this.setUsuario(usuario);
   this.setNombre(nombre);
   this.setApellido(apellido);
   this.setFechaNacimiento(fechaNacimiento);
   this.setAsistencia(asistencia);
    } 
                     
    //Get
    public Nota getNota(){
    return this.nota;
    }  
    public double getPapa(){ 
     return this.papa;
    }
    public int getId(){ 
    return this.id;
    }
     public String getUsuario(){ 
    return this.usuario;
     }
    public String getNombre(){ 
    return this.nombre;
    }
    public String getApellido(){ 
    return this.apellido;
    } 
    public Date getFechaNacimiento(){
    return this.fechaNacimiento;
    }
    public List<Grupo> getAsistencia(){
    return this.asistencia;
    }
    
       //Set  
    public void setNota(Nota nota){
    this.nota=nota;
    }
    public void setPapa(double papa){ 
    this.papa=papa;
    }
    public void setId(int id){ 
    this.id=id;
    }
    public void setUsuario(String usuario){ 
    this.usuario=usuario;
    }
    public void setNombre(String nombre){ 
    this.nombre=nombre;
    }
    public void setApellido(String apellido){ 
    this.apellido=apellido;
    } 
    public void setFechaNacimiento(Date fechaNacimiento){
    this.fechaNacimiento=fechaNacimiento;     
    }
    public void setAsistencia(List<Grupo> asistencia){
    this.asistencia=asistencia;
    }
    
 @Override
   public String toString(){
   String printer="nombre: "+this.getNombre()+"/n"+ "Nota: "+ getNota()+"/n Papa: "+getPapa()+"/n"
           + "Apellido: "+getApellido()+"/n"+"Fecha de Nacimiento: "+getFechaNacimiento()+"/n"
           +"Usuario: "+getUsuario()+"/n"+"Asistencia: "+getAsistencia()+"/n"+getId();
    return printer;
    }
}