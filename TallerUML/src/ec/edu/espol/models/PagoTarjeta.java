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
public class PagoTarjeta implements Pago{
    private float monto;
    private String numero;
    private Date expira;
    private String propietario;
    private String banco;

    @Override
    public boolean realizarPago(float monto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
