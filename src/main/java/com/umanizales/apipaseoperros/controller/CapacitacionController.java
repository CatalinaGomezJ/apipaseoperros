package com.umanizales.apipaseoperros.controller;

import com.umanizales.apipaseoperros.model.Empleado;
import com.umanizales.apipaseoperros.service.ListaSEService;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/capacitacion")
@Validated

public class CapacitacionController {

    //OBJETO
    private ListaSEService listaSEService;

    @Autowired //Cuando se cree el controlador él va a instanciar un servicio y se lo va a asignar a la variable listaSEService
    //Constructor del objeto listaSEService
    //Como no tiene NEW está por inyección de dependencia(sólo lo va a hacer cuando lo necesite)
    public CapacitacionController(ListaSEService listaSEService) {
        this.listaSEService = listaSEService;
    }

    @GetMapping
    public Empleado getEmployee(){
        Empleado gomez = new Empleado("Catalina Gomez", "1053846527", 3500000);
        return gomez;
    }

    @GetMapping(path = "/empleados")
    public Empleado[] getAllEmployees(){
        Empleado[] empleados = new Empleado[3];
        empleados[0]= new Empleado("Catalina Gomez", "1053846527", 3500000);
        empleados[1]= new Empleado("Carlos Loaiza", "11111000101", 3500000);
        empleados[2]= new Empleado("Daniel Santa", "1053827699", 25000000);
        return empleados;
    }

    @PostMapping
     public Empleado crearEmpleado(@RequestBody Empleado employee){

        //simular que recibo un empleado y lo mando a guardar
         // En bds y recalcular una bonificacion del 15%
         //Guarda en bds
         employee.setSalario(employee.getSalario()*1.15);
         return employee;
     }

     @GetMapping(path = "/count")
     public int getCountEmpleados()
     {
         return listaSEService.contarNodos();
     }

    @GetMapping(path = "/listar")
    public String getTotalEmployees()
    {
        return listaSEService.listarNodos();
    }

    /*@GetMapping(path = "/invertir")
    public String getInvertirEmpleados(){
        return listaSEService.invertir();
    }*/

    @GetMapping(path = "/adicionarInicio")
    public int getAdicionarInicio()
    {
        return listaSEService.contarNodos();
    }


}
