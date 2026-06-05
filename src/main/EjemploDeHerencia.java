package main;

import caso.Estudiante;
import caso.EstudianteDeportista;

public class EjemploDeHerencia {
    public static void main(String[] args) {

        System.out.println("Instanciando Estudiante");
        Estudiante est = new Estudiante("Mateo Cortés", "12.345.678-9", 20, "Universitario", "Av. Francisco Salazar 01145");
        System.out.println(est.toString());
        System.out.println("Instanciando Estudiante Deportista");
        EstudianteDeportista dep = new EstudianteDeportista("Francisco Torres", "98.765.432-1", 20, "Secundario", "Liceo Camilo Henríquez", "Básquetbol", 4);
        System.out.println(dep.toString());
    }
}