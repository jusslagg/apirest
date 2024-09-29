package com.factura.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jesus.apirest.Factura.Fact;

@Repository
public interface FactRepository extends JpaRepository<Fact, Long> {
    // Puedes agregar métodos personalizados aquí si los necesitas
}
