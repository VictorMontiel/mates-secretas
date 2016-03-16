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
public class Mamifero extends Vertebrados{
    protected boolean pelaje=true;
    protected boolean produccionLeche=true;
    protected boolean endotermico=true;
    protected String sexo="determinado por cromosomas X y Y";
    
    
     public Mamifero (){
         this.clasificacion="mamífero";
         this.sangre="caliente";
         this.paridad="vivíparo";
         this.respiracion="pulmonar";
         
     }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n pelaje :"+this.pelaje+"\n produce leche: "+this.produccionLeche+"\n tipo endotérmico: "+this.endotermico+"\n su sexo es "+this.sexo);
    }
     

   
}
