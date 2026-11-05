
public class Tarea {

    private String descripcion;
    private int prioridad;
    private boolean completada;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.prioridad = 2;
        this.completada = false;
    }

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;

        if (prioridad >= 1 && prioridad <= 3) {
            this.prioridad = prioridad;
        } else {
            this.prioridad = 2;
            System.out.println("Prioridad inválida. Se asignó Media.");
        }

        this.completada = false;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setPrioridad(int nuevaPrioridad) {
        if (nuevaPrioridad >= 1 && nuevaPrioridad <= 3) {
            this.prioridad = nuevaPrioridad;
        } else {
            System.out.println("Error: La prioridad debe estar entre 1 y 3.");
        }
    }

    public void marcarComoCompletada() {
        this.completada = true;
    }

    public void mostrarEstado() {
        System.out.println("Descripción: " + descripcion);

        String nivelPrioridad;

        switch (prioridad) {
            case 1:
                nivelPrioridad = "Alta";
                break;
            case 2:
                nivelPrioridad = "Media";
                break;
            case 3:
                nivelPrioridad = "Baja";
                break;
            default:
                nivelPrioridad = "Desconocida";
        }

        System.out.println("Prioridad: " + nivelPrioridad);

        if (completada) {
            System.out.println("Estado: Completada");
        } else {
            System.out.println("Estado: Pendiente");
        }

        System.out.println("------------------------");
    }
}
