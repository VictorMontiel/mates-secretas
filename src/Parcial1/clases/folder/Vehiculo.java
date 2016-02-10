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
public class Vehiculo {
    protected String placa;
    protected String modelo;
    protected int pasajeros;
    /**
     * 
     * @param placa método que devuelve placa del vehiculo
     * @param modelo metodo que devuelve el mdelo
     * @param pasajeros metodo que devuelve el numero de pasajeros
     */
    public Vehiculo (String placa, String modelo, int pasajeros){
        this.placa=placa;
        this.pasajeros=pasajeros;
        this.modelo=modelo;
    }
  
    public String getPlaca(){
    return this.placa;
}
    public String getModelo(){
        return this.modelo;
    }
     public int getPasajeros(){
         return this.pasajeros;
     }
}
