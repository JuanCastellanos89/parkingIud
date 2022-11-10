package com.iud.modelo;

/**
 *
 * @author Berserk
 */
public class Cliente {
    private int cedula;
    private String nombre, apellidos, direccion;
    private int celular;

    public Cliente() {
    }

    public Cliente(int cedula, String nombre, String apellidos, String direccion, int celular) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
    }

    public Cliente(String nombre, String apellidos, String direccion, int celular) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.celular = celular;
    }
    

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellidos=" + apellidos + ", direccion=" + direccion + ", celular=" + celular + '}';
    }
    
    
    
}
