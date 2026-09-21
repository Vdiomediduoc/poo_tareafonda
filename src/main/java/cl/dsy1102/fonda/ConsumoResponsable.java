package cl.dsy1102.fonda;

public interface ConsumoResponsable {
    public default boolean tieneVentaRestringida(){
        return true;
    }
    public void restringirVenta();
    public boolean superaLimite(int unidades);

}


//class ConsumoResponsable {
//        <<interface>>
//          +tieneVentaRestringida() boolean
//      +restringirVenta() void
//      +superaLimite(int unidades) boolean

