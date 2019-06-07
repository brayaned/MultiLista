/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Brayan
 */
public class MultiLista {
    
    NodoPropietario cabeza;
    
    public MultiLista(){
        cabeza=null;
    }
    
    
    void insertarPropietario(int d,String nom){
        NodoPropietario q;
        NodoPropietario s;
        q=null;
        s=cabeza;
        while(s!=null && d>s.i){
            if(s.i==d){
                System.out.println("no insertado");
            }
            q=s;
            s=s.sig;
        }
        NodoPropietario n=new NodoPropietario(d,nom);
        if(q==null){
            n.sig=cabeza;
            cabeza=n;
        }
        else if(s==null){
            q.sig=n;
        }
        else{
            n.sig=s;
            q.sig=n;
        }
    }
    
    void insertarPropiedad(int x,String nomp,float v){
        NodoPropietario p;
        p=cabeza;
        while(p!=null && p.i<x){
            p=p.sig;
        }
        if(p==null){
            System.out.println("no existe");
            
        }
        if(p.i==x){
            NodoPropiedad s,q;
            s=null;
            q=p.abajo;
            while(q!=null){
                s=q;
                q=q.abajo;
            }
            if(s==null){
                NodoPropiedad n=new NodoPropiedad(nomp,v);
                p.abajo=n;
                System.out.println("insertado");
            }else{
                NodoPropiedad n=new NodoPropiedad(nomp,v);
                s.abajo=n;
                System.out.println("insertado");
            }
        }
    }
    
    void imprimir(){
        try {
            NodoPropietario np = cabeza;
            while (np != null) {
                System.out.println(np.getI()+" "+np.getNombre() );

                NodoPropiedad nodoHijo = np.abajo;

                if (nodoHijo != null)//Lo utilizamos para el caso de que no tenga nodos hijos
                {
                    while (nodoHijo != null) {
                        System.out.println(" - " + nodoHijo.getPropiedad()+" valor: "+ nodoHijo.getValor());
                        nodoHijo = nodoHijo.abajo;
                    }
                }
                np = np.sig;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
}
