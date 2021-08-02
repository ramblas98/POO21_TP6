
package poo_tp6_ej4;

public class Estudiante implements Comparable{
    private String nombre;
    private long lu;
    private String carrera;
    private int edad;

    public Estudiante(String nombre, long lu, String carrera, int edad) {
        this.nombre = nombre;
        this.lu = lu;
        this.carrera = carrera;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getLu() {
        return lu;
    }

    public void setLu(long lu) {
        this.lu = lu;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante "+this.nombre+" y su edad "+this.edad+" lu: "+this.lu+" Carrera: "+this.carrera;
    }

    @Override
    public int compareTo(Object o) {
        Estudiante otroE = (Estudiante)o;
        return this.nombre.compareTo(otroE.nombre);
    }
    
    
    
}
