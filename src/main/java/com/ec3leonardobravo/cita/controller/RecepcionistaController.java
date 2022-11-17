package com.ec3leonardobravo.cita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ec3leonardobravo.cita.model.Recepcionista;
import com.ec3leonardobravo.cita.service.RecepcionistaService;


@RestController
@RequestMapping("/recepcionistas/v1")
public class RecepcionistaController {
	
	@Autowired
	private RecepcionistaService service;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Recepcionista>>listar(){
		return new ResponseEntity<List<Recepcionista>>(service.listar(), HttpStatus.OK) ;
	}
	
	@RequestMapping(path="/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Recepcionista recepcionistas){
		service.guardar(recepcionistas);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Recepcionista> obtenerPorId(@PathVariable Integer id){
		Recepcionista recepcionistas = service.obtener(id);
		
		if(recepcionistas != null) {
			return new ResponseEntity<Recepcionista>(recepcionistas,HttpStatus.OK);
		}else {
			return new ResponseEntity<Recepcionista>(HttpStatus.NOT_FOUND);
		}
	}
	
	

}
