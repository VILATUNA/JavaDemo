
package modelo;


import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class PAGO {

    private String numCuentaConductor;
    private String numCuentaPasajero;     
    private String numCuentaEmpresa="1524 5263 7481 8596";

    public boolean acreditar_cuenta(String numero_cuenta, float monto) {
        boolean estado = false;
        ArrayList<CUENTA> cuenta = new Genera_Cuenta().generaCuentas();
        for (int i = 0; i < cuenta.size(); i++) {
            if (numero_cuenta.equals(cuenta.get(i).getNumero_cuenta())) {
                cuenta.get(i).acreditar(monto);
                estado = true;
                System.out.println("Se acredito correctamente: "+monto);
            }
        }
        if (estado) {
            new Genera_Cuenta().gurdaCuenta(cuenta);
        }
        return estado;
    }

    public boolean debitar_cuenta(String número_cuenta, String cvv, float monto) {
        boolean estado = false;
        ArrayList<CUENTA> cuentasDebito = new Genera_Cuenta().generaCuentas();
        for (int i = 0; i < cuentasDebito.size(); i++) {
            if (número_cuenta.equals(cuentasDebito.get(i).getNumero_cuenta())) {
                if (cuentasDebito.get(i).getCvv().equals(cvv)) {
                    if (cuentasDebito.get(i).debitar(monto)) {
                        System.out.println("Se dibito $ " + monto + " exitosamente");
                        estado = true;
                    } else {
                        System.out.println("Transaccion erronea");
                    }
                    break;
                }
            }
            if (cuentasDebito.size() - 1 == i) {
                JOptionPane.showMessageDialog(null,"Error en la Cuenta, Por Favor verificar los datos");
            }
        }
        if (estado) {
            new Genera_Cuenta().gurdaCuenta(cuentasDebito);
        }
        return estado;
    }

    public boolean debitar_cuenta(String número_cuenta, float monto) {
        boolean estado = false;
        ArrayList<CUENTA> cuentasDebito = new Genera_Cuenta().generaCuentas();
        for (int i = 0; i < cuentasDebito.size(); i++) {
            if (número_cuenta.equals(cuentasDebito.get(i).getNumero_cuenta())) {

                if (cuentasDebito.get(i).debitar(monto)) {
                    System.out.println("Se dibito $ " + monto + " exitosamente");
                    estado = true;
                } else {
                    System.out.println("Transaccion erronea");
                }
                break;

            }
            if (cuentasDebito.size() - 1 == i) {
                JOptionPane.showMessageDialog(null,"Error en la Cuenta, Por Favor verificar los datos");
            }
        }
        if (estado) {
            new Genera_Cuenta().gurdaCuenta(cuentasDebito);
        }
        return estado;
    }

    public void notifica_pago_exitoso() {
        
    }

    public void notifica_cancelacion_exitosa() {
    }

    public String getNumCuentaEmpresa() {
        return numCuentaEmpresa;
    }
}
