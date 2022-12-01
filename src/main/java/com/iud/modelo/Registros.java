package com.iud.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Berserk
 */
public class Registros {
    private int idRegistro;
    private String placa, fechaIngreso, horaIngreso, fechaSalida, horaSalida;
  
    public Registros() {
    }

    public Registros(int idRegistro, String placa, String fechaIngreso, String horaIngreso, String fechaSalida, String horaSalida) {
        this.idRegistro = idRegistro;
        this.placa = placa;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
    }

    public Registros(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Registros(String placa, String fechaIngreso, String horaIngreso, String fechaSalida, String horaSalida) {
        this.placa = placa;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
    }

    public Registros(String placa, String fechaSalida, String horaSalida) {
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

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
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

    public int getIdRegistro() {
        return idRegistro;
    }

    
}
