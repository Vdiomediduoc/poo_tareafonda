package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public  class GestorFonda {
    List<Bebida> bebidas = new ArrayList<Bebida>();

    public void registrarBebida(Bebida bebida){
        bebidas.add(bebida);
    }

    public abstract List<Bebida> buscarPorNombre(String nombre);

    public abstract void vender(String nombre, int unidades);

    public List<Bebida> getTodas(){
        for(Bebida bebida : bebidas){
            System.out.println(bebida.obternerDetalle());
        }
    };
}
