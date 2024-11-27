package com.example.API.RES.G4.servicios;

import com.example.API.RES.G4.modelos.Paciente;
import com.example.API.RES.G4.repositorios.IRepositorioPaciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {

    //para usar un servicio debo llamar al repositorio
    //INYECTAR UNA DEPENDENCIA
    @Autowired
    IRepositorioPaciente iRepositorioPaciente;

    //listo las operaciones que voy a realizar en base de datos

    //registar un paciente
    public Paciente registarPaciente(Paciente datosPaciente) throws Exception{

        try {

            //guardar en la base de datos del paciente
            return iRepositorioPaciente.save(datosPaciente);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }

    //buscar los pacientes
        public List<Paciente> buscarPacientes() throws Exception{
        try {
            return iRepositorioPaciente.findAll();
        }catch (Exception error){
                throw new Exception(error.getMessage());
          }
        }
    //buscar un paciente por id
}
