
package poo_tp5_ej1;

public class POO_TP5_EJ1 {

    public static void main(String[] args) {
        Inmueble inmueble = new Inmueble("San Martin 423","Ventana",256, 4);
        Disfraz disfraz = new Disfraz ("SpiderMan",'M',0, 558);
        
        inmueble.alquilar(450);
        disfraz.alquilar(45);
        if(inmueble.alquilado() == true){
            System.out.println("Inmueble Ocupado");
        }
        else{
            System.out.println("Inmueble desocupado");
        }
        
        if(disfraz.alquilado() == true){
            System.out.println("Disfraz Ocupado");
        }
        else{
            System.out.println("Disfraz desocupado");
        }
        
        inmueble.desocupar();
        disfraz.desocupar();
    }
    
}
