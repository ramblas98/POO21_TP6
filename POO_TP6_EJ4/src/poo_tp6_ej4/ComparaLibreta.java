
package poo_tp6_ej4;

import java.util.Comparator;


public class ComparaLibreta implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Estudiante otroE1 = (Estudiante)o1;
        Estudiante otroE2 = (Estudiante)o2;
        
        if(otroE1.getLu()== otroE2.getLu()){
            return 0;
        }
        else{
            if(otroE1.getLu()< otroE2.getLu()){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
    
}
