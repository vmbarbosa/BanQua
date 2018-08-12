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
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Profesor {

    ArrayList<Asignatura> Asignaturas = new ArrayList();

    public Profesor() {
        this.Asignaturas = new ArrayList();
        try {
            setAsignaturas();
        } catch (IOException ex) {
            Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setAsignaturas() throws FileNotFoundException, IOException {

        File f = new File("Profesor/" + usuario + "/Asignatura.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        Metodos e = new Metodos();
        int h = 0;
        while (br.ready()) {
            String linea = br.readLine();
            String Nombre, desc, cod;
            if (linea != null) {
                Nombre = e.Desco(linea, 1, ";");
                cod = e.Desco(linea, 2, ";");
                desc = e.Desco(linea, 3, ";");   //ESTO LO HIZO VALERIA
                AddAsignatura(new Asignatura(Nombre, desc, cod));
            }
        }
    }

    public void AddAsignatura(Asignatura asigna) {
        Asignaturas.add(asigna);
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return this.Asignaturas;
    }

    public void ActualizarDatos() {
        String Nasig;
        String Ntema;
        String Dpreg;
        for (Asignatura Asignatura : Asignaturas) {
            Nasig = Asignatura.Nombre;
            for (Tema temas : Asignatura.temas) {
                Ntema = temas.Nombre;
                for (int i = 1; i < 4; i++) {
                    Boolean verificador = false;
                    for (Pregunta preg : temas.getPreguntas(i)) {
                        if (!preg.fecha.equals( "--------")) {
                            verificador = Desbloqueador(preg.fecha + "/"); //Se le pone el / extra porque el metodo desco necesita que el caracter que se le indique
                            if (verificador.equals(true)) {//es el encargado de separar los elementos en este caso año, mes y dia. qudaria algo asi yyyy/MM/dd/. 
                                preg.setEstado("Disponible");
                                preg.setFecha("--------");
                                try {
                                    SobreEscribir(temas.getPreguntas(i), Nasig, Ntema, i);
                                } catch (IOException ex) {
                                    Logger.getLogger(Profesor.class.getName()).log(Level.SEVERE, null, ex);
                                }

                            }
                        }
                    }

                }
            }
        }
    }

    private void SobreEscribir(ArrayList<Pregunta> p, String a, String b, int c) throws IOException {
        String L = "";
        for (Pregunta pregunta : p) {
            String info = pregunta.getNivel() + ";" + pregunta.getContenido() + ";" + pregunta.getEstado() + ";" + pregunta.getFecha() + ";";
            L = L + info + "\r\n";
        }
        File f = new File("Profesor/" + usuario + "/" + a + "/" + b + "/Preguntas_" + c + ".txt");
        FileWriter fw = new FileWriter(f);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(L);

        pw.close();
        fw.close();
    }

    public boolean Desbloqueador(String x) {
        Metodos e = new Metodos();
        int Dia = Integer.parseInt(e.Desco(x, 3, "/"));
        int Mes = Integer.parseInt(e.Desco(x, 2, "/"));
        int Año = Integer.parseInt(e.Desco(x, 1, "/"));
        int MesOpen = (18 + Mes) % 12;
        int AñoOpen = ((18 + Mes) / 12) + Año;
        if (MesOpen == 0) {
            MesOpen = 1;
            AñoOpen -= 1;
        }
        Date date = new Date();
        DateFormat DFY = new SimpleDateFormat("yyyy");
        DateFormat DFM = new SimpleDateFormat("MM");
        DateFormat DFD = new SimpleDateFormat("dd");
        int AñoDef = Integer.parseInt(DFY.format(date));
        int MesDef = Integer.parseInt(DFM.format(date));
        int DiaDef = Integer.parseInt(DFD.format(date));
        if (AñoDef >= AñoOpen) {
            if (AñoDef == AñoOpen) {
                if (MesDef >= MesOpen) {
                    if (MesDef == MesOpen) {
                        if (DiaDef >= Dia) {
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
