package com.vector.backend.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 * 
 *
 * @version 1.0.0
 * @author eandr
 * @since 20/09/2019
 * @see Creación
 */
@Entity
@Table(name = "grupo")
public class GrupoEntity implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_grupo")
    @SequenceGenerator(name="id_grupo", sequenceName="id_grupo", allocationSize=100)
	@Column(name = "id", updatable = false, nullable = false, columnDefinition = "number(5,0)")
	private Long id;

	@Column(name = "nombre", nullable = false, columnDefinition="VARCHAR2(64 BYTE)")
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private static final long serialVersionUID = 1L;

}
