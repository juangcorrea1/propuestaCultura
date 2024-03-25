package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestacultura.services.DocumentoAdjuntoSolicitanteServicio;
import com.example.propuestacultura.services.EstadosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/formatoAdjuntoSolicitante")
public class FormatoAdjuntoSolicitanteControlador {
    @Autowired
    DocumentoAdjuntoSolicitanteServicio formatoAdjuntoSolicitanteServicio;

    @PostMapping
    public ResponseEntity<FormatosAdjuntoSolicitante> agregarFormatoAdjuntoSolicitante
            (@RequestBody FormatosAdjuntoSolicitante formatosAdjuntoSolicitante){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(formatoAdjuntoSolicitanteServicio.agregarFormatoAdjuntoSolicitante(formatosAdjuntoSolicitante));

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }

    @GetMapping
    public ResponseEntity<List<FormatosAdjuntoSolicitante>> buscarTodosFormatosAdjuntosSolicitantes(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(formatoAdjuntoSolicitanteServicio.buscarTodosFormatosAdjuntosSolicitantes());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }
}
