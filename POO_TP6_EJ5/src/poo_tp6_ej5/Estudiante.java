
package poo_tp6_ej5;

import java.util.Objects;


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
        return "Estudiante{" + "nombre=" + nombre + ", lu=" + lu + ", carrera=" + carrera + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + (int) (this.lu ^ (this.lu >>> 32));
        hash = 11 * hash + Objects.hashCode(this.carrera);
        hash = 11 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        if (this.lu != other.lu) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.carrera, other.carrera)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Estudiante otroE = (Estudiante)o;
        return this.nombre.compareTo(otroE.nombre);
    }
    
    
}
