/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab3punto1;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author nico4
 */
public class Commit {
        //Atributos
    	String autor;                                                       //Nombre del autor del commit
	String comentario;                                                  //Comentario
        String fecha;                                                       //Fecha de creacion del commit
        List<TextoArchivo> listaArchivos = new ArrayList<TextoArchivo>();   //Lista de archivos
        List<TextoArchivo> diferencias = new ArrayList<TextoArchivo>();     //Lista de archivos con las diferencias respecto al commit anterior
        
        // Constructor
        /**
         * Inicializa las variables autor y comentario al crear un commit
         * @param autor String con el nombre del commit
         * @param comentario String comentario del commit
         */
        public Commit(String autor, String comentario) {
            Date fechaActual = new Date();                                      //Variable para general la fecha del commit
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
            this.fecha = formatoFecha.format(fechaActual);
            this.autor = autor;
            this.comentario = comentario;
        }
        //Metodos
        /**
         * Metodo Get para obetener datos del commit
         * @param commit Commit del cual se quiere obtener el dato
         * @param dato String del nombre del dato que se requiere
         * @return Retorna un String con el dato solicitado 
         */        
        public String datoGet(Commit commit, String dato){
            String devolvio = new String();
            switch(dato){
                case "autor":
                    devolvio = commit.autor;
                    break;
                    
                case "comentario":
                    devolvio = commit.comentario;
                    break;
                    
                case "fecha":
                    devolvio = commit.fecha;
                    break;                    
            }
            return devolvio;
        }
        
        /**
         * Metodo Get para obtener la lista de archivos
         * @return Lista de archivos del commit.
         */
        public List<TextoArchivo> getArchivos(){
            return listaArchivos;
        }
        
        /**
         * Metodo Get para obtener la lista de diferencias 
         * @return Lista de las diferencias con al commit anterior.
         */
        public List<TextoArchivo> getDiferencias(){
            return diferencias;
        }        
    
}
