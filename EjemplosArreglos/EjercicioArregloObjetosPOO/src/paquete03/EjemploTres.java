
package paquete03;

import paquete01.Calificacion;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación"), 
            new Calificacion(9,"Electrónica"),
            new Calificacion(10,"Electrónica"),
            new Calificacion(9, "Electrónica")};
           
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
