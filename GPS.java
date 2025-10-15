public class GPS extends VehiculoDecorator {

    public GPS(Vehiculo vehiculo) {
        super(vehiculo);
    }

    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Sistema GPS";
    }

    public double getCosto() {
        return vehiculo.getCosto() + 900;
    }
}
