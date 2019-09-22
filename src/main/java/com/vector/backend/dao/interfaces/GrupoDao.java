package com.vector.backend.dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vector.backend.entity.ClienteEntity;
import com.vector.backend.entity.GrupoEntity;

/**
 * 
 *
 * @version 1.0.0
 * @author eandr
 * @since 20/09/2019
 * @see Creación
 */
@Repository
public interface GrupoDao extends CrudRepository<GrupoEntity, Long> {

	@Override
    public List<GrupoEntity> findAll();
	
	@Query(value = "select * from GRUPO c where c.nombre like %:nombre%",
			nativeQuery = true)
    public List<GrupoEntity> findByName(@Param("nombre") String nombre);
	
}
