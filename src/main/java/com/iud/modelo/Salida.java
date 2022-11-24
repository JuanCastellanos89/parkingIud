package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Salida {
    private String placa, fechaSalida, horaSalida;

    public Salida() {
    }

    public Salida(String placa, String fechaSalida, String horaSalida) {
        this.placa = placa;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }
    
    
    
}
