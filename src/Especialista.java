public class Especialista extends Characters implements IDoctor {
    private String especialidad;

    public Especialista(String nombre, int edad, String id, String especialidad) {
        super(nombre, edad, id); // Llama al constructor de la madre
        this.especialidad = especialidad;
    }


    @Override
    public void horasTrabajoSemanal() {
        System.out.println("El Especialista " + getNombre() + " trabaja 40 horas en el área de " + especialidad + ".");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo en el comedor de personal médico.");
    }


    public void vacaciones() {
        System.out.println("El especialista solicita vacaciones pagadas.");
    }
}