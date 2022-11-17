package com.ec3leonardobravo.cita.service;

import java.util.List;

import com.ec3leonardobravo.cita.model.Especialidad;

public interface EspecialidadService {

	void guardar(Especialidad especialidades);
    void actualizar(Especialidad especialidades);
    void eliminar(Integer id);
    List<Especialidad> listar();
    Especialidad obtener(Integer id);
}
