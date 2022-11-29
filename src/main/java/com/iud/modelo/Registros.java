package com.iud.modelo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Berserk
 */
public class Registros {
    private int idRegistro;
    private LocalDate fechaIngreso;
    private LocalTime horaIngreso;
    private LocalDate fechaSalida;
    private LocalTime horaSalida;

    public Registros() {
    }

    public Registros(int idRegistro, LocalDate fechaIngreso, LocalTime horaIngreso, LocalDate fechaSalida, LocalTime horaSalida) {
        this.idRegistro = idRegistro;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
    }

    public Registros(LocalDate fechaIngreso, LocalTime horaIngreso, LocalDate fechaSalida, LocalTime horaSalida) {
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public LocalTime getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(LocalTime horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getIdRegistro() {
        return idRegistro;
    }
    
}
