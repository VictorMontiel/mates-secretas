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
public class Insectos extends Invertebrados {

    protected boolean asexualidad;
    protected boolean antenas = true;
    protected String aparatosBucales;
    protected int patas = 6;
    protected boolean alas;

    public Insectos() {
        this.paridad = "ovíparo";
        this.clasificacion = "insecto";
        this.caparazon=false;
        
    }

    public void getAsexualidad() {
        System.out.println("¿Es el " + this.clasificacion + " asexual?");
        String respuesta = es.nextLine();
        this.asexualidad = respuesta.equalsIgnoreCase("si");
    }

    public void getAparatoBucal() {
        System.out.println("Escriba el número del tipo de aparato bucal de su insect: \n 1:'masticador' \n 2:'cortador-chupador' \n 3:'chupador' \n 4:'masticador-lamedor' \n 5:'picador-chupador' \n 6:'tubo de sifón'");
        String respuesta = es.nextLine();
        boolean flag = true;
        while (flag) {
            switch (respuesta) {
                case "1":
                    this.aparatosBucales = "masticador";
                    flag = false;
                    break;
                case "2":
                    this.aparatosBucales = "cortador-chupador";
                    flag = false;
                    break;
                case "3":
                    this.aparatosBucales = "chupador";
                    flag = false;
                    break;
                case "4":
                    this.aparatosBucales = "masticador-lamedor";
                    flag = false;
                    break;
                case "5":
                    this.aparatosBucales = "picador-chupador";
                    flag = false;
                    break;
                case "6":
                    this.aparatosBucales = "tubo de sifón";
                    flag = false;
                    break;
                default: System.out.println("introdujo un caracter no aceptable");;
                    break;

            }
        }

    }
    public void getAlas(){
        System.out.println("¿Su "+this.clasificacion+" tiene alas?");
        String r=es.nextLine();
        this.alas=r.equalsIgnoreCase("si");
    }

    @Override
    public void getDatos() {
        
        getNombre();
        getRespiracion();
        getUbicacion();
        getDieta();
        getEntorno();
        
        getSangre();

        getExoesqueleto();
        getAsexualidad();
        getAparatoBucal();
        getAlas();
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); 
        System.out.println("\n asexual: "+this.asexualidad+"\n antenas "+this.antenas+"\n aparato bucal: "+this.aparatosBucales+"\n patas: "+this.patas+"\n alas: "+this.alas);
    }
    
}
