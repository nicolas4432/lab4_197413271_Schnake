/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usach.lab3punto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nico4
 */
public class Index {
    //Atributos
    List<TextoArchivo> listaArchivos = new ArrayList<TextoArchivo>();   //Lista de atchivos

    //Metodos
    /**
     * Metodo para agregar archivos al index
     * @param archivo Archivo que ser agrega al lista de index
     */
    public void agregarArchivoI(TextoArchivo archivo){
        listaArchivos.add(archivo);
    }    

    /**
     * Metodo Get para obtener la lista de archivos
     * @return Lista de archivos del commit.
     */
    public List<TextoArchivo> getArchivos(){
        return listaArchivos;
    }    
    
}
