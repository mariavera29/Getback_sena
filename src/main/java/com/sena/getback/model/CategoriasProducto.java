
package com.sena.getback.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoriasProducto")
public class CategoriasProducto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	private String descripcion;
	private String tipoCategoria;

	@OneToMany(mappedBy = "categoria")
	private List<Productos> productos;

	public CategoriasProducto() {
	}

	public CategoriasProducto(String nombre, String descripcion, String tipoCategoria) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipoCategoria = tipoCategoria;
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

	public String getTipoCategoria() {
		return tipoCategoria;
	}

	public void setTipoCategoria(String tipoCategoria) {
		this.tipoCategoria = tipoCategoria;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "CategoriasProducto{" + "id=" + id + ", nombre='" + nombre + '\'' + ", descripcion='" + descripcion
				+ '\'' + ", tipoCategoria='" + tipoCategoria + '\'' + '}';
	}
}