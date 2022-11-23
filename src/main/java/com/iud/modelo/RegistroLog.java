package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class RegistroLog {
    private int idRegistro;
    private String fechaIngreso, horaIngreso, fechaSalida, horaSalida;

    public RegistroLog() {
    }

    public RegistroLog(int idRegistro, String fechaIngreso, String horaIngreso, String fechaSalida, String horaSalida) {
        this.idRegistro = idRegistro;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
    }

    public int getIdRegistro() {
        return idRegistro;
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
    
    
}
