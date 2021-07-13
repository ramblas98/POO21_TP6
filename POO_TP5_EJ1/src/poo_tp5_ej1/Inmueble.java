
package poo_tp5_ej1;

public class Inmueble implements Rentable{
    private String direccion;
    private String tipo;
    private double valor;
    private int anios;
    private boolean estado;

    public Inmueble(String direccion, String tipo, double valor, int anios) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.valor = valor;
        this.anios = anios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    @Override
    public void alquilar(int periodo) {
        if(periodo > 0){
            System.out.println("Esta alquilado por "+periodo+ " dias.");
            this.estado = true;
        }
        else{
            this.estado = false;
        }
    }

    @Override
    public boolean alquilado() {
        return this.estado == true;
    }

    @Override
    public void desocupar() {
        this.estado = false;
        System.out.println("Inmueble desocupado");
    }
    
 
}
