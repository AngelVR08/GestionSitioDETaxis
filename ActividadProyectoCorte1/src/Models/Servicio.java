package Models;

public class Servicio {
    private double costo;
    private Chofer chofer;

    public Servicio(double costo) {
        this.costo = costo;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public double getCosto() {
        return costo;
    }
}