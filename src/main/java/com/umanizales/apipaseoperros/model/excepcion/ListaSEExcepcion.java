/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umanizales.apipaseoperros.model.excepcion;

/**
 *
 * @author CatalinaGomezJ
 */
public class ListaSEExcepcion extends Exception{
   //La aplicación cada que genere una excepcion de listaSE debe llevar un mensaje
    public ListaSEExcepcion(String string) {
        super(string);
    }
    
}
