package com.example.API.RES.G4.servicios;

import com.example.API.RES.G4.modelos.Enfermedad;
import com.example.API.RES.G4.modelos.Paciente;
import com.example.API.RES.G4.repositorios.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnfermedadServicio {

    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    public Enfermedad registroEnfermedad(Enfermedad datosEnfermedades) throws Exception{

        try {
            return iRepositorioEnfermedad.save(datosEnfermedades);

        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<Enfermedad> buscarEnfermedad() throws Exception{
        try {
            return iRepositorioEnfermedad.findAll();
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
}
