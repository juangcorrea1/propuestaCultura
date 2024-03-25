package com.example.propuestacultura.controllers;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Notificaciones;
import com.example.propuestacultura.services.EstadosServicio;
import com.example.propuestacultura.services.NotificacionesServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/notificaciones")
public class NotificacionesControlador {

    @Autowired
    NotificacionesServicio notificacionesServicio;

    @PostMapping
    public ResponseEntity<Notificaciones> agregarNotificacion(@RequestBody Notificaciones notificaciones){
        try{

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(notificacionesServicio.agregarNotificacion(notificaciones));

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);

        }
    }

    @GetMapping
    public ResponseEntity<List<Notificaciones>> buscarTodosNotificacion(){
        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(notificacionesServicio.buscarTodosNotificacion());
        }catch (Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(null);
        }
    }

}
