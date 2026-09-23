package cl.dsy1102.fonda;

import java.io.Serializable;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable{
    protected int limitecliente;
    protected double gradosAlcohol;
    protected boolean certificada;
    protected boolean ventaRestringida;

    public BebidaAlcoholica(String nombre, int volumenMl, int stock,  int limitecliente, double gradosAlcohol, boolean certificada, boolean ventaRestringida) {
        super(nombre, volumenMl, stock);
        this.limitecliente = limitecliente;
        this.gradosAlcohol = gradosAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;
    }
    public int getLimitecliente() {
        return limitecliente;
    }
    public void setLimitecliente(int limitecliente) {
        this.limitecliente = limitecliente;
    }
    public double getGradosAlcohol() {
        return gradosAlcohol;
    }
    public void setGradosAlcohol(double gradosAlcohol) throws Exception{
        if(gradosAlcohol< 0.5 || gradosAlcohol > 45){
            throw new IllegalArgumentException("El rango debe encontrarse entre 0.5 y 45 grados");
        }
        this.gradosAlcohol = gradosAlcohol;
    }
    public boolean isCertificada() {
        return certificada;
    }
    public void setCertificada(boolean certificada) {
        this.certificada = certificada;
    }
    public boolean isVentaRestringida() {
        return ventaRestringida;
    }
    public void setVentaRestringida(boolean ventaRestringida) {
        this.ventaRestringida = ventaRestringida;
    }
    public boolean tieneVentaRestringida(){
        return ventaRestringida;
    }
    @Override
    public void restringirVenta(){
        ventaRestringida = false;
    }
    @Override
    public double calcularPrecio(){
        double precioFinal = 0;
        double precioBase = 3500;
        if (!isCertificada()){
            precioFinal += precioBase + (precioBase * 0.2);
            return precioFinal;
        }
        return precioBase;
    }
    @Override
    public String obtenerDetalle(){
        String info = "";
        info += "Tipo: Bebida Alcoholica" + "\n";
        info += super.obtenerDetalle();
        info += "Limite por Cliente: " + limitecliente + "\n";
        info += "Grados de Alcohol: " + gradosAlcohol + "\n";
        info += "Tiene certificacion: " + certificada + "\n";
        info += "Tiene la venta Restringida: " + ventaRestringida + "\n";
        return info;
    }
    public boolean superaLimite(int unidades){
        return unidades > limitecliente;
    }




    //+tieneVentaRestringida() boolean
    //  +restringirVenta() void
    //  +superaLimite(int unidades) boolean
}
