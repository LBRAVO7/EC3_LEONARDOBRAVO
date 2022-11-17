package com.ec3leonardobravo.cita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ec3leonardobravo.cita.model.Especialidad;
import com.ec3leonardobravo.cita.repository.EspecialidadRepository;

public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	private EspecialidadRepository repositorio;
	
	
	@Override
	public void guardar(Especialidad especialidades) {
		// TODO Auto-generated method stub
		repositorio.save(especialidades);
	}

	@Override
	public void actualizar(Especialidad especialidades) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(especialidades);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Especialidad> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Especialidad obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}

}
