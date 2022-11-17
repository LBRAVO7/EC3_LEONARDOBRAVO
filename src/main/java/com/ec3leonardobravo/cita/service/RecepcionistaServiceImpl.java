package com.ec3leonardobravo.cita.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ec3leonardobravo.cita.model.Recepcionista;
import com.ec3leonardobravo.cita.repository.RecepcionistaRepository;

@Service
public class RecepcionistaServiceImpl implements RecepcionistaService {

	@Autowired
	private RecepcionistaRepository repositorio;
	
	@Override
	public void guardar(Recepcionista recepcionistas) {
		// TODO Auto-generated method stub
		repositorio.save(recepcionistas);
		
	}

	@Override
	public void actualizar(Recepcionista recepcionistas) {
		// TODO Auto-generated method stub
		repositorio.saveAndFlush(recepcionistas);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repositorio.deleteById(id);
	}

	@Override
	public List<Recepcionista> listar() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Recepcionista obtener(Integer id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id).orElse(null);
	}
	

}
