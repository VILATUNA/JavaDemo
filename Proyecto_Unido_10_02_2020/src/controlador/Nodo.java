package controlador;

import modelo.DatosViaje;

public class Nodo {

    private DatosViaje viaje;
    private Nodo enlace;

    public Nodo() {
        this.viaje = new DatosViaje();
        this.enlace = new Nodo();
    }

    public Nodo(DatosViaje viaje) {
        this.viaje = viaje;
        this.enlace = null;
    }

    public Nodo(DatosViaje viaje, Nodo enlace) {
        this.viaje = viaje;
        this.enlace = enlace;
    }

    public DatosViaje getViaje() {
        return viaje;
    }

    public void setVIaje(DatosViaje viaje) {
        this.viaje = viaje;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

}
