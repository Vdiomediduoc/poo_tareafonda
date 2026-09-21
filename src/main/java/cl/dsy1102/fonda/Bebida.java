package cl.dsy1102.fonda;

public abstract class Bebida {
    protected String nombre;
    protected int volumenMl;
    protected int stock;

    public Bebida(String nombre, int volumenMl, int stock) {
        this.nombre = nombre;
        this.volumenMl = volumenMl;
        this.stock = stock;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getVolumenMl() {
        return volumenMl;
    }
    public void setVolumenMl(int volumenMl) {
        this.volumenMl = volumenMl;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    abstract double calcularPrecio();
    public String  obtenerDetalle(){
        String info = "";
        info += "Nombre: " + nombre + "\n";
        info += "Volumen Ml: " + volumenMl + "\n";
        info += "Stock: " + stock + "\n";
        return info;
    };
}
