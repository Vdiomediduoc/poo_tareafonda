package cl.dsy1102.fonda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {
        GestorFonda mainGestor = new GestorFonda();
        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        // TODO 3: registrarlas todas en el gestor.
        mainGestor.registrarBebida(new BebidaAlcoholica("Chicha", 1000, 40, 3, 12.0, false, false));
        System.out.println();
         mainGestor.registrarBebida(new BebidaAlcoholica("Pisco Sour", 500, 25, 3, 18.0, true,false));
        System.out.println();
         mainGestor.registrarBebida(new BebidaSinAlcohol("Chicha Sin Alcohol", 1000, 60, 95));
        System.out.println();
         mainGestor.registrarBebida(new BebidaSinAlcohol("Mote con Huesillo", 400, 50 , 70));
        System.out.println();
         // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        List<Bebida> resultados = mainGestor.buscarPorNombre("Chicha");
        for (Bebida aRestringir : resultados){
            if(aRestringir instanceof BebidaAlcoholica) {
                ((BebidaAlcoholica)aRestringir).restringirVenta();
            }
        }
        // TODO 5: buscar por nombre "Chicha"

        System.out.println("=== BUSQUEDA POR NOMBRE: Chicha ===");
        for (Bebida imprimir : resultados){
            String imprecion = ((BebidaAlcoholica) imprimir).obtenerDetalle();
            System.out.println(imprecion);
        }


        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        System.out.println("=== VENTAS ===");
        mainGestor.vender("Pisco Sour", 2);
        mainGestor.vender("Pisco Sour", 5);
        mainGestor.vender("Chicha", 1);
        mainGestor.vender("Mote con Huesillo", 2);
        // TODO 5: listar todas las bebidas.

        System.out.println("=== Listado de Bebidas ===");
        List<Bebida> todo = mainGestor.getTodas();
        for(Bebida listado: todo){
            System.out.println(listado.obtenerDetalle());
            System.out.println("=======================");
        };

        System.out.println("Proyecto listo.");
    }
}
