package com.umanizales.apipaseoperros.service;

import com.umanizales.apipaseoperros.model.Empleado;
import com.umanizales.apipaseoperros.model.ListaSE;
import com.umanizales.apipaseoperros.model.Perro;
import org.springframework.stereotype.Service;

@Service
public class ListaSEService {
    //creacion de un objeto para que el servicio trabaje con una listaSE y tenga metodos
    private ListaSE listaSE;

    //constructor vacio
    public ListaSEService() {
        this.listaSE = new ListaSE();
        ///simular que una BD llenará la lista

        listaSE.adicionarNodo(new Empleado("Camilo", "1234567", 4000000));
        listaSE.adicionarNodo(new Empleado("Juan", "362864382", 2500000));
        //listaSE.adicionarNodo(new Perro("Juan", "362864382", "labrador"));
        listaSE.adicionarNodoInicio(new Perro("Catalina","333333", "Daschund"));

    }

    //Servicio con la capacidad de decir cuantos nodos hay
    public int contarNodos()
    {
        return listaSE.getCont();
    }

    //Servicio con la capacidad de listar nodos
    public String listarNodos()
    {
        return listaSE.listadoNodos();
    }

    //Servicio para eliminar un nodo
    public String eliminarNodo(){
        return listaSE.listadoNodos();
    }

    public int adicionarNodoInicio(){
        return listaSE.getCont();
    }

    /*public String invertir(){
        return listaSE.listadoNodos();
    }*/



}
