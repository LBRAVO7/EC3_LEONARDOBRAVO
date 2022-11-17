package com.ec3leonardobravo.cita.model;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="recepcionista")
public class Recepcionista {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRecepcionista;
	private Integer nombre;
	private Integer celular;
	
	@ManyToOne
	@JoinColumn(name = "id_especialidad", nullable = false, unique = true, foreignKey = @ForeignKey(foreignKeyDefinition ="foreign key (id_especialidad) references especialidades(id_especialidad)"))
	private Especialidad especialidades;
	
	
	
	public Integer getIdRecepcionista() {
		return idRecepcionista;
	}
	public void setIdRecepcionista(Integer idRecepcionista) {
		this.idRecepcionista = idRecepcionista;
	}
	public Integer getNombre() {
		return nombre;
	}
	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	
	
	
	
	

}
