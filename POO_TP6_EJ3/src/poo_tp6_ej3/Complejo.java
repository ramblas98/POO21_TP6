
package poo_tp6_ej3;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Marco Antonio
 */
public class Complejo implements Comparable{
    private double re;
    private double im;
    
    Scanner teclado = new Scanner(System.in);

    public Complejo() {
    }

    public Complejo(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public void setRe(double re) {
        this.re = re;
    }

    public double getIm() {
        return im;
    }

    public void setIm(double im) {
        this.im = im;
    }
    
    //Metodos de Instancia
    
    public void inc(Complejo a){
        this.im+=a.im;
        this.re+=a.re;
    }
    
    public void dec(Complejo a){
        this.im-=a.im;
        this.re-=a.re;
    }
    
    public void por(Complejo a){
        this.re = ((this.re * a.re)-(this.im * a.im));
        this.im = ((this.re * a.im)+(this.im * a.re));
    }
    
    public void por(double d){
       this.im = this.im * d;
       this.re = this.re *d;
    }
    
    public void div(Complejo a){
        this.re = ((this.re * a.re)+(this.im * a.im))/((pow(a.re,2))+(pow(a.im,2)));
        this.im = ((this.im * a.re)-(this.re * a.im))/((pow(a.re,2))+(pow(a.im,2)));
    }
    
    public double modulo(){
        double r;
        
        r = sqrt(pow(this.re,2)+ pow(this.im,2));
        
        return r;
    }
    
    public Complejo conjugado(){
        Complejo z = new Complejo();
        
        z.re = this.re;
        z.im = -(this.im);
        
        return z;
    }
    
    //Metodos de Clases
    
    public static Complejo suma(Complejo a, Complejo b){
        Complejo c = new Complejo();
        
        c.re = a.re + b.re;
        c.im = a.im + b.im;
        
        return c;
    }
    
    public static Complejo resta(Complejo a, Complejo b){
        Complejo c = new Complejo();
        
        c.re = a.re - b.re;
        c.im = a.im - b.im;
        
        return c;
    }
    
    public static Complejo producto(Complejo a, Complejo b){
        Complejo c = new Complejo();
        
        c.re = ((a.re * b.re)-(a.im * b.im));
        c.im = ((a.re * b.im)+(a.im * b.re));
        
        return c;
    }
    
    public static Complejo division(Complejo a, Complejo b){
        Complejo c = new Complejo();
        
        c.re = ((a.re * b.re)+(a.im * b.im))/((pow(b.re,2))+(pow(b.im,2)));
        c.im = ((a.im * b.re)-(a.re * b.im))/((pow(b.re,2))+(pow(b.im,2)));
        
        return c;
    }

    @Override
    public String toString() {
        return "Complejo{" + "re=" + re + ", im=" + im + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.re) ^ (Double.doubleToLongBits(this.re) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.im) ^ (Double.doubleToLongBits(this.im) >>> 32));
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
        final Complejo other = (Complejo) obj;
        if (Double.doubleToLongBits(this.re) != Double.doubleToLongBits(other.re)) {
            return false;
        }
        if (Double.doubleToLongBits(this.im) != Double.doubleToLongBits(other.im)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Complejo otroC = (Complejo)o;
        double m = this.modulo();
        if(m < otroC.modulo()){
            return -1;
        }
        else{
            if(m > this.modulo()){
                return 1;
            }
            else{
                return 0;
            }
        }
        
    }
    
    
}
