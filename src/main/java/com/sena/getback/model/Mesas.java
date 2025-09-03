package com.sena.getback.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "mesas")
public class Mesas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String numero;

	private Integer capacidad;

	private String estadoMesa;

	@ManyToOne
	@JoinColumn(name = "zona_id", nullable = false)
	private Zonas zona;

	@OneToMany(mappedBy = "mesa")
	private List<Pedido> pedidos;

	public Mesas() {
	}

	public Mesas(String numero, Integer capacidad, String estadoMesa, Zonas zona) {
		this.numero = numero;
		this.capacidad = capacidad;
		this.estadoMesa = estadoMesa;
		this.zona = zona;
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(Integer capacidad) {
		this.capacidad = capacidad;
	}

	public String getEstadoMesa() {
		return estadoMesa;
	}

	public void setEstadoMesa(String estadoMesa) {
		this.estadoMesa = estadoMesa;
	}

	public Zonas getZona() {
		return zona;
	}

	public void setZona(Zonas zona) {
		this.zona = zona;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Mesas{" + "id=" + id + ", numero='" + numero + '\'' + ", capacidad=" + capacidad + ", estadoMesa='"
				+ estadoMesa + '\'' + ", zona=" + zona + '}';
	}
}