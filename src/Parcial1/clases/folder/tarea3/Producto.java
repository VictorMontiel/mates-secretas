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
public class Producto {
    protected String nombre;
    protected float precio;
    
    public Producto (String nombre, float precio){
        this.nombre=nombre;
        this.precio=precio;
    }
    public float getPrecio (){
        return this.precio;
    }
    
}
