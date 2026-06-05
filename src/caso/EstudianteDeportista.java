package caso;

public final class EstudianteDeportista extends Estudiante {
    private String deporte;
    private int horasEntrenamiento;

    public EstudianteDeportista(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela, String deporte, int horasEntrenamiento) {
        super(nombre, rut, edad, nivelAcademico, direccionEscuela);
        this.deporte = deporte;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Deportista [Deporte=" + deporte + ", Horas semanales=" + horasEntrenamiento + "]";
    }
}