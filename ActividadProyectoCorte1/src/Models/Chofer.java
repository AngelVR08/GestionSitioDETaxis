package Models;

public class Chofer {
    private String nombre;
    private String apellido;
    private Registro registro;
    private Vehiculo vehiculoAsignado;

    public Chofer(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.registro = new Registro();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void registrarServicio(Servicio servicio) {
        registro.registrarServicio(servicio);
    }

    public double calcularGanancias() {
        return registro.calcularGanancias();
    }

    public Registro getRegistro() {
        return registro;
    }

    public Vehiculo getVehiculoAsignado() {
        return vehiculoAsignado;
    }

    public void setVehiculoAsignado(Vehiculo vehiculoAsignado) {
        this.vehiculoAsignado = vehiculoAsignado;
    }
}
