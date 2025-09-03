package com.sena.getback.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;

	private String descripcion;

	private BigDecimal precio;

	private BigDecimal costoPreparacion;

	private Integer tiempoPreparacion;

	@Column(name = "disponible", nullable = false)
	private Boolean disponible = true;

	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private CategoriasProducto categoria;

	@OneToMany(mappedBy = "producto")
	private List<DetallesPedido> detallesPedidos;

	public Productos() {
	}

	public Productos(String nombre, String descripcion, BigDecimal precio, CategoriasProducto categoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
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

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getCostoPreparacion() {
		return costoPreparacion;
	}

	public void setCostoPreparacion(BigDecimal costoPreparacion) {
		this.costoPreparacion = costoPreparacion;
	}

	public Integer getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(Integer tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public Boolean getDisponible() {
		return disponible;
	}

	public void setDisponible(Boolean disponible) {
		this.disponible = disponible;
	}

	public CategoriasProducto getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriasProducto categoria) {
		this.categoria = categoria;
	}

	public List<DetallesPedido> getDetallesPedidos() {
		return detallesPedidos;
	}

	public void setDetallesPedidos(List<DetallesPedido> detallesPedidos) {
		this.detallesPedidos = detallesPedidos;
	}

	@Override
	public String toString() {
		return "Productos{" + "id=" + id + ", nombre='" + nombre + '\'' + ", descripcion='" + descripcion + '\''
				+ ", precio=" + precio + ", costoPreparacion=" + costoPreparacion + ", tiempoPreparacion="
				+ tiempoPreparacion + ", disponible=" + disponible + ", categoria=" + categoria + '}';
	}
}