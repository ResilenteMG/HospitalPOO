public class AmbulanciaPatient extends Characters implements IPatient {

    public AmbulanciaPatient(String nombre, int edad, String id) {
        super(nombre, edad, id);
    }

    @Override
    public void admision() {
        System.out.println("¡URGENTE! " + getNombre() + " ingresa por la bahía de ambulancias.");
    }

    @Override
    public void habitacion() {
        System.out.println("Paciente ingresado directamente a la Unidad de Cuidados Intensivos.");
    }

    @Override
    public void tratamiento() {
        System.out.println("Se aplica estabilización de emergencia y monitoreo constante.");
    }

    @Override
    public void salida() {
        System.out.println("El paciente sale tras ser estabilizado por el equipo médico.");
    }
}
