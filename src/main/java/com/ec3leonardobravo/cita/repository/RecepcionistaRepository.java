package com.ec3leonardobravo.cita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec3leonardobravo.cita.model.Recepcionista;

@Repository
public interface RecepcionistaRepository extends JpaRepository<Recepcionista,Integer>{

}
