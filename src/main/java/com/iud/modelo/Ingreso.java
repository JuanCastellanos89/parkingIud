package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Ingreso {
    private String placa;
    private String fechaIngreso;
    private String horaIngreso;
    private int celdaId;

    public Ingreso() {
    }

    public Ingreso(String placa, String fechaIngreso, String horaIngreso, int celdaId) {
        this.placa = placa;
        this.fechaIngreso = fechaIngreso;
        this.horaIngreso = horaIngreso;
        this.celdaId = celdaId;
    }

    public Ingreso(String placa) {
        this.placa = placa;
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

    public int getCeldaId() {
        return celdaId;
    }

    public void setCeldaId(int celdaId) {
        this.celdaId = celdaId;
    }

    

}
