/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilistas;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Brayan
 */
public class Ventana extends JFrame {
    
    MultiLista lista=new MultiLista();
    public Ventana(){
        setSize(900,600);
        setTitle("Listas");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(1000,1000,1000, 1000);
        this.getContentPane().add(panel);
        JButton insertarPropietario=new JButton("1.Insertar Propietario");
        JButton insertarPropiedad=new JButton("2.Insertar Propiedad");
        JButton retirarPropiedad=new JButton("3.Retirar Propiedad");
        JButton retirarPropietario=new JButton("4. Retirar Propietario");
        JButton imprimir=new JButton("5.Imprimir");
        JLabel numero=new JLabel("Dato:");
        JLabel nom=new JLabel("Nombre:");
        JLabel val=new JLabel("Valor:");
        JLabel resultado=new JLabel();
        JLabel rh=new JLabel();
        numero.setBounds(60, 100, 50, 20);
        nom.setBounds(235, 100, 50, 20);
        val.setBounds(430, 100, 50, 20);
        resultado.setBounds(250, 300, 500,20);
        rh.setBounds(250, 320, 500,250);
        insertarPropietario.setBounds(10,50,200,20);
        insertarPropiedad.setBounds(230,50,200,20);
        retirarPropiedad.setBounds(440,50,200,20);
        retirarPropietario.setBounds(660,50,200,20);
        imprimir.setBounds(600, 100, 100, 20);
        panel.add(insertarPropietario);
        panel.add(insertarPropiedad);
        panel.add(retirarPropiedad);
        panel.add(retirarPropietario);
        panel.add(numero);
        panel.add(resultado);
        panel.add(rh);
        panel.add(imprimir);
        panel.add(nom);
        panel.add(val);
        JTextField dato=new JTextField();
        JTextField nombre=new JTextField();
        JTextField valor=new JTextField();
        dato.setBounds(100, 100, 100, 20);
        nombre.setBounds(300, 100, 100, 20);
        valor.setBounds(480,100,100,20);
        panel.add(dato);
        panel.add(nombre);
        panel.add(valor);
        ActionListener accioninsertar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num=dato.getText();
                String nom=nombre.getText();
                int d=Integer.parseInt(num);
                lista.insertarPropietario(d,nom);
                
                
            }
        };
        insertarPropietario.addActionListener(accioninsertar);
        
        ActionListener accionbuscar = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int d=Integer.parseInt(dato.getText());
                String nomp=nombre.getText();
                float v=Float.parseFloat(valor.getText());
                
            };
        };
        insertarPropiedad.addActionListener(accionbuscar);
        
        ActionListener accionimprimir=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                resultado.setText(lista.imprimir());
                rh.setText(lista.getRh());
                
            }
        };
        retirarPropiedad.addActionListener(accionimprimir);
        
        ActionListener accionretirar=new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int d=Integer.parseInt(dato.getText());
                

                
            }
        };
        retirarPropietario.addActionListener(accionretirar);
    }
}