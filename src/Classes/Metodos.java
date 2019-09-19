/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Tiene la mayoria de los metodos generales, se crearon asi para mayor
 * organizacion
 *
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Metodos {
    
    public Metodos() {
    }
    
    public String especifico(String Nombre) throws FileNotFoundException, IOException {
        File F = new File(Nombre);
        FileReader fw = new FileReader(F);
        BufferedReader bw = new BufferedReader(fw);
        String es = "";
        String x = "";
        while (bw.ready()) {
            if ("".equals(x)) {
            } else {
                es = x;
            }
            x = AES.decrypt(bw.readLine(), "BanQuaAES");;
            if (x != null && !x.equals("")) {
                es = x + "r";
                
            } else {
                break;
            }
        }
        bw.close();
        fw.close();
        JOptionPane.showMessageDialog(null, es);
        return es;
    }
    
    public void guardar(String temp, String x, String info) throws IOException {
        File F = new File(x);
        FileWriter fw = new FileWriter(F);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);
        if (temp.equals("")) {
            pw.write(AES.encrypt(temp + info, "BanQuaAES"));
        } else {
            System.out.println("[" + temp + "]");
            info = AES.encrypt(info, "BanQuaAES");
            pw.write(temp + info);
        }
        pw.close();
        bw.close();
        fw.close();
    }
    
    public void comboBox(String archivo, JComboBox combo) throws FileNotFoundException, IOException {
        File F = new File(archivo);
        FileReader fr = new FileReader(F);
        BufferedReader br = new BufferedReader(fr);
        String n;
        String line = AES.decrypt(br.readLine(), "BanQuaAES");
        while (line != null) {
            String[] parts = line.split("%%%%%");
            String item = parts[0];
            combo.addItem(item);
            line = AES.decrypt(br.readLine(), "BanQuaAES");
        }
        fr.close();
        br.close();
    }

    /*
        El metodo de leer archivo resive el nombre del archivo y retorna un ArrayList de vectores de String
        Retorna el Array donde cada vector es una linea de registro y cada posiciond del vector es un campo del registro
        que se se paro por coma. 
        Si es que me acuerdo bien, estoy 90% seguro que es asi como guarda ese Array.
     */
    public ArrayList<String[]> LeerArchivoDaniel(String Nombre) {
        FileReader fw;
        try {
            File f = new File(Nombre);
            fw = new FileReader(f);
            ArrayList<String[]> registros;
            try (BufferedReader bw = new BufferedReader(fw)) {
                registros = new ArrayList();
                String x;
                while ((x = AES.decrypt(bw.readLine(), "BanQuaAES")) != null) {
                    String[] R = x.split("%%%%%");
                    registros.add(R);
                }
            }
            
            fw.close();
            return registros;
        } catch (IOException o) {
            System.out.println("ERROR " + o.getMessage());
        }
        return null;
    }

    /*
        El metodo encontrar archivo resive el nombre del archivo, el nombre del usuario a validar y J es la posicion
        en el archivo en que se encuentran los diferentes usuarios es decir 
        
        Usuario 1, Contrase 1
        Usuario 2, Contrase 2
     
        en este caso J=1 por que se encuentra en la columna 1, tomando como columnas la separacion por cada coma.        
     */
    public boolean EncontrarUsuario(String NombreArchivo, String Usuario, String pasword, int j) {
        ArrayList<String[]> registros = this.LeerArchivoDaniel(NombreArchivo);
        String nombre;
        for (int i = 0; i < registros.size(); i++) {
            String[] R = registros.get(i);
            nombre = R[j];
            if (nombre.equals(Usuario)) {
                if ((registros.get(i)[j + 1]).equals(pasword)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public String EncontrarNombre(String NombreArchivo, String Usuario) {
        ArrayList<String[]> registros = this.LeerArchivoDaniel(NombreArchivo);
        String nombre = "";
        for (int i = 0; i < registros.size(); i++) {
            nombre = registros.get(i)[2];
            if (nombre.equals(Usuario)) {
                nombre = registros.get(i)[0];
                break;
            }
        }
        return nombre;
    }
    
    public String EncontrarCorreo(String NombreArchivo, String Usuario) {
        ArrayList<String[]> registros = this.LeerArchivoDaniel(NombreArchivo);
        String nombre = "";
        for (int i = 0; i < registros.size(); i++) {
            nombre = registros.get(i)[2];
            if (nombre.equals(Usuario)) {
                nombre = registros.get(i)[5];
                break;
            }
        }
        return nombre;
    }
    
    public String EncontrarCedula(String NombreArchivo, String Usuario) {
        ArrayList<String[]> registros = this.LeerArchivoDaniel(NombreArchivo);
        String nombre = "";
        for (int i = 0; i < registros.size(); i++) {
            nombre = registros.get(i)[2];
            if (nombre.equals(Usuario)) {
                nombre = registros.get(i)[1];
                break;
            }
        }
        return nombre;
    }
    
    public String EncontrarFoto(String NombreArchivo, String Usuario) {
        ArrayList<String[]> registros = this.LeerArchivoDaniel(NombreArchivo);
        String nombre = "";
        for (int i = 0; i < registros.size(); i++) {
            nombre = registros.get(i)[2];
            if (nombre.equals(Usuario)) {
                nombre = registros.get(i)[4];
                break;
            }
        }
        return nombre;
    }
    
    public boolean ValidarPregunta(String NombreArchivo, String PreguntaaValidar, int posicion) {
        ArrayList<String[]> registros = this.LeerArchivoDaniel(NombreArchivo);
        String Pregunta;
        for (int i = 0; i < registros.size(); i++) {
            Pregunta = registros.get(i)[posicion];
            if (Pregunta.equals(PreguntaaValidar)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean confNum(String x) {
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException exe) {
            return false;
        }
    }
    
    public String LeerArchivo2(String Nombre) throws IOException {
        File F = new File(Nombre);
        FileReader fw = new FileReader(F);
        BufferedReader bw = new BufferedReader(fw);
        String L = "";
        String x = "";
        while (x != null) {
            x = AES.decrypt(bw.readLine(), "BanQuaAES");
            System.out.println("Desencriotado" + x + "aqui");
            if (x != null && !x.equals("")) {
                L = L + x + "\r\n";
            }
        }
        bw.close();
        fw.close();
        return L;
        
    }

    public String LeerAes(String Nombre) throws IOException {
        File F = new File(Nombre);
        FileReader fw = new FileReader(F);
        BufferedReader bw = new BufferedReader(fw);
        String L = "";
        String x = "";
        while (x != null) {
            x =bw.readLine();
            if (x != null && !x.equals("")) {
                L = L + x + "\r\n";
            }
        }
        bw.close();
        fw.close();
        return L;
    }
    
    public void modificar_contraseña(String cod, String con) throws FileNotFoundException, IOException {
        File originalFile = new File("C:\\ProgramData\\BanQua\\Usuario.txt");
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        
        File temporal = new File("C:\\ProgramData\\BanQua\\temporal.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(temporal));
        
        String line = null;
        String linea = null;
        int var = 0;
        String temp = "";
        
        while ((line = AES.decrypt(br.readLine(), "BanQuaAES")) != null) {
            if (line.contains(cod)) {
                linea = line;
                StringTokenizer st = new StringTokenizer(linea, "%%%%%");
                
                while (var < 3) {
                    temp = temp + st.nextToken() + "%%%%%";
                    var++;
                }
                temp = temp + con + "%%%%%";
                while (st.hasMoreTokens()) {
                    if (st.nextToken().equals(cod)) {
                        temp = temp + cod + "%%%%%";
                    }
                }
                line = line.replace(line, temp);
            }
            pw.println(AES.encrypt(line, "BanQuaAES"));
            pw.flush();
            
        }
        
        pw.close();
        br.close();
        
        Metodos p = new Metodos();
        String pancreas = p.LeerArchivo2("C:\\ProgramData\\BanQua\\temporal.txt");
        p.Sobreescribir("C:\\ProgramData\\BanQua\\Usuario.txt", pancreas);
        p.Sobreescribir("C:\\ProgramData\\BanQua\\temporal.txt", "");
        
    }
    
    public void Sobreescribir(String direccion, String contenido) throws IOException {
        
        File F = new File(direccion);
        FileWriter fw = new FileWriter(F);
        
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(fw);
        
        pw.write(AES.encrypt(contenido, "BanQuaAES"));
        
        pw.close();
        bw.close();
        fw.close();
    }
    
    public void Eliminar_Linea(String indice, String archivo) throws FileNotFoundException, IOException {
        File originalFile = new File(archivo);
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        
        File temporal = new File("C:\\ProgramData\\BanQua\\temporal.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(temporal));
        
        String line = null;
        
        while ((line = AES.decrypt(br.readLine(), "BanQuaAES")) != null) {
            if (!line.contains(indice)) {
                pw.println(AES.encrypt(line, "BanQuaAES"));
                pw.flush();
            }
        }
        
        pw.close();
        br.close();
        
        Metodos p = new Metodos();
        String nuevo = p.LeerArchivo2("C:\\ProgramData\\BanQua\\temporal.txt");
        p.Sobreescribir(archivo, nuevo);
        p.Sobreescribir("C:\\ProgramData\\BanQua\\temporal.txt", "");
    }
    
    public void modificar(String indice, String archivo) throws FileNotFoundException, IOException {
        String datoAnterior = (String) JOptionPane.showInputDialog(null, "Ingrese dato anterior");
        String datoNuevo = (String) JOptionPane.showInputDialog(null, "Ingrese dato nuevo");
        
        File originalFile = new File(archivo);
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        
        File temporal = new File("C:\\ProgramData\\BanQua\\temporal.txt");
        PrintWriter pw = new PrintWriter(new FileWriter(temporal));
        
        String line = null;
        String linea = null;
        String temp = "";
        
        while ((line = AES.decrypt(br.readLine(), "BanQuaAES")) != null) {
            if (line.contains(indice)) {
                linea = line;
                StringTokenizer st = new StringTokenizer(linea, "%%%%%");
                while (st.hasMoreTokens()) {
                    String token = st.nextToken();
                    if (!token.equals(datoAnterior)) {
                        temp = temp + token + "%%%%%";
                    } else {
                        temp = temp + datoNuevo + "%%%%%";
                    }
                }
                line = line.replace(line, temp);
            }
            pw.println(AES.encrypt(line, "BanQuaAES"));
            pw.flush();
        }
        
        pw.close();
        br.close();
        
        Metodos p = new Metodos();
        String nuevo = p.LeerArchivo2("C:\\ProgramData\\BanQua\\temporal.txt");
        p.Sobreescribir(archivo, nuevo);
        p.Sobreescribir("C:\\ProgramData\\BanQua\\temporal.txt", "");
    }
    
    public int indice(String archivo) throws FileNotFoundException, IOException {
        File originalFile = new File(archivo);
        BufferedReader br = new BufferedReader(new FileReader(originalFile));
        
        String line = null;
        int cont = 0;
        do {
            cont++;
        } while ((line = AES.decrypt(br.readLine(), "BanQuaAES")) != null);
        br.close();
        return cont;
    }
    
    public String concatenar(String nombre) throws IOException {
        String temp = this.LeerAes(nombre);
        if ("null".equals(temp) || "".equals(temp)) {
            temp = "";
        }
        return temp;
    }
    
    public String buscar(String x, String f) throws FileNotFoundException, IOException {
        String y = null;
        String ty = "";
        boolean sw = false;
        String po = f;
        /*int cont =0;*/
        File F = new File(x);
        FileReader fr = new FileReader(F);
        BufferedReader br = new BufferedReader(fr);
        while (sw == false && br.ready()/*&& /*cont<v*/) {
            y = AES.decrypt(br.readLine(), "BanQuaAES");
            for (int i = 0; i < y.length(); i++) {
                if (y.substring(i, i + 1).equals("%%%%%")) {
                    if (ty.equals(po)) {
                        sw = true;
                        
                    } else {
                        ty = "";
                        /*cont=cont+1;*/
                    }
                } else {
                    ty = ty + y.substring(i, i + 1);
                }
            }
        }
        fr.close();
        br.close();
        
        return ty;
        
    }
    
    public boolean verificar(String x, String f) {          //verificar va a decir usando un booleano si x palabra existe en algun campo
        String ty = "";
        boolean j = false;
        String po = f;
        
        for (int i = 0; i < x.length(); i++) {
            if (x.substring(i, i + 1).equals("%%%%%")) {
                if (ty.equals(po)) {
                    j = true;
                    
                } else {
                    ty = "";
                }
            } else {
                ty = ty + x.substring(i, i + 1);
            }
        }
        
        return j;
    }
    
    public int NombreArchivo(String f) {
        
        int x = 0;
        for (int i = 0; i < f.length(); i++) {
            if (f.substring(i, i + 1).equals("\\")) {
                x = i;
            }
        }
        
        return x;
        
    }
    
    public String Desco(String x, int y, String h) {              //Desco se va a encargar que dependiendo de la poscion y, extraer un campo especifico
        int cont = 0;
        int j = 0, i = 0;
        String ty = "";
        while (j == 0) {
            
            if (x.substring(i, i + 1).equals(h)) {
                cont = cont + 1;
                if (cont == y) {
                    j = 1;
                } else {
                    ty = "";
                }
            } else {
                ty = ty + x.substring(i, i + 1);
            }
            i = i + 1;
        }
        
        return ty;
    }
    
    public int Generador_de_Combobox(String x, JComboBox y, int h2) throws FileNotFoundException, IOException {
        
        File f = new File(x);
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String g;
        while (br.ready()) {
            g = AES.decrypt(br.readLine(), "BanQuaAES");
            Metodos p = new Metodos();
            String kp = g.split("%%%%%")[0];
            y.addItem(kp);
            h2 = h2 + 1;
        }
        fr.close();
        br.close();
        return h2;
    }
    
    public void ReincioComboBox(JComboBox... j) {
        for (JComboBox jComboBox : j) {
            jComboBox.setSelectedIndex(0);
        }
    }
    
    public void ReincioJTextField(JTextField... o) {
        for (JTextField jtext : o) {
            jtext.setText("");
        }
    }
    
    public void ReincioTextArea(JTextArea... a) {
        for (JTextArea jTextArea : a) {
            jTextArea.setText("");
        }
    }
}
