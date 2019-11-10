/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edd_final;

/**
 *
 * 
 */
public class Nodo {
    private int carnet;
    private String nombre;
    private int fe;
    private int hijoizquierdo;
    private int hijoderecho;
    private boolean vacio;

    public Nodo() {
        this.carnet = -1;
        this.nombre = "";
        this.vacio = true;
    }

    public Nodo(int carnet, String nombre) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.fe = 0;
        this.hijoderecho = -1;
        this.hijoizquierdo = -1;
        this.vacio = false;
    }
    
    

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVacio() {
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public int getHijoizquierdo() {
        return hijoizquierdo;
    }

    public void setHijoizquierdo(int hijoizquierdo) {
        this.hijoizquierdo = hijoizquierdo;
    }

    public int getHijoderecho() {
        return hijoderecho;
    }

    public void setHijoderecho(int hijoderecho) {
        this.hijoderecho = hijoderecho;
    }
}
