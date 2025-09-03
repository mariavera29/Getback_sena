package com.sena.getback.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.getback.model.Usuario;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    
    Optional<Usuario> findByUsername(String username);
    
    Optional<Usuario> findByEmail(String email);
    
    List<Usuario> findByActivoTrue();
    
    List<Usuario> findByRolId(Integer rolId);
    
    List<Usuario> findByNombreContaining(String nombre);
    
    boolean existsByUsername(String username);
    
    boolean existsByEmail(String email);
}