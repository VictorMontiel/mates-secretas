/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial1.clases.folder.tarea3;

/**
 *
 * @author Paco
 */
public class Frescos extends Producto {
protected float temperatura;
    public Frescos(String nombre, float precio, float temperatura) {
        super(nombre, precio);
        this.temperatura=temperatura;
    }
    public float getTemperatura(){
        return this.temperatura;
    }
}
