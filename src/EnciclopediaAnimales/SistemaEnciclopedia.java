/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnciclopediaAnimales;

import java.util.Scanner;

/**
 *
 * @author Paco
 */
public class SistemaEnciclopedia {

    /**
     * @param args the command line arguments
     */
    static Enciclopedia enci = new Enciclopedia();

    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);

        boolean dentro = true;

        System.out.println("Bienvenido a la Enciclopedia de animales \n \n Su objetivo es acumular información básica de mamíferos e insectos principalmente \n Puedes agregar otro tipo de animal también");
        while (dentro) {
            mostrarMenuPrincipal();
            String r = es.nextLine();
            switch (r) {
                case "1":
                    mostrarTodasEntradas();
                    break;
                case "2":
                    entradasEspecíficas();
                    r = es.nextLine();
                    switch (r) {
                        case "1":
                            verMamiferos();
                            break;
                        case "2":
                            verInsectos();
                            break;
                        case "3":
                            verOtrosVertebrados();
                            break;
                        case "4":
                            verOtrosInvertebrados();
                            break;
                        default:
                            break;
                    }
                    break;
                case "3": enci.nuevaEntrada();
                    break;
                case"4":dentro=false;
                    break;
                default:break;
            }
        }
    }
/**
 * los métodos permiten poner entradas y mostrar las estradas ya puestas
 */
    public static void entradasEspecíficas() {
        System.out.println("\n1.Ver Mamíferos");
        System.out.println("2.Ver Insectos");
        System.out.println("3.Ver otros Vertebrados");
        System.out.println("4.Ver otros Invertebrados");
    }

    public static void verMamiferos() {
        System.out.println("\nMamíferos: ");
        for (int i = 0; i < enci.mamiferos.length; i++) {
            if (enci.mamiferos[i] != null) {
                enci.mamiferos[i].mostrarDatos();
            }
        }
    }

    public static void verInsectos() {
        System.out.println("\nInsectos: ");
        for (int i = 0; i < enci.insectos.length; i++) {
            if (enci.insectos[i] != null) {
                enci.insectos[i].mostrarDatos();
            }
        }
    }

    public static void verOtrosVertebrados() {
        System.out.println("\nOtros vertebrados: ");
        for (int i = 0; i < enci.otrosVertebrados.length; i++) {
            if (enci.otrosVertebrados[i] != null) {
                enci.otrosVertebrados[i].mostrarDatos();
            }
        }
    }

    public static void verOtrosInvertebrados() {
        System.out.println("\nOtros invertebrados: ");
        for (int i = 0; i < enci.otrosInvertebrados.length; i++) {
            if (enci.otrosInvertebrados[i] != null) {
                enci.otrosInvertebrados[i].mostrarDatos();
            }
        }
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("\n1. Ver todas las entradas actuales");
        System.out.println("2. Ver entradas específicas");
        System.out.println("3. Añadir una entrada");
        System.out.println("4. Salir del programa");
    }

    public static void mostrarTodasEntradas() {
        verMamiferos();
        verInsectos();
        verOtrosVertebrados();
        verOtrosInvertebrados();
    }

}
