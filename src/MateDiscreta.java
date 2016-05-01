
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Paco
 */
public class MateDiscreta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner es = new Scanner(System.in);
        boolean on = true;
        int n;
        System.out.println("Bienvenido al sistema de relaciones");
        while (on == true) {
            System.out.println("Escriba el número de nodos de su relación");
            n = es.nextInt();
            es.nextLine();
            int[][] matriz = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    boolean correcto = true;
                    System.out.println("Escriba '1' si hay relación entre el nodo " + (i + 1) + " y el nodo " + (j + 1) + ", si no hay escriba un '0'");
                    matriz[i][j] = es.nextInt();
                    es.nextLine();
                    if (matriz[i][j] != 1 && matriz[i][j] != 0) {
                        correcto = false;
                    }
                    while (correcto == false) {
                        System.out.println("Lo sentimos, al parecer ingresó un dígito equivocado, porfavor inténtelo de nuevo");
                        System.out.println("Escriba '1' si hay relación entre el nodo " + (i + 1) + " y el nodo " + (j + 1) + ", si no hay escriba un '0'");
                        matriz[i][j] = es.nextInt();
                        es.nextLine();
                        if (matriz[i][j] == 1 || matriz[i][j] == 0) {
                            correcto = true;
                        }
                    }
                }
            }
            boolean reflex = calcularReflexion(matriz);
            boolean simetria = calcularSimetria(matriz);
            boolean antisimetria = calcularAntisimetria(matriz);
            boolean transitividad = calcularTransitividad(matriz);
            if (reflex == true) {
                System.out.println("La relación es reflexiva");
            }else{
                System.out.println("La relación no es reflexiva");
            }
            if (simetria) {
                System.out.println("La relación es simétrica");
            }else{
                 System.out.println("La relación no es simétrica");
            }
            if (antisimetria==true) {
                System.out.println("La relación es antisimétrica");
            }else{
                System.out.println("La relación no es antisimétrica");
            }
            if (transitividad==true) {
                System.out.println("La relación es transitiva");
            }else{
                System.out.println("La relación no es transitiva");
            }
            System.out.println("¿Desea realizar otra relación? ('si' o 'no')");
            String blah=es.nextLine();
            if (blah.equalsIgnoreCase("no")) {
               on=false; 
            }
        }
        System.out.println("Gracias por usar nuestro servicio. \n¡Vuelva pronto!");
    }

    public static boolean calcularReflexion(int matriz[][]) {
        boolean bool = true;
        int n = 0;
        while (bool == true && n < matriz.length) {
            if (matriz[n][n] == 0) {
                bool = false;
            }
            n++;
        }
        return bool;
    }

    public static boolean calcularSimetria(int matriz[][]) {
        boolean bool = true;
        for (int i = 0; i < matriz.length && bool == true; i++) {
            for (int j = 0; j < matriz.length && bool == true; j++) {
                if (matriz[i][j] == 1 && matriz[j][i] != 1) {
                    bool = false;
                }
            }
        }
        return bool;
    }

    public static boolean calcularAntisimetria(int matriz[][]) {
        boolean bool = true;
        for (int i = 0; i < matriz.length && bool == true; i++) {
            for (int j = 0; j < matriz.length && bool == true; j++) {
                if (matriz[i][j] == 1 && matriz[j][i] == 1 && i != j) {
                    bool = false;
                }
            }
        }
        return bool;
    }

    public static boolean calcularTransitividad(int matriz[][]) {
        boolean bool = true;
        int[][] reflex = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    reflex[i][j] += (matriz[i][k] * matriz[k][j]);
                }
            }
        }
        for (int i = 0; i < matriz.length && bool == true; i++) {
            for (int j = 0; j < matriz.length && bool == true; j++) {

                if (matriz[i][j] == 0 && reflex[i][j] != 0) {
                    bool = false;
                }
            }
        }
        return bool;
    }

}
