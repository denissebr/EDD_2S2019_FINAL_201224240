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
public class Arbol {
    Nodo contenido[] = new Nodo[100];
    
    public Arbol(){
        for(int i = 0; i < 100; i++){
            Nodo aux = new Nodo();
            contenido[i] = aux;
        }
    }
    
    public void Insertar(Nodo nuevo){
        
    }
}
