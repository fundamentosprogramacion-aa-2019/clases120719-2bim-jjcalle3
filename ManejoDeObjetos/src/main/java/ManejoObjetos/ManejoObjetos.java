/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejoObjetos;
import Institucion.Docente;
import Institucion.Asignatura;


/**
 *
 * @author COMPUMARS
 */
public class ManejoObjetos {
    
    public static void main(String[] args){
        
        Docente d = new Docente();
        d.establecerNombre("Rodrigo Estrada");
        d.establecerAnioExperienciaDocente(10);
        d.establecerEdad(30);
        
        Docente d2 = new Docente();
        d2.establecerNombre ("Jhon Calle");
        d2.establecerAnioExperienciaDocente(5);
        d.establecerEdad(31);
        
        Asignatura a1 = new Asignatura();
        a1.establecerNombre ("Programación");
        a1.establecerHorario ("Viernes: 8-11");
        a1.establecerCreditos (4);
        a1.establecerDocente (d);
        
        Asignatura a2 = new Asignatura();
        a2.establecerNombre("Base de Datos");
        a2.establecerHorario("Jueves: 10-13");
        a2.establecerCreditos(3);
        a2.establecerDocente(d2);
        
        Asignatura [] lista = new Asignatura[2];
        lista[0] = a1;
        lista[1] = a2;
        
        for(int i=0; i<lista.length; i++) {
            System.out.printf("Asignatura: %s\nDocente:\n\tNombre: %s" 
                    + "\n\tEdad: d\n", 
                    lista [i].obtenerDocente(),
                    lista[i].obtenerDocente().obtenerNombre(),
                    lista[i].obtenerDocente().obtenerEdad());
            
        }
    }
    
    
    
}
