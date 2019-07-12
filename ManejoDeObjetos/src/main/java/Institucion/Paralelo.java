/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Institucion;

/**
 *
 * @author COMPUMARS
 */
public class Paralelo {
    private String nombre;
    private Asignatura [] lista;
    
public void establecerLista(Asignatura[] n){
    lista = n;
}

public Asignatura[] obtenerLista(){
    return lista;
}
public void establecerNombre(String n){
    nombre = n;
}

public String obtenerNombre(){
    return nombre;
}




    
}
