/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parcial2.telefono;

/**
 *
 * @author Paco
 */
public class BotonApagar {
    public boolean IO;
    public BotonApagar(){
       this.IO=false; 
    }
    public void presionar(){
        this.IO = !this.IO;
}
}
