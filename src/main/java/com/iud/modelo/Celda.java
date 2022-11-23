package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Celda {
    private int id, esta_libre;

    public Celda(int id, int esta_libre) {
        this.id = id;
        this.esta_libre = esta_libre;
    }

    public Celda() {
    }

    public int getEsta_libre() {
        return esta_libre;
    }

    public int getId() {
        return id;
    }

    public void setEsta_libre(int esta_libre) {
        this.esta_libre = esta_libre;
    }
    
    
    
}
