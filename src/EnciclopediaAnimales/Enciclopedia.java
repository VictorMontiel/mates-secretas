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
public class Enciclopedia {

    Scanner es = new Scanner(System.in);
    protected Vertebrados[] otrosVertebrados = new Vertebrados[100];
    protected Invertebrados[] otrosInvertebrados = new Invertebrados[100];
    protected Mamifero[] mamiferos = new Mamifero[100];
    protected Insectos[] insectos = new Insectos[100];
    static int ovi = 0;
    static int oii = 0;
    static int ii = 0;
    static int mi = 0;
/**
 * el metodo nueva entrada permite crear una entrada nueva a la enciclopedia
 * creando un nuevo mamífero, insecto, otro vertebrado u otro invertebrado
 */
    public void nuevaEntrada() {
        System.out.println("\n ¿Qué tipo de animal desea añadir a la lista? \n 1:Mamífero \n 2:Insecto \n 3:Vertebrado \n 4:Invertebrado");
        String ta = es.nextLine();
        switch (ta) {
            case "1":
                Mamifero mam = new Mamifero();
                mamiferos[mi] = mam;
                mam.getDatos();
                mi++;
                System.out.println("Listo!");
                break;
            case "2":
                Insectos ins = new Insectos();
                insectos[ii] = ins;
                ins.getDatos();
                ii++;
                System.out.println("Listo!");
                break;
            case "3":
                Vertebrados ver = new Vertebrados();
                otrosVertebrados[ovi] = ver;
                ver.getDatos();
                ovi++;
                System.out.println("Listo!");
                break;
            case "4":
                Invertebrados inv = new Invertebrados();
                otrosInvertebrados[oii] = inv;
                inv.getDatos();
                oii++;
                System.out.println("Listo!");
                break;
        }
    }

}
