package com.sena.getback.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedidos")
public class Pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDateTime fechaHora;

	private BigDecimal total;

	private String observaciones;

	@ManyToOne
	@JoinColumn(name = "mesa_id", nullable = false)
	private Mesas mesa;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "estado_id", nullable = false)
	private Estados estado;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<DetallesPedido> detallesPedido;

	@OneToMany(mappedBy = "pedido")
	private List<CuentaBar> cuentasBar;

	@OneToMany(mappedBy = "pedido")
	private List<CuentaCocina> cuentasCocina;

	public Pedido() {
	}

	public Pedido(LocalDateTime fechaHora, Mesas mesa, Usuario usuario, Estados estado) {
		this.fechaHora = fechaHora;
		this.mesa = mesa;
		this.usuario = usuario;
		this.estado = estado;
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

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Mesas getMesa() {
		return mesa;
	}

	public void setMesa(Mesas mesa) {
		this.mesa = mesa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Estados getEstado() {
		return estado;
	}

	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public List<DetallesPedido> getDetallesPedido() {
		return detallesPedido;
	}

	public void setDetallesPedido(List<DetallesPedido> detallesPedido) {
		this.detallesPedido = detallesPedido;
	}

	public List<CuentaBar> getCuentasBar() {
		return cuentasBar;
	}

	public void setCuentasBar(List<CuentaBar> cuentasBar) {
		this.cuentasBar = cuentasBar;
	}

	public List<CuentaCocina> getCuentasCocina() {
		return cuentasCocina;
	}

	public void setCuentasCocina(List<CuentaCocina> cuentasCocina) {
		this.cuentasCocina = cuentasCocina;
	}

	@Override
	public String toString() {
		return "Pedidos{" + "id=" + id + ", fechaHora=" + fechaHora + ", total=" + total + ", observaciones='"
				+ observaciones + '\'' + ", mesa=" + mesa + ", usuario=" + usuario + ", estado=" + estado + '}';
	}
}