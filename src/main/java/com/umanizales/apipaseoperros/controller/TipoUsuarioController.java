package com.umanizales.apipaseoperros.controller;

import com.umanizales.apipaseoperros.model.entities.TipoUsuario;
import com.umanizales.apipaseoperros.service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/tipousuario")
@Validated

public class TipoUsuarioController {

    private TipoUsuarioService tipoUsuarioService;

    @Autowired
    public TipoUsuarioController(TipoUsuarioService tipoUsuarioService) {
        this.tipoUsuarioService = tipoUsuarioService;
    }

    @GetMapping
    public Iterable<TipoUsuario> getAllTipoUsuarios(){
        return tipoUsuarioService.getAllTipoUsuarios();
    }
}
