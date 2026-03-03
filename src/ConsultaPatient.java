public class ConsultaPatient extends Characters implements IPatient {

    public ConsultaPatient(String nombre, int edad, String id) {
        super(nombre, edad, id);
    }


    @Override
    public void admision() {
        System.out.println("Paciente " + getNombre() + " se registra en la recepción de consultas.");
    }

    @Override
    public void habitacion() {
        System.out.println("El paciente espera su turno en la sala A.");
    }

    @Override
    public void tratamiento() {
        System.out.println("El médico receta medicamentos y reposo.");
    }

    @Override
    public void salida() {
        System.out.println("El paciente se retira con su receta médica.");
    }
}
