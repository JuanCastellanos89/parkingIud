package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Registro {
    
    private int idRegistro, fechaAno, fechaMes, fechaDia;
    private String placaRegistro;
    private int cedulaRegistro, valorMensualidad;


    public Registro(int fechaAno, int fechaMes, int fechaDia, String placaRegistro, int cedulaRegistro, int valorMensualidad) {
        this.fechaAno = fechaAno;
        this.fechaMes = fechaMes;
        this.fechaDia = fechaDia;
        this.placaRegistro = placaRegistro;
        this.cedulaRegistro = cedulaRegistro;
        this.valorMensualidad = valorMensualidad;
    }

    public Registro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Registro(int idRegistro, int fechaAno, int fechaMes, int fechaDia, String placaRegistro, int cedulaRegistro, int valorMensualidad) {
        this.idRegistro = idRegistro;
        this.fechaAno = fechaAno;
        this.fechaMes = fechaMes;
        this.fechaDia = fechaDia;
        this.placaRegistro = placaRegistro;
        this.cedulaRegistro = cedulaRegistro;
        this.valorMensualidad = valorMensualidad;
    }
    
    
    


    public Registro() {
    }

    public int getFechaAno() {
        return fechaAno;
    }

    public void setFechaAno(int fechaAno) {
        this.fechaAno = fechaAno;
    }

    public int getFechaMes() {
        return fechaMes;
    }

    public void setFechaMes(int fechaMes) {
        this.fechaMes = fechaMes;
    }

    public int getFechaDia() {
        return fechaDia;
    }

    public void setFechaDia(int fechaDia) {
        this.fechaDia = fechaDia;
    }

    public String getPlacaRegistro() {
        return placaRegistro;
    }

    public void setPlacaRegistro(String placaRegistro) {
        this.placaRegistro = placaRegistro;
    }

    public int getCedulaRegistro() {
        return cedulaRegistro;
    }

    public void setCedulaRegistro(int cedulaRegistro) {
        this.cedulaRegistro = cedulaRegistro;
    }

    public int getValorMensualidad() {
        return valorMensualidad;
    }

    public void setValorMensualidad(int valorMensualidad) {
        this.valorMensualidad = valorMensualidad;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    @Override
    public String toString() {
        return "Registro{" + "idRegistro=" + idRegistro + ", fechaAno=" + fechaAno + ", fechaMes=" + fechaMes + ", fechaDia=" + fechaDia + ", placaRegistro=" + placaRegistro + ", cedulaRegistro=" + cedulaRegistro + ", valorMensualidad=" + valorMensualidad + '}';
    }
    
    
    
}
