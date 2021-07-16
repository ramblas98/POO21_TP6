
package poo_tp5_ej2;

import java.util.Comparator;

public class ComparaEmpleadoAntiguedad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Empleado e1 = (Empleado)o1;
        Empleado e2 = (Empleado)o2;
        if(e1.getAnioIngreso()== e2.getAnioIngreso()){
            return 0;
        }
        else{
            if(e1.getAnioIngreso()< e2.getAnioIngreso()){
                return -1;
            }
            else{
                return 1;
            }
        }
    }
    
}
