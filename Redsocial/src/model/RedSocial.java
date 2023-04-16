/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import controller.Controlador;
import java.util.ArrayList;
import vista.Formulario;

/**
 *
 * @author estudiante
 */
public class RedSocial {
    private ArrayList<Usuario> usuarios;

    public RedSocial() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(String nombre, String apellido, String nick, int edad, String clave, String correo) {
        Usuario usuario = new Usuario(nombre, apellido, nick, edad, clave, correo);
        usuarios.add(usuario);
        
    }

    public Usuario buscarUsuario(String nick) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNick().equals(nick)) {
                return usuario;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        
        Formulario form=new Formulario();
        RedSocial red=new RedSocial();
        Controlador control = new Controlador(red,form);
        
       
    }

    
}
