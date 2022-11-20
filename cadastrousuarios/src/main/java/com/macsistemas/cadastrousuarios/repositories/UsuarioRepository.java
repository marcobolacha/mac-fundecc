package com.macsistemas.cadastrousuarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macsistemas.cadastrousuarios.entidades.Usuario;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

}
