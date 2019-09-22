package com.vector.backend.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cliente")
public class ClienteEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="id_cliente")
    @SequenceGenerator(name="id_cliente", sequenceName="id_cliente", allocationSize=100)
	@Column(name = "id", updatable = false, nullable = false, columnDefinition = "number(5,0)")
	private Long id;

	@Column(name = "nombre", nullable = false, columnDefinition = "VARCHAR2(64 BYTE)")
	private String nombre;

	@Column(name = "cif", nullable = false, columnDefinition = "VARCHAR2(32 BYTE)")
	private String cif;

	@Column(name = "direccion", nullable = false, columnDefinition = "VARCHAR2(128 BYTE)")
	private String direccion;

	@ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	@JoinColumn(name="grupo")
	private GrupoEntity grupo;

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

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public GrupoEntity getGrupo() {
		return grupo;
	}

	public void setGrupo(GrupoEntity grupo) {
		this.grupo = grupo;
	}

	private static final long serialVersionUID = 1L;

}
