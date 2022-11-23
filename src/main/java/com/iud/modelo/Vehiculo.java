package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Vehiculo {
    private String placa, marca, color;
    private int cedula;
    private String tipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String color, int cedula, String tipoVehiculo) {
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.cedula = cedula;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

   
    
}
