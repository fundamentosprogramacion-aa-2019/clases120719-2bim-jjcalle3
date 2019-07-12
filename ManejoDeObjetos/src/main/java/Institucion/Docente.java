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
public class Docente {
    private String nombre;
    private int anioExperienciaDocente;
    private int edad;
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerAnioExperienciaDocente(int n){
        anioExperienciaDocente = n;
    }
    
    public void establecerEdad(int n){
        edad = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerAnioExperienciaDocente(){
        return anioExperienciaDocente;
    }
    
    public int obtenerEdad(){
        return edad;
    }
}
    
    
