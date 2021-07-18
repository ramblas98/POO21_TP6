
package poo_tp5_ej3;

import java.time.LocalDate;

public abstract class Persona implements Hablador{
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fNac;

    public Persona(String nombre, String apellido, int edad, LocalDate fNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fNac = fNac;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getfNac() {
        return fNac;
    }

    public void setfNac(LocalDate fNac) {
        this.fNac = fNac;
    }
    
}
