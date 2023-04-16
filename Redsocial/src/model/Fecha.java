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
public class Fecha {
    
    protected String dia, mes, año;

    public Fecha() {
    }

    public Fecha(String dia, String mes, String año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }
    
    
}
