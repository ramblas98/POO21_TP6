
package poo_tp5_ej3;

import java.time.LocalDate;

public class Programador extends Persona{

    public Programador(String nombre, String apellido, int edad, LocalDate fNac) {
        super(nombre, apellido, edad, fNac);
    }
    
    
    @Override
    public void saluda() {
        System.out.println("Hola soy "+super.getNombre()+" "+super.getApellido()+" y soy Programador");
    }
    
}
