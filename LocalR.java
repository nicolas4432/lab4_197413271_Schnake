/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nico4
 */
public class LocalR {
    //Atributos
    List<Commit> listaCommits = new ArrayList<>();  //Lista de commits
    
    //Metodos
    /**
     * Metodo Get para obtener la lista de commits
     * @return Lista de commits del respositorio local.
     */
    public List<Commit> getCommits(){
        return listaCommits;
    }    
}
