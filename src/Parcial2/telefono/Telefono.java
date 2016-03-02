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
public class Telefono {

    public BotonApagar EA = new BotonApagar();
    Tecla[][] Teclado = new Tecla[5][3];
    static Contacto [] Agenda = new Contacto[100];
static int i =0;
    public void setTeclado() {
        int dig = 0;
        for (int i = 0; i < Teclado.length - 1; i++) {
            for (int j = 0; j < Teclado[0].length; j++) {
                dig++;
                String di = String.valueOf(dig);
                Tecla temp = new Tecla();
                char d = di.charAt(0);
                temp.setdigito(d);
                Teclado[i][j] = temp;
            }
        }
        Tecla temp = new Tecla();
        Tecla temp2 = new Tecla();
        Tecla temp3 = new Tecla();
        Tecla temp4 = new Tecla();
        Tecla temp5 = new Tecla();
        Tecla temp6 = new Tecla();

        temp.setdigito('x');
        Teclado[3][0] = temp;
        temp2.setdigito('0');
        Teclado[3][1] = temp2;
        temp3.setdigito('#');
        Teclado[3][2] = temp3;
        temp4.setdigito('C');
        Teclado[4][0] = temp4;
        temp5.setdigito('S');
        Teclado[4][1] = temp5;
        temp6.setdigito('T');
        Teclado[4][2] = temp6;
    }
    public static void agregarContacto(){
        if (i==Agenda.length) {
            System.out.println("Lo sentimos la Agenda ya está llena");
        }else{
            Contacto nuevo = new Contacto();
            Agenda[i]= nuevo;
            i++;
        }
    }
    public static void mostrarContacto(int n){
        if (n>100) {
            System.out.println("El contacto #"+n+" no existe");    
        }
        if (Agenda[n-1]!=null) {
            System.out.println("El contacto #"+n);
            Agenda[n-1].imprimirContacto();
        }else{
            System.out.println("El contacto #"+n+" no existe");
        }
        
    }
    public static void desplegarAgenda(){
        for (int j = 0; j < Agenda.length; j++) {
            if (Agenda[j]!=null) {
                System.out.println("El contacto número: "+(j+1));
                Agenda[j].imprimirContacto();
            }
        }
    }
}
