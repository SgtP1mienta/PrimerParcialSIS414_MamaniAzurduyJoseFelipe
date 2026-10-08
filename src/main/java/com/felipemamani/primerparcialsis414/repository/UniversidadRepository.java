package com.felipemamani.primerparcialsis414.repository;

import com.felipemamani.primerparcialsis414.entity.Universidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Long> {
    // Solo con heredar de JpaRepository, Spring Boot ya nos regala los métodos:
    // save(), findAll(), findById(), deleteById()
}