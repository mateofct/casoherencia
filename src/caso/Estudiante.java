package caso;

public class Estudiante extends Persona {
    protected String nivelAcademico;
    protected String direccionEscuela;

    public Estudiante(String nombre, String rut, int edad, String nivelAcademico, String direccionEscuela) {
        super(nombre, rut, edad);
        this.nivelAcademico = nivelAcademico;
        this.direccionEscuela = direccionEscuela;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Estudiante [Nivel=" + nivelAcademico + ", Escuela=" + direccionEscuela + "]";
    }

    @Override
    protected String metodo() {
        return this.getClass().getSimpleName();
    }
}