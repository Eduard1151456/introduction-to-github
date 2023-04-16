/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private String nick;
    private int edad;
    private String clave;
    private String correo;
    private ArrayList<Fotografia> fotos;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String nick, int edad, String clave, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nick = nick;
        this.edad = edad;
        this.clave = clave;
        this.correo = correo;
        this.fotos = new ArrayList<>();
    }
    
    public void agregarFotografia(Fotografia foto) {
        fotos.add(foto);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public ArrayList<Fotografia> getFotos() {
        return fotos;
    }
    public void setFotos(ArrayList<Fotografia> fotos) {
        this.fotos = fotos;
    }
    
    
}
