package com.company;

public class Producto implements Comparable<Producto> {
    String nombre;
    int precio;

    public Producto(String _nombre, int _precio){
        nombre = _nombre;
        precio = _precio;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.precio, o.precio);
    }
}

class Bebida extends Producto{
    double litros;

    public Bebida(String _nombre, int _precio, double _litro) {
        super(_nombre, _precio);
        litros = _litro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: " + precio +"\n";
    }
}

class Shampoo extends Producto{
    int contenido;

    public Shampoo(String _nombre, int _precio, int _contenido) {
        super(_nombre, _precio);
        contenido = _contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: " + precio +"\n";
    }
}

class Fruta extends Producto{
    String unidadDeVenta = "kilo";

    public Fruta(String _nombre, int _precio) {
        super(_nombre, _precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadDeVenta + "\n";
    }
}


