

package LogicBusiness;
import java.util.Scanner;
import data.Carrera;
import data.Curso;
import data.Docente;
import data.Edificio;
import data.Estudiante;
import data.Facultad;
import data.Grupo;
import data.Nota;
import data.Salon;

public class Asignacion{    
    public static void ingreso(){ 
        Scanner entrada= new Scanner(System.in);
        int x;
   //Estudiantes
   Estudiante maria=new Estudiante(4.2,33205299,"marola22","Maria",null,null,"Rodriguez Lara",null);
   Estudiante luisa=new Estudiante(3.9,23145678,"luisav11","Luisa",null,null,"Vasquez",null);
    //Facultad
    Facultad ingenieria=new Facultad("Ingenieria",null,null,null,null);
    Facultad ciencias=new Facultad("Ciencias",null,null,null,null);
    //Edificio
    Edificio julioGaravito=new Edificio(401,"Julio Garavito",null,null);
    Edificio fem=new Edificio(404,"Fisica Estadistica y Matematicas",null,null);
    //Carreras
    Carrera ingenieriaElectronica = new Carrera("ingenieria electronica",null,null);
    Carrera matematicas =new Carrera("matematicas",null,null);
    //Docentes
    Docente guillermo =new Docente(1022381594,"guillermo antnio","padilla calvo",null,null,null);
    Docente arturo =new Docente(34321511,"arturo jose","cediel castro",null,null,null);
    //Cursos
    Curso poo12=new Curso(1216654,"programacion orienteda a objetos 12",null,null);
    Curso poo11=new Curso(121312,"programacion orienteda a objetos 15",null,null);
    //Notas
    Nota programacion12=new Nota(4.5,null,null);
    Nota programacion15=new Nota(3.9,null);
    //Salones
    Salon salon454404=new Salon(404,null,null,null);
    Salon salon454403=new Salon(403,null,null);
    //Grupos
    Grupo objetos12=new Grupo(22012, null,null, "segundosemestre", poo12, null,null,null);
    Grupo objetos15=new Grupo(22015, null,null, poo12, null,null,null);
    
        System.out.println("Bienvenido a la Universidad Nacional de Colombia");
        System.out.println("Acontinuacion se le presenta un menú de opciones para que pueda "
                + "visualizar las distintas dependencias del campus. Escoja el numero correspondiente a su opción.");
        System.out.println("1. Estudiante");
        System.out.println("2. Docentes");
        System.out.println("3. Grupos");
        System.out.println("4. Cursos");
        System.out.println("5. Facultades");
        System.out.println("6. Salones");
        System.out.println("7. Edificios");
        System.out.println("8. Notas");
        System.out.println("9. Carreras");
        System.out.println("0. Salir");
        do{
            x=entrada.nextInt();
        switch(x){
            
        case 1:System.out.println("\nESTUDIANTES:");
               System.out.println("----------");
               System.out.println(maria);
               System.out.println("----------");
               System.out.println(luisa);
               System.out.println("----------");
               break;
        case 2:System.out.println("\nDOCENTES:");
               System.out.println("----------");
               System.out.println(guillermo);
               System.out.println("---------");
               System.out.println(arturo);
               System.out.println("----------");
               break;
        case 3:System.out.println("\nGRUPOS:");
               System.out.println("----------");
               System.out.println(objetos12);
               System.out.println("---------");
               System.out.println(objetos15);
               System.out.println("----------");
               break;
        case 4:System.out.println("\nCURSOS:");
               System.out.println("----------");
               System.out.println(poo12);
               System.out.println("----------");
               System.out.println(poo11);
               System.out.println("----------");
               break;
        case 5:System.out.println("\nFACULTADES:");
               System.out.println("----------");
               System.out.println(ingenieria);
               System.out.println("---------");
               System.out.println(ciencias);
               System.out.println("----------");
               break;
        case 6:System.out.println("\nSALONES:");
               System.out.println("----------");
               System.out.println(salon454404);
               System.out.println("----------");
               System.out.println(salon454403);
               System.out.println("----------");
               break;
            
        case 7:System.out.println("\nEDIFICIOS:");
               System.out.println("----------");
               System.out.println(julioGaravito);
               System.out.println("----------");
               System.out.println(fem);
               System.out.println("----------");
                break;
        case 8:System.out.println("\nNOTAS:");
               System.out.println("----------");
               System.out.println(programacion12);
               System.out.println("----------");
               System.out.println(programacion15);
               System.out.println("----------");
               break;
        case 9:System.out.println("\nCARRERAS:");
               System.out.println("----------");
               System.out.println(ingenieriaElectronica);
               System.out.println("----------");
               System.out.println(matematicas);
               System.out.println("----------");
               break;
        default: break;
        }
       }while(x!=0);
    }
    
 }
        
