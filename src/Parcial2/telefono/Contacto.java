/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2.telefono;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class Contacto {

    Scanner es = new Scanner(System.in);
    private final String nombre;
    private final String numero;
    private final String correo;

    public Contacto() {
        System.out.println("Escriba el nombre del contacto: ");
        nombre = es.nextLine();

        System.out.println("Escriba el número del contacto: ");
        numero = es.nextLine();

        System.out.println("Escriba el correo del contacto: ");
        correo = es.nextLine();

    }

    public void imprimirContacto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Número: " + numero);
        System.out.println("Correo: " + correo);
    }
}
