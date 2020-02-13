package modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CUENTA {
 
    private String numero_cuenta;
    private String cvv;
    private float saldo;

    public CUENTA(String numero_cuenta, String cvv, float saldo) {
        this.numero_cuenta = numero_cuenta;
        this.cvv = cvv;
        this.saldo = saldo;
    }  
    
    
    public boolean debitar(float monto){
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No Tiene dinero suficiente en la cuenta");
            return false;
        } 
    }

    public void acreditar(float monto){
        this.saldo += monto;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public String getCvv() {
        return cvv;
    }

    public float getSaldo() {
        return saldo;
    }
    @Override
    public String toString() {
        return numero_cuenta + "|" + cvv + "|" + saldo;
    }
    
}
