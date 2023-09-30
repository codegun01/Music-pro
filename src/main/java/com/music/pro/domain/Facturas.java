
package com.music.pro.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

/**
 *
 * @author gonza
 */
@Data
@Table(name = "facturas")
@Entity
public class Facturas implements Serializable{
    private static final Long serialversionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFactura;
    private String fecha;
    private Double totalFactura;
    
    @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_cliente")
        @JsonIgnoreProperties({ "hibernateLazyInitializer", "facturas" })
    private Clientes clientes;
    
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "facturas")
    private List<Detalles> detalle;
    
    
}
