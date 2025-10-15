public class AireAcondicionado extends VehiculoDecorator {

    public AireAcondicionado(Vehiculo vehiculo) {
        super(vehiculo);
    }

    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Aire Acondicionado";
    }

    public double getCosto() {
        return vehiculo.getCosto() + 1800;
    }
}
