
package poo_tp6_ej4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author Antonio
 */
public class POO_TP6_EJ4 {

  
    public static void main(String[] args) {
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Ricardo",723947,"Analista en Sistemas",22));
        estudiantes.add(new Estudiante("Humberto",340985,"Tecnico en Programacion",21));
        estudiantes.add(new Estudiante("Luisa",12091,"Ingenieria en Software",19));
        estudiantes.add(new Estudiante("Ana",32132,"Diseño Grafico",21));
        estudiantes.add(new Estudiante("Paz",212100,"Programacion de Videojuegos",20));
        Iterator<Estudiante> iter = estudiantes.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next().toString());
        }
        
        System.out.println("Orden Natural por Nombre");
        System.out.println("--------------------------------------------------");
        TreeSet<Estudiante> student = new TreeSet<>();
        student.addAll(estudiantes);
        Iterator<Estudiante> ite = student.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next().getNombre());
        }
        
        System.out.println("Ordenado por libreta Universitaria");
        System.out.println("----------------------------------------------------");
        estudiantes.sort(new poo_tp6_ej5.ComparaLibreta());
        estudiantes.forEach((lista) -> {
            System.out.println(lista.getLu());
        });
    }
    
}
