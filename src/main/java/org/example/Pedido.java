package org.example;

import java.sql.SQLOutput;
import java.util.List;

public class Pedido {
        private int numeroPedido;
        private List<Producto> productos;

    public Pedido() {
    }

    public Pedido(int numeroPedido, List<Producto> productos) {
        this.numeroPedido = numeroPedido;
        this.productos = productos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", productos=" + productos +
                '}';
    }

    public void crear(Producto producto){
        this.productos.add(producto);
    }

    public void mostrar() {
        System.out.println("Pedido N°: " + numeroPedido);
        System.out.println("Detalle: " + productos);

    }
}
