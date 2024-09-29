package com.factura.service;

import org.springframework.stereotype.Service;

import com.factura.repository.FactRepository;
import com.jesus.apirest.Factura.Fact;

import java.util.List;
import java.util.Optional;

@Service
public class FactService {

    private final FactRepository factRepo;

    // Constructor para inyección de dependencias
    public FactService(FactRepository factRepo) {
        this.factRepo = factRepo;
    }

    // Método para crear una factura
    public void createFactura(Fact fact) {
        factRepo.save(fact);
        System.out.println("Factura creada: " + fact);
    }

    // Método para buscar una factura por su ID
    public Optional<Fact> findFacturaById(Long id) {
        Optional<Fact> factura = factRepo.findById(id);
        if (factura.isPresent()) {
            System.out.println("Factura encontrada: " + factura.get());
        } else {
            System.out.println("Factura no encontrada con ID: " + id);
        }
        return factura;
    }

    // Método para eliminar una factura por su ID
    public void deleteFactura(Long id) {
        if (factRepo.existsById(id)) {
            factRepo.deleteById(id);
            System.out.println("Factura eliminada con ID: " + id);
        } else {
            System.out.println("Factura no encontrada con ID: " + id);
        }
    }

    // Método para buscar todas las facturas
    public List<Fact> findAllFacturas() {
        List<Fact> facturas = factRepo.findAll();
        System.out.println("Total de facturas encontradas: " + facturas.size());
        return facturas;
    }
}
