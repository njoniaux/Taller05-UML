/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espol.models;

import java.util.Date;

/**
 *
 * @author joaqu
 */
public class Cita {
    private Date fecha;
    private boolean pagada;
    private String registradoPor;
    private Paciente paciente;
    
    public void realizarPago(Pago pago){
        
    }
}
