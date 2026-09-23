package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida{
    protected int azucarPorLitro;
    public BebidaSinAlcohol(String nombre, int volumenMl, int stock, int azucarPorLitro) {
        super(nombre, volumenMl, stock);
        this.azucarPorLitro = azucarPorLitro;
    }
    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }
    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }
    @Override
    public double calcularPrecio() {
        double precioFinal = 0;
        double precioBase = 2000;
        if (getAzucarPorLitro() > 80){
            precioFinal += precioBase + (precioBase * 0.1);
            return precioFinal;
        }
        return precioBase;
    }
    @Override
    public String  obtenerDetalle() {
        String info = "";
        info += "Tipo: Bebida Sin Alcohol" + "\n";
        info += super.obtenerDetalle();
        info += "Azucar por Litro: " + azucarPorLitro + "\n";
        return info;
    }
}

