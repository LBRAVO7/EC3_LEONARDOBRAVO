package com.ec3leonardobravo.cita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ec3leonardobravo.cita.model.Especialidad;

@Repository
public interface EspecialidadRepository extends JpaRepository<Especialidad,Integer>{

}
