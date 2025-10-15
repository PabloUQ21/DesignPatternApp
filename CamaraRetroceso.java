public class CamaraRetroceso extends VehiculoDecorator {

    public CamaraRetroceso(Vehiculo vehiculo) {
        super(vehiculo);
    }

    public String getDescripcion() {
        return vehiculo.getDescripcion() + " + Cámara de Retroceso";
    }

    public double getCosto() {
        return vehiculo.getCosto() + 700;
    }
}
