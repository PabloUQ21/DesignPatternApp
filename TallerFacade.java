public class TallerFacade {
    private SistemaDiagnostico diagnostico;

    public TallerFacade(SistemaDiagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void registrarYRevisarVehiculo(String marca, String modelo, int anio, boolean aire, boolean gps, boolean camara) {
        System.out.println("🚗 Registrando vehículo en AutoService...");
        Vehiculo vehiculo = new AutoBasico(marca, modelo, anio);

        // Decorar según extras seleccionados
        if (aire) vehiculo = new AireAcondicionado(vehiculo);
        if (gps) vehiculo = new GPS(vehiculo);
        if (camara) vehiculo = new CamaraRetroceso(vehiculo);

        // Mostrar información
        System.out.println("➡ Vehículo configurado: " + vehiculo.getDescripcion());
        System.out.println("➡ Costo total estimado: $" + vehiculo.getCosto());

        // Realizar diagnóstico técnico (usando el adaptador)
        System.out.println("\n🧰 Iniciando revisión técnica...");
        diagnostico.revisarVehiculo(vehiculo);

        System.out.println("✅ Proceso completado exitosamente.");
        System.out.println("--------------------------------------------------\n");
    }
}
