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

                if (nodoHijo != null)
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
    
    int retirarPropietario(int d){
        boolean esta;
        NodoPropietario p;
        p=cabeza;
        if(p!=null && p.i<d){
            p=p.sig;
        }
        if(p.i==d){
            esta=true;
        }
        else{
            esta=false;
        }
        
        if(esta==false || p.abajo!=null){
            System.out.println("Error");
            return -1;
        }
        NodoPropietario aux=null;
        NodoPropietario q=null;
        NodoPropietario s=cabeza;
        while(s!=null && s.i<d){
            aux=q;
            q=s;
            s=s.sig;
        }
        if(q==null && s.sig==null){
            cabeza=null;
            s=null;
        }else if(q==null && s.sig!=null){
            aux=s.sig;
            cabeza=aux;
            s=null;
        }else if(s.sig==null){
            q.sig=null;
        }else{
            aux=s.sig;
            s=null;
            q.sig=aux;
        }
        return 1;
    }
    
    int retirarPropiedad(int x, String nom){
        NodoPropietario p;
        p=cabeza;
        while(p!=null && p.i<x){
            p=p.sig;
        }
        if(p==null){
            System.out.println("no existe");
            return -1;
        }
        if(p.i==x){
            NodoPropiedad s,q;
            s=null;
            q=p.abajo;
            while(q!=null && q.getPropiedad().equals(nom)){
                s=q;
                q=q.abajo;
            }
            if(s==null){
                System.out.println("no se encontro pro");
                return -1;
                
            }else if(p.abajo==q || q.abajo==null){
                p.abajo=null;
            }else{
                NodoPropiedad aux;
                aux=q.abajo;
                s.abajo=aux;
                
            }
        }
        return 1;
    }
    
}
