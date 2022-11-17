package com.ec3leonardobravo.cita.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="especialidades")
public class Especialidad {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEspecialidad;
	private Integer especialidad;
	private Integer diasatiende;
	
	
	@ManyToMany(mappedBy = "especialidades", cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	private List<Hospital> hospital= new ArrayList<>();
	
	@OneToMany(mappedBy = "especialidades")
	private List<Recepcionista> recepcionista = new ArrayList<>();
	
	
	public Integer getIdEspecialidad() {
		return idEspecialidad;
	}
	public void setIdEspecialidad(Integer idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	public Integer getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Integer especialidad) {
		this.especialidad = especialidad;
	}
	public Integer getDiasatiende() {
		return diasatiende;
	}
	public void setDiasatiende(Integer diasatiende) {
		this.diasatiende = diasatiende;
	}

}
