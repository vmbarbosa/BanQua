/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * almacena una pregunta con respecto a su contenido y nivel
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Pregunta {

    String contenido;
    String estado;
    String fecha;
    int nivel;

    public Pregunta(String contenido, int nivel, String estado, String fecha) {
        this.contenido = contenido;
        this.estado=estado;
        this.fecha=fecha;
        this.nivel = nivel;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public String getFecha() {
        return fecha;
    }

    public String getContenido() {
        return contenido;
    }

    public int getNivel() {
        return nivel;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    

}
