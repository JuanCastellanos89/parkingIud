package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class EstadoCuenta {
    private int idEstado, anoPagado, mesPagado, idRegistro;

    public EstadoCuenta(int anoPagado, int mesPagado, int idRegistro) {
        this.anoPagado = anoPagado;
        this.mesPagado = mesPagado;
        this.idRegistro = idRegistro;
    }

    public EstadoCuenta(int idEstado, int anoPagado, int mesPagado, int idRegistro) {
        this.idEstado = idEstado;
        this.anoPagado = anoPagado;
        this.mesPagado = mesPagado;
        this.idRegistro = idRegistro;
    }

    public EstadoCuenta() {
    }

    public int getAnoPagado() {
        return anoPagado;
    }

    public void setAnoPagado(int anoPagado) {
        this.anoPagado = anoPagado;
    }

    public int getMesPagado() {
        return mesPagado;
    }

    public void setMesPagado(int mesPagado) {
        this.mesPagado = mesPagado;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    @Override
    public String toString() {
        return "EstadoCuenta{" + "idEstado=" + idEstado + ", anoPagado=" + anoPagado + ", mesPagado=" + mesPagado + ", idRegistro=" + idRegistro + '}';
    }
    
    
    
}
