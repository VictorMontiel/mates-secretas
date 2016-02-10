/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1.clases.folder;

/**
 *
 * @author Paco
 */
public class POOHerenciaTransportes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autobus expresotec= new Autobus ("TEC21", "SemanaI", 40, 2);
        Taxi taxiSeguro =  new Taxi ("T3C21", "Semestre I", 4, "Rayo Emprendedor");
        System.out.println("Esta es la información del Expreso Tec:");
        System.out.println("Modelo: "+expresotec.getModelo());
        System.out.println("Placa: "+expresotec.getPlaca());
        System.out.println("Pasajeros: "+expresotec.getPasajeros());
        System.out.println("Ruta: "+expresotec.getRuta()+"\n");
        System.out.println("Esta es la información del Taxi Seguro:");
        System.out.println("Modelo: "+taxiSeguro.getModelo());
        System.out.println("Placa: "+taxiSeguro.getPlaca());
        System.out.println("Sitio: "+taxiSeguro.getSitio());
        System.out.println("Pasajeros: "+taxiSeguro.getPasajeros()+ "\n");
        Vehiculo gene1215 = new Vehiculo ("21-Tec", "Borrego", 4);
        System.out.println("Datos del vehiculo");
        System.out.println("Placa: "+ gene1215.getPlaca());
        System.out.println("Modelo: "+ gene1215.getModelo());
        System.out.println("Pasajeros: "+ gene1215.getPasajeros());
    }
    
}
