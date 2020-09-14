/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.usach.lab3punto1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nico4
 */
public class Workspace {
    //Atributos
    List<TextoArchivo> listaArchivos = new ArrayList<TextoArchivo>();       //Lista de archivos

    //Metodos
    /**
     * Metodo para agregar un archivo al workspace
     * @param nombre Nombre del archivo que se desea agregar
     * @param contenido Contenido que tendra el archivo
     */
    public void agregarArchivo(String nombre, String contenido){
        TextoArchivo archivo = new TextoArchivo();
        Date fechaActual = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");                            
        archivo.datoSet(formatoFecha.format(fechaActual), nombre, contenido);
        listaArchivos.add(archivo);
    }
    /**
     * Metodo para obtener un archivo del workspace
     * @param numero Posicion del archivo que se desea obtener
     * @return Retorna el archivo de la posicion ingresada
     */
    public TextoArchivo devolverLista(int numero){
        return listaArchivos.get(numero);
    }
    
}
