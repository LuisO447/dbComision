/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Luis
 */
public class Clscomisiones {
    
    private int codigo;
    private String nombre;
    private int enero;
    private int febrero;
    private int marzo;
    private int total;
    private double promedio;

    @Override
    public String toString() {
        return "Clscomisiones{" + "codigo=" + codigo + ", nombre=" + nombre + ", enero=" + enero + ", febrero=" + febrero + ", marzo=" + marzo + ", total=" + total + ", promedio=" + promedio + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnero() {
        return enero;
    }

    public void setEnero(int enero) {
        this.enero = enero;
    }

    public int getFebrero() {
        return febrero;
    }

    public void setFebrero(int febrero) {
        this.febrero = febrero;
    }

    public int getMarzo() {
        return marzo;
    }

    public void setMarzo(int marzo) {
        this.marzo = marzo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
    
}
