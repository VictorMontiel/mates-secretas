/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica;

import java.util.ArrayList;

/**
 *
 * @author Paco
 */
public class mein {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nInician los ejemplos con Ints");
        generica<Integer> lista = new generica<>();
        lista.almacenarUltimoDisponible(3);
        lista.almacenarEnPosicion(3, 3);
        lista.almacenarUltimoDisponible(4);
        lista.almacenarUltimoDisponible(5);
        lista.almacenarUltimoDisponible(6);
        lista.almacenarUltimoDisponible(7);
        lista.almacenarUltimoDisponible(8);
        System.out.println(""+lista.devuelveAlmacenados());
        lista.almacenarEnPosicion(3, 3);
        System.out.println(""+lista.devuelvePrimero());
        System.out.println(""+lista.devuelveUltimoExistente());
        System.out.println(""+lista.devuelveAlmacenados());
        System.out.println("\nInician los ejemplos con Floats");
        generica<Float> listaFloat = new generica<>();
        System.out.println(""+lista.t.toArray().length);
        listaFloat.almacenarUltimoDisponible(3.1416f);
        listaFloat.almacenarUltimoDisponible(4.123f);
        listaFloat.almacenarUltimoDisponible(5.32f);
        listaFloat.almacenarUltimoDisponible(6.55f);
        listaFloat.almacenarUltimoDisponible(7.66f);
        listaFloat.almacenarUltimoDisponible(6.66f);
        System.out.println(""+listaFloat.devuelveAlmacenados());
        listaFloat.almacenarEnPosicion(3, 0.00f);
        System.out.println(""+listaFloat.devuelvePrimero());
        System.out.println(""+listaFloat.devuelveUltimoExistente());
        System.out.println(""+listaFloat.devuelveAlmacenados());
        System.out.println("\nInician los ejemplos con String");
        generica<String> listaString = new generica<>();
        listaString.almacenarUltimoDisponible("hola");
        listaString.almacenarUltimoDisponible("mundo");
        listaString.almacenarUltimoDisponible("como");
        listaString.almacenarUltimoDisponible("?");
        System.out.println(""+listaString.devuelveAlmacenados());
        listaString.almacenarEnPosicion(3, "están");
        System.out.println(""+listaString.devuelveAlmacenados());
        System.out.println(""+listaString.devuelvePrimero());
        System.out.println(""+listaString.devuelveUltimoExistente());
        System.out.println("\nInician los ejemplos con personas");
        generica<Persona> listaPersonas = new generica<>();
        Persona Pedro = new Persona ("pedro",13, "hombre");
        Persona Juan = new Persona ("Juan",2, "hombre");
        Persona Marta = new Persona ("M.Arta",33, "mujer");
        Persona pillo = new Persona ("???",144, "indefinido");
        listaPersonas.almacenarUltimoDisponible(Pedro);
        listaPersonas.almacenarUltimoDisponible(Juan);
        listaPersonas.almacenarUltimoDisponible(Marta);
        listaPersonas.almacenarUltimoDisponible(pillo);
        System.out.println("\nmuestra el primero y último");
        listaPersonas.devuelvePrimero().getDatos();
        listaPersonas.devuelveUltimoExistente().getDatos();
        System.out.println("\nMuestra toda la lista");
        ArrayList<Persona> listaDePersonas = listaPersonas.devuelveAlmacenados();
        for (int i = 0; i < listaDePersonas.size(); i++) {
            listaDePersonas.get(i).getDatos();
        }
        Persona elmeromero = new Persona ("Elmer Homero",17, "Macho Alfa");
        System.out.println("\nmuestra lo primero, último y todo al haber agregado un nuevo elemento a la lista");
        listaPersonas.almacenarEnPosicion(0, elmeromero);
        listaDePersonas = listaPersonas.devuelveAlmacenados();
        listaPersonas.devuelvePrimero().getDatos();
        listaPersonas.devuelveUltimoExistente().getDatos();
        for (int i = 0; i < listaDePersonas.size(); i++) {
            listaDePersonas.get(i).getDatos();
        }
    }
    
}
