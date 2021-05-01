/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umanizales.apipaseoperros.model;

import com.umanizales.apipaseoperros.model.excepcion.ListaSEExcepcion;
import java.io.Serializable;

/**
 *
 * @author CatalinaGomezJ
 */
public class ListaSE implements Serializable{
   
    private Nodo cabeza;
    
    //Agregación con Nodo
    //public Nodo _nodo;
    private int cont;

    public ListaSE() {
        this.cont=0;
    }

    //Getter
    public Nodo getCabeza() {
        return cabeza;
    }

    //Setter
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }
    
    //Método para adicionar un Nodo
    public void adicionarNodo(Object dato)
    {
        if(cabeza==null)
        {
            cabeza = new Nodo(dato);
            cont++;
        }
        else
        {
            Nodo temp= cabeza;
            while(temp.getSiguiente()!=null)
            {
                temp.setSiguiente(temp.getSiguiente());
            }
            // En el ultimo
            temp.setSiguiente(new Nodo(dato));
            cont++;
        }
    }


    //Método para adicionar niño al inicio
    public boolean adicionarNodoInicio(Object dato){
        if (cabeza == null){
            cabeza = new Nodo(dato);
        }
        else{
            Nodo temp = cabeza;
            temp.setSiguiente(cabeza);
            cabeza = new Nodo(dato);
        }
        return true;
    }
    
    //Método para contar nodos
    public int contarNodos(){
        if (cabeza == null){
            return 0;
        }
        else{
            //Contador
            int contador = 1;
            //temp se asocia a cabeza.
            Nodo temp = cabeza; 
            
            while(temp.getSiguiente()!=null){
                contador = contador+1;
                temp = temp.getSiguiente();
            }
            return contador;     
               
        }
    }
    
    //Metodo para invertir
    public void invertir(){
        if (cabeza!= null){
            //creo un objeto lista temporal de tipo listaSE 
            ListaSE listaTemp = new ListaSE();
            //temp se asocia a cabeza
            Nodo temp = cabeza;
            //mientras temp no esté vacío:
            while (temp!= null){
                Nodo nodoNuevo = new Nodo(temp.getDato());
                //adiciono el nodo nuevo a la lista temporal
                listaTemp.adicionarNodoInicio(nodoNuevo);
                temp = temp.getSiguiente();
            }
            //cabeza se asocia a la cabeza de la lista temporal
            cabeza = listaTemp.getCabeza();
        }  
    }
    
    //Método eliminar nodo
    //paso por parametro la posicion para que siempre se tenga que dar
    public void eliminarNodo(int posicionNodo){
        if (cabeza!= null){
            //En caso que el nodo a eliminar esté en la primera posición:
            if (posicionNodo == 1) {
                Nodo temp = cabeza.getSiguiente();
                cabeza = temp;
            }            
            //Si el nodo a eliminar está en una posición diferente a la primera:
            else{               
                //Creo dos objetos:
                //anteriorNodo: va a tener la posición del nodo anterior al que voy a eliminar.
                //siguienteNodo: va a tener la posición del nodo que está después al que voy a eliminar.
                Nodo anteriorNodo, siguienteNodo;
               
                anteriorNodo = cabeza;
                siguienteNodo = cabeza.getSiguiente();

                int contador = 1;
                //mientras el siguiente nodo no esté vacío y el contador no esté de último:
                while (siguienteNodo!= null && contador!= posicionNodo - 1){
                    anteriorNodo = anteriorNodo.getSiguiente();
                    siguienteNodo = siguienteNodo.getSiguiente();
                    contador = contador+1;                 
                }
                if (contador == posicionNodo -1){
                    //asigno al anterior nodo el siguiente.
                    anteriorNodo.setSiguiente(siguienteNodo.getSiguiente());
                    //asigno al siguiente nodo el anterior para que se unan una vez eliminado el nodo que tenian en medio.
                    siguienteNodo = anteriorNodo.getSiguiente();
                }
            }           
        }
        else{
            System.out.print("la lista está vacía");
        }
    }
    
    //Método para cambiar la posición entre el primero y el último nodo
    public void primeroUltimo(){
        if (cabeza!= null){
            //temp se asocia a cabeza
            Nodo temp = cabeza;
            //mientras la siguiente posicion no esté vacía:
            //En el primer nodo
            while(temp.getSiguiente()!=null){
                //temp toma el valor del siguiente nodo
                temp = temp.getSiguiente();
            }
            
            //En el ultimo nodo
            //Crea un infante que se llama tempUltimo y se le asigna la cabeza
            Object tempUltimo = cabeza.getDato();
            //Asigna datos del temporal a la cabeza
            cabeza.setDato(temp.getDato());
            //al temporal se le asigna el tempUltimo que es el Infante que ahora está en la cabeza
            temp.setDato(tempUltimo);
        }
        else{
            System.out.print("la lista está vacía");
        }
    }
    
    public String listadoNodos(){
        String listado = "";
        Nodo temp = cabeza;
        while (temp!=null){
            listado=listado + temp.getDato();
            temp = temp.getSiguiente();
        }
        return listado;
    }

    //Getter para retornar el contador de la lista ya que es private
    public int getCont() {
        return cont;
    }
}
