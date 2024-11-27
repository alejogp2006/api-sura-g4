package com.example.API.RES.G4.repositorios;

import com.example.API.RES.G4.modelos.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioMedicamento extends JpaRepository<Medicamento,Long> {
}
