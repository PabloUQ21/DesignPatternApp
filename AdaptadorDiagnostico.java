public class AdaptadorDiagnostico implements SistemaDiagnostico {
    private SistemaExternoDiagnostico sistemaExterno;

    public AdaptadorDiagnostico(SistemaExternoDiagnostico sistemaExterno) {
        this.sistemaExterno = sistemaExterno;
    }

    public void revisarVehiculo(Vehiculo vehiculo) {
        System.out.println("🔧 Adaptando revisión para el vehículo: " + vehiculo.getDescripcion());
        sistemaExterno.ejecutarRevision(vehiculo.getModelo());
    }
}
