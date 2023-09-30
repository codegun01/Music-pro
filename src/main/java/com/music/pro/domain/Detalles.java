
package com.music.pro.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author gonza
 */
@Data
@Entity
@Table(name = "detalles")
public class Detalles implements Serializable {
    
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetalle;
    
    private int catidad;
    private Double precioTotal;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_factura")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "detalles" })
    private Facturas facturas;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_producto")
	@JsonIgnoreProperties({ "hibernateLazyInitializer", "detalles" })
    private Productos productos;
    
}
