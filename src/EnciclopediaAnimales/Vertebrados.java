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
public class Vertebrados extends Animal {
protected boolean vertebra=true;
protected boolean simetriaBilateral=true;
protected boolean craneo=true;
protected String esqueleto;

public Vertebrados (){
    
    
}

    @Override
    public void getDatos() {
        super.getDatos(); 
        getEsqueleto();

    }
    public void getEsqueleto (){
        System.out.println("Escriba si el esqueleto del "+this.clasificacion+" es cartiloginoso u óseo: ");
        this.esqueleto=es.nextLine();
    }
 
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); 
        System.out.print("\n tiene vértebra \n tiene simetría bilateral \n tiene un cráneo \n tiene un esqueleto "+this.esqueleto);
    }

    public boolean obtenerVertebra() {
        return vertebra;
    }

    public boolean obtenerSimetriaBilateral() {
        return simetriaBilateral;
    }

    public boolean obtenerCraneo() {
        return craneo;
    }

    public String obtenerEsqueleto() {
        return esqueleto;
    }

    

    


    
    
}
