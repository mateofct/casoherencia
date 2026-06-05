package caso;

public abstract class Persona {
    protected String nombre;
    protected String rut;
    private int edad;

    public Persona(String nombre, String rut, int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", RUT=" + rut + ", Edad=" + edad + "]";
    }

    protected abstract String metodo();
}