package com.example.propuestacultura.services;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.Notificaciones;
import com.example.propuestacultura.repositories.INotificacionesRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificacionesServicio {
    @Autowired
    INotificacionesRepositorio iNotificacionesRepositorio;

    public Notificaciones agregarNotificacion(Notificaciones notificaciones) throws Exception{
        try {
            //Aplico las validaciones necesarias
            //llama al repositorio e intenta realizar la op en BD
            return this.iNotificacionesRepositorio.save(notificaciones);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }

    }

    public List<Notificaciones> buscarTodosNotificacion()throws Exception{
        try {
            return this.iNotificacionesRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
