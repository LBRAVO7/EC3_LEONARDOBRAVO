package com.ec3leonardobravo.cita.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="hospitales")
public class Hospital {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospital;
	private Integer nombre;
	private Integer descripcion;
	private Integer distrito;
	
	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "hospital_especialidad", joinColumns = @JoinColumn(
			name="id_hospital", nullable = false, unique= true, foreignKey =
					@ForeignKey(foreignKeyDefinition = "foreign key(id_hospital) references hospital(id_hospital)")),
			inverseJoinColumns = @JoinColumn(
					name = "id_especialidad", nullable = false, unique = true, foreignKey = @ForeignKey(
							foreignKeyDefinition = "foreign key(id_especialidad) references especialidades(id_especialidad)")))
	private List<Especialidad> especialidades = new ArrayList<>();
	
	
	
	
	
	
	
	
	public Integer getIdHospital() {
		return idHospital;
	}
	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}
	public Integer getNombre() {
		return nombre;
	}
	public void setNombre(Integer nombre) {
		this.nombre = nombre;
	}
	public Integer getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(Integer descripcion) {
		this.descripcion = descripcion;
	}
	public Integer getDistrito() {
		return distrito;
	}
	public void setDistrito(Integer distrito) {
		this.distrito = distrito;
	}
	

	
}
