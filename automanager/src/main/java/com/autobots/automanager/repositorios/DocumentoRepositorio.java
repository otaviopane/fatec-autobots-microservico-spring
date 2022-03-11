package com.autobots.automanager.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.autobots.automanager.entidades.Endereco;

public interface DocumentoRepositorio extends JpaRepository<Endereco, Long> {
}