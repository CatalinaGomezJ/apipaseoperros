package com.umanizales.apipaseoperros.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

//Configuro la URL por la que quiero que corra la app
@RequestMapping(path =  "/paseoperros")

//Para quetodoloquenecesito en estructura se cumpla
@Validated
public class PaseoPerrosController {
    /*//GetMapping = cuando llame a paseoperros se va a ejecutar este metodo
    @GetMapping
    public String GetMessage(){
        return "Hola Catalina";
    }

    @GetMapping(path = "/message2")
    public String GettMessage2(){
        return "Segundo mensaje";
    }

    @GetMapping(path = "/message/{saludo}")
    public String GettMessage3(@PathVariable("saludo") String saludo){
        return "Hola "+ saludo;
    }

    @GetMapping(path = "/message/{saludo}/{saludo2}")
    public String GettMessage4(@PathVariable("saludo") String saludo,
                               @PathVariable("saludo2") String saludo2){
        return "Hola "+ saludo + saludo2;
    }*/



}
