package com.sena.getback.repository;

import com.sena.getback.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IPedidosRepository extends JpaRepository<Pedido, Integer> {

	List<Pedido> findByMesaId(Integer mesaId);

	List<Pedido> findByUsuarioId(Integer usuarioId);

	List<Pedido> findByEstadoId(Integer estadoId);

	List<Pedido> findByMesaNumero(String numeroMesa);
}