
package poo_tp6_ej5;

import java.util.*;


public class POO_TP6_EJ5 {

 
    public static void main(String[] args) {
        HashMap<Integer, Estudiante> map1 = new HashMap();
        
        map1.put(3498,new Estudiante("Marco",3498,"Programador",25));
        map1.put(3479, new Estudiante("Ana",3479,"LAS",21));
        map1.put(1233,new Estudiante("Zacarias",1233,"Electronica",23));
        
        System.out.println("Lista de claves");
        for(Integer i: map1.keySet()){
            System.out.println(i);
        }
        
        System.out.println("Lista de Valores");
        System.out.println("...............................................");
        for(Estudiante e: map1.values()){
            System.out.println(e.toString());
        }
        
        System.out.println("Lista de Valores y Claves");
        System.out.println("-----------------------------------------------------");
        for(Map.Entry<Integer, Estudiante> me: map1.entrySet()){
            Integer k = me.getKey();
            Estudiante e = me.getValue();
            System.out.println(k+" - "+e.toString());
        }
        
        System.out.println("Uso del TreeMap");
        TreeMap<Integer, Estudiante> map2 = new TreeMap();
        map2.putAll(map1);
        System.out.println("Lista de Valores y Claves");
        Iterator<Map.Entry<Integer,Estudiante>> iter = map2.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<Integer,Estudiante> it = iter.next();
            System.out.println("Clave: "+it.getKey()+" Valores: "+it.getValue());
        }
    }
    
}
