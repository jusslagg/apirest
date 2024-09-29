package com.jesus.apirest.Factura;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FACTURA")
@SuperBuilder
public class Fact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer Id;
    private String fechaEmision; // Fecha de emisión de la factura
    @Column(nullable = false)
    private String clienteNombre; // Nombre del cliente
    @Column(nullable = false, unique = true)
    private String DNI; // Documento de identidad del cliente
    private double total; // Total de la factura
    private double impuestos; // Total de impuestos aplicados

}
