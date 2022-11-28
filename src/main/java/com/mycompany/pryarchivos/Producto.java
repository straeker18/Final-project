package com.mycompany.pryarchivos;

public class Producto {    
    private String nombre;
    private String apellido;
    private int cedula;

    public Producto(String nombre, String apellido, int cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedeula) {
        this.cedula = cedula;
    } 
    public String toString(){
        return nombre + " " + apellido + " " + cedula ;
    }
    
}
