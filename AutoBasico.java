public class AutoBasico implements Vehiculo {
    private String modelo;
    private String marca;
    private int anio;

    public AutoBasico(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getDescripcion() {
        return marca + " " + modelo + " (" + anio + ")";
    }

    public double getCosto() {
        return 25000;
    }

    public String getModelo() {
        return modelo;
    }
}
