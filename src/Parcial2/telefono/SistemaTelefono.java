/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2.telefono;

/**
 *
 * @author Paco
 */
public class SistemaTelefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefono startak = new Telefono();
        startak.EA.presionar();
        System.out.println("el startak está "+startak.EA.IO);
        startak.EA.presionar();
    startak.setTeclado();
        for (int i = 0; i < startak.Teclado.length; i++) {
            for (int j = 0; j < startak.Teclado[0].length; j++) {
                System.out.print(""+startak.Teclado[i][j].getdigito());
                if (j==startak.Teclado[0].length-1) {
                    System.out.println("");
                }
            }
        }
        Telefono.agregarContacto();
        Telefono.agregarContacto();
        Telefono.mostrarContacto(1);
        Telefono.mostrarContacto(2);
        Telefono.mostrarContacto(3);
        Telefono.desplegarAgenda();
        }
    }
    


