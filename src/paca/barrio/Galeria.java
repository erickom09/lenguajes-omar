/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paca.barrio;

/**
 *
 * @author T-107
 */
public class Galeria {
    private String Titulo;
    private String Description;
    private String url;

    public Galeria(String Titulo, String Description, String url) {
        this.Titulo = Titulo;
        this.Description = Description;
        this.url = url;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    
}
