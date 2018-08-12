/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.File;

/**
 * @deprecated Esta clase es basura, no interfiere con el codigo
 * @author Victor Barbosa
 * @author Valeria Osorio
 * @author Daniel Valencia
 * @author Jose Sarmiento
 */
public class Carpeta {
    /**
     * Crea una carpeta con el nombre recibido
     * @param nombre Nombre de la carpeta 
     */
    public void crearCarpeta (String nombre){
        File directorio=new File(nombre);
        directorio.mkdirs();
    }
}
