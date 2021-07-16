
package poo_tp5_ej2;

import java.time.LocalDate;

public class Empleado implements Comparable{
    private String nombres;
    private String apellidos;
    private LocalDate fechaNac;
    private long dni;
    private int anioIngreso;

    public Empleado(String nombres, String apellidos, LocalDate fechaNac, long dni, int anioIngreso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.dni = dni;
        this.anioIngreso = anioIngreso;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public int compareTo(Object o) {
        Empleado otroE = (Empleado)o;
        return this.fechaNac.compareTo(otroE.fechaNac);
    }
    
    
}
