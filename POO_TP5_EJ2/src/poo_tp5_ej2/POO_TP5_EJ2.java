
package poo_tp5_ej2;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class POO_TP5_EJ2 {

    public static void main(String[] args) {
        Empleado empleados[] = new Empleado[7];
        
        empleados[0] = new Empleado("Ana","Arroyo",LocalDate.of(2000, Month.JUNE,6),446467,2018);
        empleados[1] = new Empleado("Mario","Briasco",LocalDate.of(2001, Month.APRIL,14),21646,2017);
        empleados[2] = new Empleado("Victoria","Caceres",LocalDate.of(1999, Month.AUGUST,7),987946,2020);
        empleados[3] = new Empleado("Xavier","Zambrano",LocalDate.of(1999, Month.DECEMBER,22),32134,2012);
        empleados[4] = new Empleado("Luis","Jo",LocalDate.of(2002, Month.FEBRUARY,11),12587,2019);
        empleados[5] = new Empleado("Hortencia","Gamba",LocalDate.of(1996, Month.JANUARY,1),46487,2013);
        empleados[6] = new Empleado("Francesca","Duran",LocalDate.of(1998, Month.JULY,19),564387,2016);
        
        Arrays.sort(empleados);
        
        System.out.println("Ordenado por Edad");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.getApellidos());
        }
    }
    
}
