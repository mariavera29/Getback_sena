package com.sena.getback.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "estados")
public class Estados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    

    private String nombre;
    

    private String descripcion;
    
  
    private String tipoEstado;
    
    @OneToMany(mappedBy = "estado")
    private List<Pedido> pedidos;
    
    @OneToMany(mappedBy = "estado")
    private List<Eventos> eventos;
    
    public Estados() {}
    
    public Estados(String nombre, String descripcion, String tipoEstado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipoEstado = tipoEstado;
    }
    
    // Getters y Setters
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    
    public String getTipoEstado() { return tipoEstado; }
    public void setTipoEstado(String tipoEstado) { this.tipoEstado = tipoEstado; }
    
    public List<Pedido> getPedidos() { return pedidos; }
    public void setPedidos(List<Pedido> pedidos) { this.pedidos = pedidos; }
    
    public List<Eventos> getEventos() { return eventos; }
    public void setEventos(List<Eventos> eventos) { this.eventos = eventos; }
    
    @Override
    public String toString() {
        return "Estados{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", tipoEstado='" + tipoEstado + '\'' +
                '}';
    }
}