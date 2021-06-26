/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.models;

/**
 *
 * @author joaqu
 */
public class Doctor extends Persona{
    public int regDoctor;
    public AreaMedica areaMedica;

    public Doctor(int regDoctor, AreaMedica areaMedica) {
        this.regDoctor = regDoctor;
        this.areaMedica = areaMedica;
    }
    
    
    
    public void recetar(){
        System.out.println(this.regDoctor);
    }
    
    public void agregarPlanNut(){
        
    }
    
    public void imprimirReceta(){
        
    }
    
    public static void registraSecretaria(){
        
    }
}
