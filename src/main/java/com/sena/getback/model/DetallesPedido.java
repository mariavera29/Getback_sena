package com.sena.getback.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "detallesPedido")
public class DetallesPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private Integer cantidad;

	private BigDecimal precioUnitario;

	private BigDecimal subtotal;

	private String observaciones;

	@ManyToOne
	@JoinColumn(name = "pedido_id", nullable = false)
	private Pedido pedido;

	@ManyToOne
	@JoinColumn(name = "producto_id", nullable = false)
	private Productos producto;

	public DetallesPedido() {
	}

	public DetallesPedido(Integer cantidad, BigDecimal precioUnitario, Pedido pedido, Productos producto) {
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.pedido = pedido;
		this.producto = producto;
		this.subtotal = precioUnitario.multiply(BigDecimal.valueOf(cantidad));
	}

	// Getters y Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
		this.subtotal = this.precioUnitario.multiply(BigDecimal.valueOf(cantidad));
	}

	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
		this.subtotal = precioUnitario.multiply(BigDecimal.valueOf(this.cantidad));
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Productos getProducto() {
		return producto;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "DetallesPedido{" + "id=" + id + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ ", subtotal=" + subtotal + ", observaciones='" + observaciones + '\'' + ", pedido=" + pedido
				+ ", producto=" + producto + '}';
	}
}