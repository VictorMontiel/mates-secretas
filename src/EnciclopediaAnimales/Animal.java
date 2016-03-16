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

public abstract class Animal implements iAnimal {
    
Scanner es = new Scanner (System.in);

    protected String nombre;
    protected String respiracion;
    protected String ubicacion;
    protected String dieta;
    protected String entorno;
    protected String paridad;
    protected String sangre;
    protected String clasificacion;
    
    /**
     * get datos es un método que tiene todos los métodos para asignar las propiedades
     */
    public void getDatos(){
        getClasificacion();
        getNombre();
        getRespiracion();
        getUbicacion();
        getDieta();
        getEntorno();
        getParidad();
        getSangre();
    }
    
    public void getClasificacion(){
        if (this.clasificacion==null) {
            System.out.println("Escriba la clasificación de su animal");
        this.clasificacion=es.nextLine();
        }
        }
    public void getNombre(){
        System.out.println("Escriba el nombre del "+this.clasificacion+": ");
        this.nombre=es.nextLine();
    }
    public void getRespiracion(){
        if (this.respiracion!=null) {
            
        }else{
        System.out.println("Escriba el tipo de respiración del "+this.clasificacion+": ");
        this.respiracion=es.nextLine();
        }
    }
    public void getUbicacion(){
        System.out.println("Escriba la ubicación del "+this.clasificacion+": ");
        this.ubicacion=es.nextLine();
    }
    public void getDieta(){
        if (this.dieta!=null) {
            
        }else{
        System.out.println("Escriba la dieta del "+this.clasificacion+": ");
        this.dieta=es.nextLine();
        }
    }
    public void getEntorno(){
        if (this.entorno!=null) {
            
        }else{
        System.out.println("Escriba el entorno del "+this.clasificacion+": ");
        this.entorno=es.nextLine();
        }
    }
    public void getParidad(){
        if (this.paridad!=null) {
            
        }else{
        System.out.println("Escriba la paridad del "+this.clasificacion+": ");
        this.paridad=es.nextLine();
        }
    }
    public void getSangre(){
        if (this.sangre!=null) {
            
        }else{
        System.out.println("Escriba el tipo de sangre del "+this.clasificacion+": ");
        this.sangre=es.nextLine();
        }
    }
    @Override
    public void mostrarDatos() {
        System.out.print("nombre: " + this.nombre + "\n respiración: " + this.respiracion + "\n ubicación: " + this.ubicacion + "\n dieta: " + this.dieta
                + "\n entorno: " + this.entorno + "\n paridad: " + this.paridad + "\n tipo de sangre: " + this.sangre);
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }

    @Override
    public String obtenerClasificacion() {
        return this.clasificacion;
    }

    @Override
    public String obtenerParidad() {
        return this.paridad;
    }

    @Override
    public String obtenerUbicacion() {
        return this.ubicacion;
    }

    @Override
    public String obtenerDieta() {
        return this.dieta;
    }

    @Override
    public String obtenerEntorno() {
        return this.entorno;
    }

    @Override
    public String obtenerSangre() {
        return this.sangre;
    }

    @Override
    public String obtenerRespiracion() {
        return this.respiracion;
    }

}
