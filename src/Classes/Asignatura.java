/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Frames.InicioSeccion.usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Asignatura {

    String Nombre;
    String descripcion;  //ESTO LO HIZO VALERIA
    String codigo;
    ArrayList<Tema> temas;
    ArrayList<Pregunta> preguntas = new ArrayList();

    public Asignatura(String Nombre, String desc, String cod) {
        this.Nombre = Nombre;
        this.codigo = cod;
        this.descripcion = desc;  //ESTO LO HIZO VALERIA
        this.temas = new ArrayList();
        try {
            setTemas();
        } catch (IOException ex) {
            Logger.getLogger(Asignatura.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void AddTema(Tema AdTema) {
        this.getTemas().add(AdTema);
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setTemas(ArrayList<Tema> temas) {
        this.temas = temas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public void setTemas() throws FileNotFoundException, IOException {

        File f = new File("Profesor\\" + usuario + "\\" + Nombre + "\\Temas.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        Metodos e = new Metodos();
        int h = 0;
        while (br.ready()) {
            String linea = br.readLine();
            String nombre, descripcion;
            if (linea != null && linea!="") {
                String[] Desco = linea.split(";");
                nombre = Desco[0];
                descripcion = Desco[1];  //ESTO LO HIZO VALERIA
                addTema(new Tema(nombre, descripcion, this));
            }
        }
        fr.close();
        br.close();
    }

    /**
     * Agrega un tema
     *
     * @param t Tema recibido y lo agrega a los demas temas
     */
    public void addTema(Tema t) {
        t.addAsignatura(this);
        temas.add(t);
    }

    public Tema getTema() {
        Tema tema = null;
        for (Tema t : temas) {

        }
        return tema;
    }

    public boolean VerificarTema2(String Tema, String Descripcion) {
        for (Tema tema1 : temas) {
            if (tema1.getNombre().equals(Tema)) {
                JOptionPane.showMessageDialog(null, "El nombre ya fue usado en otro tema.");
                return true;
            }
        }
        return false;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getDescripcion() {  //ESTO LO HIZO VALERIA
        return descripcion;
    }

    public ArrayList<Tema> getTemas() {
        return this.temas;
    }

    public String getCodigo() {
        return codigo;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void addPregunta(Pregunta p) {
        preguntas.add(p);
    }

}
