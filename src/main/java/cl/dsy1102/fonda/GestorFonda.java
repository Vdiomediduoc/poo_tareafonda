package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;

public abstract class GestorFonda {
    List<Bebida> bebidas = new ArrayList<Bebida>();

    public abstract void registrarBebida(Bebida bebida);

    public abstract List<Bebida> buscarPorNombre(String nombre);

    public abstract void vender(String nombre, int unidades);

    public abstract List<Bebida> getTodas();
}
