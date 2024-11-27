package com.example.API.RES.G4.repositorios;

import com.example.API.RES.G4.modelos.SignoVital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorioSignoVital extends JpaRepository<SignoVital,Long> {
}
