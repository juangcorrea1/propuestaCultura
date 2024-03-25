package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.services.EstadosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/estado")
public class EstadosControlador {

    @Autowired
    EstadosServicio estadosServicio;

    @PostMapping
    public ResponseEntity<Estados> agregarEstado(@RequestBody Estados datosEstado){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(estadosServicio.agregarEstado(datosEstado));

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }

    @GetMapping
    public ResponseEntity<List<Estados>> buscarTodos(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(estadosServicio.buscarTodosEstados());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

}
