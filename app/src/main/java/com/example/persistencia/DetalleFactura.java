package com.example.persistencia;

public class DetalleFactura {
    private int codigoProducto;
    private String descripcion;
    private int cantidad;
    private int precio;
    private int costo;

    public DetalleFactura(int codigoProducto, String descripcion, int cantidad, int precio, int costo) {
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
        this.costo = costo;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
}
