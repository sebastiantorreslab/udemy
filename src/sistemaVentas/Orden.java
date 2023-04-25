package sistemaVentas;

import java.util.ArrayList;

public class Orden {

    private int id;
    private Producto productos;

    public Orden() {
    }

    public boolean agregarProducto(Producto producto){
        return true;
    }

    public double calcularTotal(){
        return 0;
    }

    public void mostrarOrden(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }
}
