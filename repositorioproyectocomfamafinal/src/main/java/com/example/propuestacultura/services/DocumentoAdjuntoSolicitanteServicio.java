package com.example.propuestacultura.services;

import com.example.propuestacultura.models.Estados;
import com.example.propuestacultura.models.FormatosAdjuntoSolicitante;
import com.example.propuestacultura.repositories.IFormatosAdjuntosSolicitanteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentoAdjuntoSolicitanteServicio {
    @Autowired
    IFormatosAdjuntosSolicitanteRepositorio iFormatosAdjuntosSolicitanteRepositorio;

    public FormatosAdjuntoSolicitante agregarFormatoAdjuntoSolicitante(FormatosAdjuntoSolicitante formatosAdjuntoSolicitante) throws Exception{
        try {
            //Aplico las validaciones necesarias
            //llama al repositorio e intenta realizar la op en BD
            return this.iFormatosAdjuntosSolicitanteRepositorio.save(formatosAdjuntoSolicitante);
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }

    }
    //BUSCAR TODOS LOS ESTADOS QUE HAY EN UNA BD
    public List<FormatosAdjuntoSolicitante> buscarTodosFormatosAdjuntosSolicitantes()throws Exception{
        try {
            return this.iFormatosAdjuntosSolicitanteRepositorio.findAll();

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}

