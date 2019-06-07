/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilistas;

/**
 *
 * @author Brayan
 */
public class NodoPropiedad{
    
    String propiedad;
    float valor;
    NodoPropiedad abajo;

    public String getPropiedad() {
        return propiedad;
    }

    public float getValor() {
        return valor;
    }
    
    public NodoPropiedad(String p,float v){
        propiedad=p;
        valor=v;
        abajo=null;
    }
}
