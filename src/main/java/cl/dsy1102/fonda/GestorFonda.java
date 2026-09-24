package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public  class GestorFonda {
    List<Bebida> bebidas = new ArrayList<Bebida>();

    public void registrarBebida(Bebida bebida){

        bebidas.add(bebida);
        if(bebida instanceof BebidaAlcoholica){
            System.out.print(bebida.getNombre() + "(Bebida Alcoholica) registrada correctamente ");
        } else if (bebida instanceof BebidaSinAlcohol) {
            System.out.print(bebida.getNombre() + "(Bebida No Alcoholica) registrada correctamente");}
    }

    public  List<Bebida> buscarPorNombre(String nombre) {
       ArrayList<Bebida> busqueda = new ArrayList<>();
       busqueda.clear();
       for (Bebida buscada : bebidas){
           if (buscada.getNombre().equals(nombre)){
               busqueda.add(buscada);}
        }
        return busqueda;
    }


    public void vender(String nombre, int unidades){
        List<Bebida> Venta = buscarPorNombre(nombre);
        for(Bebida aVender: Venta){
            if(aVender instanceof BebidaAlcoholica) {
                if(unidades > ((BebidaAlcoholica)aVender).getLimiteCliente() || ((BebidaAlcoholica) aVender).tieneVentaRestringida()) {
                    if (((BebidaAlcoholica) aVender).tieneVentaRestringida()) {
                        System.out.println("Venta Rechazada: " + nombre + "tiene venta restringida");
                    } else if (unidades > ((BebidaAlcoholica) aVender).getLimiteCliente()) {
                        System.out.println("Venta Rechazada: " + unidades + "Unidades de" + nombre + " Superan el limite de 3 por Cliente");
                    }
                }else{
                    double precio1 = aVender.calcularPrecio() * unidades;
                    System.out.println("Venta Autorizada: " + unidades + " X " + nombre +" | Total: " + precio1);
                }
            } else if (aVender instanceof BebidaSinAlcohol) {
                double precio2 = aVender.calcularPrecio() * unidades;
                System.out.println("Venta Autorizada: " + unidades + " X " + nombre +" | Total: " + precio2);
            }
        }
    };

    public List<Bebida> getTodas(){
        return bebidas;
    };
}
