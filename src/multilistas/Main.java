/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilistas;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        MultiLista ml=new MultiLista();
        int n,d;
        float v;
        String nom,nomp;
        Ventana ventana=new Ventana();
        ventana.setVisible(true);
        /*
        do{
            System.out.println("1.insertar propietario");
            System.out.println("2. insertar propiedad");
            System.out.println("3.retirar porpierario");
            System.out.println("4.retirar propiedad");
            System.out.println("5.imrpimir");
            n=sc.nextInt();
            switch(n){
                case 1:
                    System.out.println("num pro");
                    d=sc.nextInt();
                    System.out.println("nombre pro");
                    nom=sc.next();
                    ml.insertarPropietario(d, nom);
                    break;
                case 2:
                    System.out.println("propietario");
                    d=sc.nextInt();
                    System.out.println("pro");
                    nomp=sc.next();
                    System.out.println("valor");
                    v=sc.nextFloat();
                    ml.insertarPropiedad(d, nomp, v);
                    break;
                case 3:
                    System.out.println("rpopietario numero");
                    d=sc.nextInt();
                    ml.retirarPropietario(d);
                    break;
                case 4:
                    System.out.println("propietario");
                    d=sc.nextInt();
                    System.out.println("propiedad");
                    nomp=sc.next();
                    ml.retirarPropiedad(d, nomp);
                    break;
                case 5:
                    ml.imprimir();
                    break;
            }
        }while(n!=0);*/
    }
    
}
