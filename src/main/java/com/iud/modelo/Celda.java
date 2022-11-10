package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Celda {
    private int celda;
    private String celdaOcupada;

    public Celda(int celda, String celdaOcupada) {
        this.celda = celda;
        this.celdaOcupada = celdaOcupada;
    }

    public Celda() {
    }

    public Celda(int celda) {
        this.celda = celda;
    }

    public int getCelda() {
        return celda;
    }

    public String getCeldaOcupada() {
        return celdaOcupada;
    }

    public void setCeldaOcupada(String celdaOcupada) {
        this.celdaOcupada = celdaOcupada;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }
    

    @Override
    public String toString() {
        return "Celda{" + "celda=" + celda + ", celdaOcupada=" + celdaOcupada + '}';
    }
    
    
    
}
