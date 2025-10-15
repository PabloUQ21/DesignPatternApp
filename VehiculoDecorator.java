public abstract class VehiculoDecorator implements Vehiculo {
    protected Vehiculo vehiculo;

    public VehiculoDecorator(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getModelo() {
        return vehiculo.getModelo();
    }
}
