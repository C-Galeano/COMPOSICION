package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Producto> lstvacia1 = new ArrayList<>();
        List<Producto> lstvacia2 = new ArrayList<>();
        List<Producto> lstvacia3 = new ArrayList<>();

        Pedido pedido1 = new Pedido(1,lstvacia1);
        Producto p1 = new Producto("Hamburguesa", 10,5);
        Producto p2 = new Producto("Papas",6,7);
        pedido1.crear(p1);
        pedido1.crear(p2);

        Pedido pedido2 = new Pedido(2,lstvacia2);
        Producto p3 = new Producto("Gaseosa",10,5);
        pedido2.crear(p1);
        pedido2.crear(p3);

        Pedido pedido3 = new Pedido(3,lstvacia3);
        pedido3.crear(p3);


        pedido1.mostrar();
        pedido2.mostrar();
        pedido3.mostrar();


    }
}