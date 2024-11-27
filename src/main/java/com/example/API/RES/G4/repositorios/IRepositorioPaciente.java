package com.example.API.RES.G4.repositorios;

import com.example.API.RES.G4.modelos.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioPaciente extends JpaRepository<Paciente,Long> {

}

