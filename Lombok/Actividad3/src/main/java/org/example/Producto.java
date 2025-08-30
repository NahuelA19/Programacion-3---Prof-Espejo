package org.example;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private String autor;

    public Producto() {
    }

    public Producto(String nombre, String codigo, double precio, String autor) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.autor = autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
