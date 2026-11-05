
public class Main {
    public static void main(String[] args) {

        Tarea tarea1 = new Tarea("Estudiar programación");

        Tarea tarea2 = new Tarea("Realizar trabajo de matemáticas", 1);

        Tarea tarea3 = new Tarea("Organizar apuntes", 3);

        System.out.println("LISTA DE TAREAS");

        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();

        tarea1.setPrioridad(1);

        tarea1.marcarComoCompletada();
        tarea2.marcarComoCompletada();

        System.out.println("TAREAS ACTUALIZADAS");

        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();
    }
}
