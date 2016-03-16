/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnciclopediaAnimales;

/**
 *
 * @author Paco
 */
public class Invertebrados extends Animal {
    protected boolean vertebra = false;
    protected boolean esqueletoArticulado=false;
    protected boolean exoesqueleto;
    protected boolean caparazon;
    
    public Invertebrados(){
        
        
    }
    public void getExoesqueleto(){
        System.out.println("El "+this.clasificacion+" tiene un exoesqueleto, ¿si o no?");
        String respuesta = es.nextLine();
        this.exoesqueleto = respuesta.equalsIgnoreCase("si");
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("\n no tiene vertebra \n no tiene esqueleto articulado \n exoesqueleto: "+this.exoesqueleto+"\n caparazon: "+this.caparazon);
    }

    @Override
    public void getDatos() {
        super.getDatos(); //To change body of generated methods, choose Tools | Templates.
        getCaparazon();
        getExoesqueleto();
    }
    public void getCaparazon(){
        System.out.println("El "+this.clasificacion+" tiene un caparazón, ¿si o no?");
        String respuesta = es.nextLine();
        this.caparazon = respuesta.equalsIgnoreCase("si");
    }
    
    public boolean obtenerVertebra() {
        return vertebra;
    }

    public boolean obtenerEsqueletoArticulado() {
        return esqueletoArticulado;
    }

    public boolean obtenerExoesqueleto() {
        return exoesqueleto;
    }

    public boolean obtenerCaparazon() {
        return caparazon;
    }
    
    
}
