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

/**
 * Crea ArrayList con preguntas, esto depende de la dificultad
 *
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Tema {

    String Nombre;
    String descripcion;  //ESTO LO HIZO VALERIA
    Asignatura asignatura;
    ArrayList<Pregunta> preguntas_1 ;
    ArrayList<Pregunta> preguntas_2 ;
    ArrayList<Pregunta> preguntas_3 ;

    public Tema(String titulo, String desc, Asignatura asig) {
        this.Nombre = titulo;
        this.descripcion = desc;  //ESTO LO HIZO VALERIA
        this.asignatura = asig;
        this.preguntas_1 = new ArrayList();
        this.preguntas_2 = new ArrayList();
        this.preguntas_3 = new ArrayList();
        try {
            setPreguntas(1);
            setPreguntas(2);
            setPreguntas(3);
        } catch (IOException ex) {
            Logger.getLogger(Tema.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public ArrayList<Pregunta> getPreguntas_1() {
        return preguntas_1;
    }

    public void setPreguntas_1(ArrayList<Pregunta> preguntas_1) {
        this.preguntas_1 = preguntas_1;
    }

    public ArrayList<Pregunta> getPreguntas_2() {
        return preguntas_2;
    }

    public void setPreguntas_2(ArrayList<Pregunta> preguntas_2) {
        this.preguntas_2 = preguntas_2;
    }

    public ArrayList<Pregunta> getPreguntas_3() {
        return preguntas_3;
    }

    public void setPreguntas_3(ArrayList<Pregunta> preguntas_3) {
        this.preguntas_3 = preguntas_3;
    }

    /**
     * Llena los ArrayList filtrando las preguntas en dificultades, para que
     * cada ArrayList almacene las preguntas
     *
     * @param r
     * @throws FileNotFoundException
     * @throws IOException
     */
    public void setPreguntas(int r) throws FileNotFoundException, IOException {
        File f = new File("Profesor/"+usuario+"/" + asignatura.Nombre + "/" + Nombre + "/Preguntas_" + r + ".txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        Metodos e = new Metodos();
        int h = 0;

        while (br.ready()) {
            String contenido = br.readLine();
            if (contenido != null && !contenido.equals("")) {
                String info = e.Desco(contenido, 2, ";");
                String estado = e.Desco(contenido, 3, ";");
                String fecha = e.Desco(contenido, 4, ";");
                int Dificultad = Integer.parseInt(e.Desco(contenido, 1, ";"));
                
                switch (Dificultad) {
                    case 1:
                        addPregunta_1(new Pregunta(info, 1, estado, fecha));
                        break;
                    case 2:
                        addPregunta_2(new Pregunta(info, 2, estado, fecha));
                        break;
                    case 3:
                        addPregunta_3(new Pregunta(info, 3, estado, fecha));
                        break;
                }
            }
        }
    }
    
    public void EnviarPreguntas(int r,ArrayList<Pregunta> preguntascambio ){
        switch (r) {
                    case 1:
                        preguntas_1 = preguntascambio ;
                        break;
                    case 2:
                        preguntas_2 = preguntascambio ;
                        break;
                    case 3:
                        preguntas_3 = preguntascambio ;
                        break;
                }
    }
    
    public void addAsignatura(Asignatura asig) {
        asignatura = asig;
    }

    public void addPregunta_1(Pregunta e) {
        preguntas_1.add(e);
    }

    public void addPregunta_2(Pregunta e) {
        preguntas_2.add(e);
    }

    public void addPregunta_3(Pregunta e) {
        preguntas_3.add(e);
    }

    public String getNombre() {
        return this.Nombre;
    }

    public ArrayList<Pregunta> getPreguntas(int numero) {
        switch (numero) {
            case 1:
                return this.preguntas_1;

            case 2:
                return this.preguntas_2;

            case 3:
                return this.preguntas_3;

        }
        return null;
    }
    
    

    /*public ArrayList<Pregunta> getPreguntas2() {
        return this.preguntas_2;
    }

    public ArrayList<Pregunta> getPreguntas3() {
        return this.preguntas_3;
    }*/

    /*public String getPregunta1(int i) {
        return this.preguntas_1.get(i).getContenido();
    }

    public String getPregunta2(int i) {
        return this.preguntas_2.get(i).getContenido();
    }

    public String getPregunta3(int i) {
        return this.preguntas_3.get(i).getContenido();
    }*/

    public String getDescripcion() {  //ESTO LO HIZO VALERIA
        return descripcion; 
    }


}
