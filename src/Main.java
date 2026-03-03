
public class Main {
    public static void main(String[] args) {


        Especialista esp1 = new Especialista("Dr. House", 45, "ESP-001", "Diagnóstico");
        Especialista esp2 = new Especialista("Dra. Grey", 38, "ESP-002", "Cirugía");


        Estudiante est1 = new Estudiante("Juan Pérez", 22, "EST-101", "Medicina Interna");
        Estudiante est2 = new Estudiante("Ana López", 23, "EST-102", "Pediatría");


        ConsultaPatient con1 = new ConsultaPatient("Roberto Gómez", 50, "PAC-201");
        ConsultaPatient con2 = new ConsultaPatient("María García", 30, "PAC-202");


        AmbulanciaPatient amb1 = new AmbulanciaPatient("Carlos Ruiz", 65, "PAC-911");
        AmbulanciaPatient amb2 = new AmbulanciaPatient("Elena Sanz", 19, "PAC-912");

        System.out.println("--- 🩺 PERSONAL MÉDICO ---");
        imprimirDoctor(esp1);
        imprimirDoctor(esp2);
        imprimirDoctor(est1);
        imprimirDoctor(est2);

        System.out.println("\n--- 🏥 PACIENTES ---");
        imprimirPaciente(con1);
        imprimirPaciente(con2);
        imprimirPaciente(amb1);
        imprimirPaciente(amb2);
    }

    // Método auxiliar para demostrar POLIMORFISMO con la Interfaz IDoctor
    public static void imprimirDoctor(IDoctor doctor) {
        // Usamos casting para acceder al nombre que está en Characters
        if (doctor instanceof Characters) {
            System.out.println("Médico: " + ((Characters) doctor).getNombre());
        }
        doctor.horasTrabajoSemanal();
        doctor.comer();
        System.out.println("-----------------------");
    }

    // Método auxiliar para demostrar POLIMORFISMO con la Interfaz IPatient
    public static void imprimirPaciente(IPatient paciente) {
        if (paciente instanceof Characters) {
            System.out.println("Paciente: " + ((Characters) paciente).getNombre());
        }
        paciente.admision();
        paciente.tratamiento();
        paciente.salida();
        System.out.println("-----------------------");
    }
}