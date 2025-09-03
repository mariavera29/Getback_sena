package com.sena.getback.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bar")
public class Bar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime fechaHora;

	private String descripcion;

	private String tipoMovimiento;

	private Integer cantidad;

	@ManyToOne
	@JoinColumn(name = "producto_id", nullable = false)
	private Productos producto;

	public Bar() {
	}

	public Bar(LocalDateTime fechaHora, String tipoMovimiento, Integer cantidad, Productos producto) {
		this.fechaHora = fechaHora;
		this.tipoMovimiento = tipoMovimiento;
		this.cantidad = cantidad;
		this.producto = producto;
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(String tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Bar{" + "id=" + id + ", fechaHora=" + fechaHora + ", descripcion='" + descripcion + '\''
				+ ", tipoMovimiento='" + tipoMovimiento + '\'' + ", cantidad=" + cantidad + ", producto=" + producto
				+ '}';
	}
}