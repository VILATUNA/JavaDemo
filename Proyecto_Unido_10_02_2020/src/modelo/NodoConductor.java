package modelo;

public class NodoConductor {

    private DatosConductor conductor;
    private NodoConductor enlace;

    public NodoConductor() {
        this.conductor = new DatosConductor();
        this.enlace = new NodoConductor();
    }

    public NodoConductor(DatosConductor viaje) {
        this.conductor = viaje;
        this.enlace = null;
    }

    public NodoConductor(DatosConductor viaje, NodoConductor enlace) {
        this.conductor = viaje;
        this.enlace = enlace;
    }

    public DatosConductor getViaje() {
        return conductor;
    }

    public void setVIaje(DatosConductor viaje) {
        this.conductor = viaje;
    }

    public NodoConductor getEnlace() {
        return enlace;
    }

    public void setEnlace(NodoConductor enlace) {
        this.enlace = enlace;
    }

}
