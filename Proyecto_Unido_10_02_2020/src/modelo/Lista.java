package modelo;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Lista {

    private NodoConductor raiz;

    public Lista() {
        this.raiz = null;
    }

    public Lista(NodoConductor raiz) {
        this.raiz = raiz;
    }

    public void setRaiz(NodoConductor raiz) {
        this.raiz = raiz;
    }

    public NodoConductor getRaiz() {
        return raiz;
    }

    private boolean listaVacia() {
        return this.raiz == null;
    }



    public DatosConductor buscarConductor(String id) {
        boolean b = false;
        DatosConductor aux = null;
        if (this.listaVacia()) {
              return null;
        } else {
            NodoConductor p = this.raiz;
            NodoConductor q = p;
            while (p != null) {
                if (p.getViaje().getCedulaConductor().equals(id)) {
                    aux = p.getViaje();
                    b = true;
                    break;
                } else {
                    q = p;
                    p = p.getEnlace();
                }
            }
        }
        if (b == false) {
               return null;
        }
        return aux;
    }

    public void agregarConductor(DatosConductor nuevo) {

        boolean b = false;
        if (this.listaVacia()) {
            this.raiz = new NodoConductor(nuevo);
        } else {
            NodoConductor p = this.raiz;
            NodoConductor q = p;
            NodoConductor r = new NodoConductor(nuevo);
            while (p != null) {
                if (r.getViaje().equals(p.getViaje())) {
                    if (r.getViaje().getNombreConductor().equals(p.getViaje().getNombreConductor())
                            && r.getViaje().getApellidoConductor().equals(p.getViaje().getApellidoConductor())) {
                        JOptionPane.showMessageDialog(null, "El conductor ya se encuentra en la lista!",
                                "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else if (p == this.raiz) {
                        this.raiz = r;
                        r.setEnlace(p);
                        b = true;
                        break;
                    } else {
                        q.setEnlace(r);
                        r.setEnlace(p);
                        b = true;
                        break;
                    }
                } else {
                    q = p;
                    p = p.getEnlace();
                }
            }
            if (b == false) {
                q.setEnlace(r);
            }
        }
    }
    
    public LinkedList<DatosConductor> listadoViajes() {
        LinkedList<DatosConductor> aux = new LinkedList<>();
        NodoConductor p = this.raiz;
        while (p != null) {
            aux.add(p.getViaje());
            p = p.getEnlace();
        }
        return aux;
    }


    @Override
    public String toString() {
        String result = "";
        NodoConductor aux = this.raiz;
        while (aux != null) {
            DatosConductor t = aux.getViaje();
            result += t.toString() + "\n";
            aux = aux.getEnlace();
        }
        return result;
    }

}
