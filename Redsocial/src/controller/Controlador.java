/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import model.RedSocial;
import vista.Formulario;

public class Controlador implements ActionListener {
    
    private RedSocial redSocial=null;
    private Formulario formulario=null;

    public Controlador(RedSocial redSocial,Formulario formulario) {
        super();
        this.redSocial = redSocial;
        this.formulario = formulario;
        actionListener(this);
        
    }
    
    private void actionListener (ActionListener controlador){
        System.out.println("qqqq");
        formulario.btnRegistrar.addActionListener(controlador);
    }

    @Override
    
    public void actionPerformed (ActionEvent e){
        if (e.getActionCommand().contentEquals("Registrar Usuario")){
            String nombre= this.formulario.txtNombre.getText();
            String apellido= this.formulario.txtApellido.getText();
            String nick= this.formulario.txtNick.getText();
            String input = this.formulario.txtEdad.getText();
            int edad = Integer.parseInt(input);
            String clave= this.formulario.txtClave.getText();
            String correo= this.formulario.txtCorreo.getText();
            redSocial.agregarUsuario( nombre, apellido,  nick,  edad,  clave, correo);
            JOptionPane.showMessageDialog(null, "Registro exitoso de:"+"\n"+"Nombre: "+nombre+"\n"+"Apellido: "
                    +apellido+"\n"+"Nick: "+nick+"\n"+"Edad: "+input+"\n"+"Clave: "+clave+"\n"+"Correo: "+correo );
            
    }
        
      
    
 
    
    }
    
    
}
