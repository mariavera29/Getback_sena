package com.sena.getback.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "cuentaCocina")
public class CuentaCocina {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime fechaHora;

	private BigDecimal monto;

	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "pedido_id")
	private Pedido pedido;

	public CuentaCocina() {
	}

	public CuentaCocina(LocalDateTime fechaHora, BigDecimal monto, Usuario usuario) {
		this.fechaHora = fechaHora;
		this.monto = monto;
		this.usuario = usuario;
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

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "CuentaCocina{" + "id=" + id + ", fechaHora=" + fechaHora + ", monto=" + monto + ", descripcion='"
				+ descripcion + '\'' + ", usuario=" + usuario + ", pedido=" + pedido + '}';
	}
}