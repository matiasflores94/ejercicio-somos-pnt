package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Supermercado {
    ArrayList<Producto> productos = new ArrayList<>();

    public Supermercado() {
        //Se inicia con los datos dados en el enunciado.
        productos.add(new Bebida("Coca-Cola Zero", 20, 1.5));
        productos.add(new Bebida("Coca-Cola", 18, 1.5));
        productos.add(new Shampoo("Shampoo Sedal", 19, 500));
        productos.add(new Fruta("Frutillas", 64));
    }

    public String nombreProductoMasCaro() {
        return Collections.max(productos).getNombre();
    }

    public String nombreProductoMasBarato() {
        return Collections.min(productos).getNombre();
    }

    @Override
    public String toString() {
        StringBuilder productosString = new StringBuilder();
        for (Producto p : productos) {
            productosString.append(p.toString());
        }

        return
                productosString +
                "=============================\n" +
                "Producto más caro: " + this.nombreProductoMasCaro() +
                "\nProducto más barato: " + this.nombreProductoMasBarato();
    }

}
