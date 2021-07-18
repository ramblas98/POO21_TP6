
package poo_tp5_ej3;

import java.time.LocalDate;
import java.time.Month;

public class POO_TP5_EJ3 {

    public static void main(String[] args) {
        Programador programador = new Programador("Marco","Perales",24,LocalDate.of(1996, Month.AUGUST, 15));
        Gato gatito = new Gato();
        Perro perrito = new Perro();
        
        programador.saluda();
        gatito.saluda();
        perrito.saluda();
    }
    
}
