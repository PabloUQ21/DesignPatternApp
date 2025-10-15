public class Main {
    public static void main(String[] args) {
        // Crear el sistema externo y adaptarlo
        SistemaExternoDiagnostico externo = new SistemaExternoDiagnostico();
        SistemaDiagnostico adaptado = new AdaptadorDiagnostico(externo);

        // Crear la fachada del taller
        TallerFacade taller = new TallerFacade(adaptado);

        // Probar distintos casos
        taller.registrarYRevisarVehiculo("Toyota", "Corolla", 2021, true, true, false);
        taller.registrarYRevisarVehiculo("Ford", "Ranger", 2020, false, true, true);
        taller.registrarYRevisarVehiculo("Chevrolet", "Spark", 2018, false, false, false);
    }
}
