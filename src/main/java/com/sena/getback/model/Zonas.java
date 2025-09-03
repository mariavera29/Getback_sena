package com.sena.getback.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "zonas")
public class Zonas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;

	private String descripcion;

	@OneToMany(mappedBy = "zona")
	private List<Mesas> mesas;

	public Zonas() {
	}

	public Zonas(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Mesas> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesas> mesas) {
		this.mesas = mesas;
	}

	@Override
	public String toString() {
		return "Zonas{" + "id=" + id + ", nombre='" + nombre + '\'' + ", descripcion='" + descripcion + '\'' + '}';
	}
}