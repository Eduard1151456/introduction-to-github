/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author estudiante
 */
public class Fotografia {
    
    private String nombre, descripcion;
    private int cx, cy;

    public Fotografia() {
    }

    public Fotografia(String nombre, String descripcion, int cx, int cy) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.cx = cx;
        this.cy = cy;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCx() {
        return cx;
    }

    public void setCx(int cx) {
        this.cx = cx;
    }

    public int getCy() {
        return cy;
    }

    public void setCy(int cy) {
        this.cy = cy;
    }
    
    
}
