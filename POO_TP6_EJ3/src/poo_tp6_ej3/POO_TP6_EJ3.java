
package poo_tp6_ej3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class POO_TP6_EJ3 {

  
    public static void main(String[] args) {
       ArrayList <Complejo> listComplejo = new ArrayList<>();
       
       listComplejo.add(0,new Complejo(2,3));
       listComplejo.add(1,new Complejo(3.2,2.1));
       listComplejo.add(2,new Complejo(4,9));
       Iterator<Complejo> it = listComplejo.iterator();
       while(it.hasNext()){
           System.out.println(it.next().toString());
       }
        System.out.println("---------------------------------------------------------");
       HashSet <Complejo> lisComplejo = new HashSet<>();
       lisComplejo.addAll(listComplejo);
       Iterator<Complejo> i = lisComplejo.iterator();
       while(i.hasNext()){
           System.out.println(i.next().toString());
       }
       
       TreeSet<Complejo> liComplejo = new TreeSet<>();
       liComplejo.addAll(listComplejo);
       Iterator <Complejo> i2 = liComplejo.iterator();
       while(i2.hasNext()){
           System.out.println(i2.next().toString());
       }

    }
    
}
