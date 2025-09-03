package com.sena.getback.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "eventos")
public class Eventos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;

	private String descripcion;

	private LocalDateTime fechaHoraInicio;

	private LocalDateTime fechaHoraFin;

	@ManyToOne
	@JoinColumn(name = "estado_id", nullable = false)
	private Estados estado;

	public Eventos() {
	}

	public Eventos(String nombre, LocalDateTime fechaHoraInicio, LocalDateTime fechaHoraFin, Estados estado) {
		this.nombre = nombre;
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
		this.estado = estado;
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

	public LocalDateTime getFechaHoraInicio() {
		return fechaHoraInicio;
	}

	public void setFechaHoraInicio(LocalDateTime fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}

	public LocalDateTime getFechaHoraFin() {
		return fechaHoraFin;
	}

	public void setFechaHoraFin(LocalDateTime fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Eventos{" + "id=" + id + ", nombre='" + nombre + '\'' + ", descripcion='" + descripcion + '\''
				+ ", fechaHoraInicio=" + fechaHoraInicio + ", fechaHoraFin=" + fechaHoraFin + ", estado=" + estado
				+ '}';
	}
}