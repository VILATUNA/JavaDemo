package ejecutable;


import controlador.LeerListaConductor;
import vistas.PRINCIPAL;


public class Ejecutable {
    
    public static void main(String[] args) {

//      LeerListaConductor obj = new LeerListaConductor();       
//      obj.leerArchivo("172526388-1");
        PRINCIPAL p = new PRINCIPAL();
        p.setLocationRelativeTo(null);
        p.setVisible(true);
      
    }
    
}
