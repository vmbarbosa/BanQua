/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 * Contiene diferentes metodos para el uso de archivos
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 * 
 */
public class Archivo {
//    
    /**
     * Crea un archivo
     * @param str Varios Strings
     * @throws IOException 
     */
    
    public void crearArchivo(String...str) throws IOException{
        int cont = 0;
        String archivo = "";
        String contenido = "";
        for (String string : str) {
            if (cont == 0) {
                archivo = string;
            }else{
                contenido = contenido + string +";";
            }
            cont++;
        }
        File f = new File (archivo);
        f.createNewFile();
        
    }
    
    /**
     * Reemplaza un registro
     * @param x Registro a reemplazar
     * @param y Nuevo registro
     * @throws IOException 
     */
    
    public void Sobreescribir(String x, String y) throws IOException{
    
        File F = new File(x);
        FileWriter fw = new FileWriter(F);
        
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter  pw = new PrintWriter(fw);
        
        pw.write(y);
        
        
        pw.close();
        bw.close();
        fw.close();
    }
    
    /**
     * Lee un archivo
     * @param Nombre El nombre del archivo
     * @return La informacion que este en el archivo
     * @throws IOException 
     */
    public String LeerArchivo(String Nombre) throws IOException {
        File F = new File(Nombre);

        FileReader fw = new FileReader(F);

        BufferedReader bw = new BufferedReader(fw);
        String L = "";
        String x = "";
        while (true) {
            x = bw.readLine();

            if (x != null) {
                L = L + x + "\r\n";

            } else {
                break;
            }
        }
        bw.close();
        fw.close();
        return L;
    }
    
    
    
    /**
     * Recibe el nombre de un archivo
     * @param nombre El String recibido
     * @return  Retorna un String a la ultima linea del nombre del archivo recibido
     * @throws IOException 
     */
    public String concatenar(String nombre) throws IOException {
        String temp = this.LeerArchivo(nombre);
        if ("null".equals(temp)) {
            temp = "";
        } else {
            temp = this.LeerArchivo(nombre);
        }
        return temp;
    }
    
}
