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
public class NodoPropietario {

    public int getI() {
        return i;
    }

    public String getNombre() {
        return nombre;
    }
    int i;
    String nombre;
    NodoPropietario sig;
    NodoPropiedad abajo;
    
    public NodoPropietario(int d, String n){
        i=d;
        nombre=n;
        sig=null;
        abajo=null;
    }
}
