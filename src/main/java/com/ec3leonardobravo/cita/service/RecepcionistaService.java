package com.ec3leonardobravo.cita.service;

import java.util.List;

import com.ec3leonardobravo.cita.model.Recepcionista;

public interface RecepcionistaService {
	
	void guardar(Recepcionista recepcionistas);
    void actualizar(Recepcionista recepcionistas);
    void eliminar(Integer id);
    List<Recepcionista> listar();
    Recepcionista obtener(Integer id);
    
    
}
