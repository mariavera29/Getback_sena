package com.sena.getback.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nombre;
	private String username;
	private String email;
	private String password;
	private String telefono;
	private Boolean activo = true;

	@ManyToOne
	@JoinColumn(name = "rol_id", nullable = false)
	private Rol rol;

	@OneToMany(mappedBy = "usuario")
	private List<Pedido> pedidos;

	@OneToMany(mappedBy = "usuario")
	private List<CuentaBar> cuentasBar;

	@OneToMany(mappedBy = "usuario")
	private List<CuentaCocina> cuentasCocina;

	public Usuario() {
	}

	public Usuario(String nombre, String username, String email, String password, Rol rol) {
		this.nombre = nombre;
		this.username = username;
		this.email = email;
		this.password = password;
		this.rol = rol;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
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
		return "Usuarios{" + "id=" + id + ", nombre='" + nombre + '\'' + ", username='" + username + '\'' + ", email='"
				+ email + '\'' + ", password='" + password + '\'' + ", telefono='" + telefono + '\'' + ", activo="
				+ activo + ", rol=" + rol + '}';
	}
}