/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.models;

import java.util.ArrayList;

/**
 *
 * @author joaqu
 */
public class Paciente extends Persona{
    private String email;
    private Cita cita;
    private HistoriaClinica historiaClinica;
    private ArrayList<Receta> recetas;
    
    public boolean solicitarCita(){
      return true;  
    }
}
