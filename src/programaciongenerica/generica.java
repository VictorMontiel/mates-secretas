/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaciongenerica;

import java.util.ArrayList;

/**
 *
 * @author Paco
 * @param <T>
 */
public class generica <T>{
 ArrayList<T> t=new ArrayList<>(100);

    public void almacenarUltimoDisponible (T t){
               this.t.add( t); 
        
}
    public void almacenarEnPosicion(int i, T t){
        try {
            this.t.add(i, t);
        }
        catch (Exception e){
            System.out.println("Ese espacio no existe");
        }
    }
     
    public ArrayList<T> devuelveAlmacenados(){
        return this.t;
    }
    public T devuelvePrimero(){
        for (int i = 0; i<this.t.toArray().length; i++) {
            if (this.t.get(i)!=null) {
                return this.t.get(i);
            }
        }
        return null;
        
    }
    public T devuelveUltimoExistente(){
        for (int i = this.t.toArray().length-1; i >=0; i--) {
            if (this.t.get(i)!=null) {
                return this.t.get(i);
            }
        }
        return null;
        
    }
}

