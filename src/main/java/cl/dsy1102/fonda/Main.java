package cl.dsy1102.fonda;

import java.util.ArrayList;
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
        ArrayList<Bebida> bebidas = new ArrayList<>();
        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
         GestorFonda.registrarBebida(new BebidaAlcoholica("Chicha", 1000, 40, 3, 12.0, false, true));
         bebidas.add(new BebidaAlcoholica("Pisco Sour", 500, 25, 3, 18.0, true,true));
         bebidas.add(new BebidaSinAlcohol("Chicha Sin Alcohol", 1000, 60, 95));
         bebidas.add(new BebidaSinAlcohol("Mote con Huesillo", 400, 50 , 70));
        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.

        // TODO 3: registrarlas todas en el gestor.
        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.
        System.out.println("Proyecto listo. Comienza por la clase Bebida.");
    }
}
