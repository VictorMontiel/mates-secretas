/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ActividadPtosExtras;
import javax.swing.JOptionPane;
/**
 *
 * @author Paco
 */
public class Ventana {
    static private float altura;
    static private float peso;
    
    public Ventana (){
        
    }
    
    public static void Window(int n){
        switch (n){
            case 1: JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora de IMC \n A continuación se te solicitara tu peso y estatura, por favor se honesto", "Calculadora de Índice de Masa Corporal", 1);
                break;
            case 2: Peso(Float.parseFloat(JOptionPane.showInputDialog(null, "¿Cuál es su peso?", "Calculadora de Índice de Masa Corporal", 3)));
                break;
            case 3: Altura(Float.parseFloat(JOptionPane.showInputDialog(null, "¿Cuál es su estatura?", "Calculadora de Índice de Masa Corporal", 3)));
                break;
            case 4: JOptionPane.showMessageDialog(null, "Su IMC es: "+IMC()+";\nEsto quiere decir que usted "+ Estado(), "Calculadora de Índice de Masa Corporal", 0);
                break; 
        }
    }
    public static float IMC (){
        return (peso/((float)Math.pow(altura, 2)));
    }
    public static String Estado(){
        String msg ="";
        if (IMC()<18) {
            msg = "tiene un peso bajo y es necesario valorar los signos de desnutrición";
        }
        if (IMC()>18&& IMC()<25) {
            msg= "tiene un peso normal";
        }
        if (IMC()>=25 && IMC()<27) {
            msg = "tiene sobrepeso";
        }
        if (IMC()>=27 && IMC()<30) {
            msg = "padece de obesidad grado I, que implica un alto riesgo de desarrollar enfermedades cardiovasculares";
        }
        if(IMC()>=30 && IMC()<40){
            msg = "padece de obesidad grado II, que implica un muy alto riesgo de desarrollar enfermedades cardiovasculares";
        }
        if (IMC()>=40) {
            msg = "padece de obesidad grado III, Extrema o Mórbida, que implica un riesgo extremadamente alto de desarrollar enfermedades cardiovasculares";
        }
        return msg;
    }
    public static void Altura(float estatura){
        altura=estatura;
    }
    public static void Peso (float masa){
        peso=masa;
    }
}
