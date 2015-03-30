/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serealizaciones;
import java.io.Serializable;
/**
 *
 * @author Usuario
 */
public class Dirreccion implements Serializable{
   private String Colonia;
 private String municipio;
 private String estado;

    public Dirreccion(String Colonia, String municipio, String estado) {
        this.Colonia = Colonia;
        this.municipio = municipio;
        this.estado = estado;
    }

    public String getColonia() {
        return Colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setColonia(String Colonia) {
        this.Colonia = Colonia;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    } 
}
