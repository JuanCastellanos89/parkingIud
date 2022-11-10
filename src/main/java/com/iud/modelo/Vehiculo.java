package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Vehiculo {
    private String placa, tipo, marca, color, linea;
    private int cedulaPropietario;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String tipo, String marca, String color, String linea, int cedulaPropietario) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.cedulaPropietario = cedulaPropietario;
    }

    public Vehiculo(int cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public Vehiculo(String tipo, String marca, String color, String linea, int cedulaPropietario) {
        this.tipo = tipo;
        this.marca = marca;
        this.color = color;
        this.linea = linea;
        this.cedulaPropietario = cedulaPropietario;
    }
    
    
    

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(int cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }
    

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", tipo=" + tipo + ", marca=" + marca + ", color=" + color + ", linea=" + linea + ", cedulaPropietario=" + cedulaPropietario + '}';
    }
    
    
}
