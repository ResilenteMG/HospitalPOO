
public class Estudiante extends Characters implements IDoctor {
    private String cursoActual;

    public Estudiante(String nombre, int edad, String id, String cursoActual) {
        super(nombre, edad, id);
        this.cursoActual = cursoActual;
    }

    @Override
    public void horasTrabajoSemanal() {
        System.out.println("El estudiante " + getNombre() + " realiza 20 horas de guardia como parte de " + cursoActual + ".");
    }

    @Override
    public void comer() {
        System.out.println("Comiendo algo rápido en la cafetería universitaria.");
    }

    // Método propio
    public void horasEstudioSemanal() {
        System.out.println("Dedicando 15 horas de estudio a la teoría médica.");
    }
}