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
    public void setNombre(String nombre) throws Exception{
        if (nombre == null || nombre.equals("")) {
            throw new IllegalArgumentException("Nombre No puede ser Nulo ni Vacio");
        }
        this.nombre = nombre;
    }
    public int getVolumenMl() {
        return volumenMl;
    }
    public void setVolumenMl(int volumenMl) throws Exception {
        if (volumenMl < 100 || volumenMl > 3000) {
            throw new IllegalArgumentException("Error: Rango admitido de 100 a 3000 ML");
        }
        this.volumenMl = volumenMl;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) throws Exception {
        if (stock < 0) {
            throw new IllegalArgumentException("Error: El valor del stock no puede ser negativo");
        }
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
    public String toString(){
        String info = "";
        info += "Nombre: " + nombre + "| Volumen Ml: " + volumenMl + "\n";
        return info;
    };
}
