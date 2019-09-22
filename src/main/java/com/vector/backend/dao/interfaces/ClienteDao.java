package com.vector.backend.dao.interfaces;

import com.vector.backend.entity.ClienteEntity;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 * 
 *
 * @version 1.0.0
 * @author eandr
 * @since 20/09/2019
 * @see Creación
 */
@Repository
public interface ClienteDao extends CrudRepository<ClienteEntity, Long> {

	@Override
    public List<ClienteEntity> findAll();
	
	@Query(value = "select * from CLIENTE c where c.nombre like %:nombre%",
			nativeQuery = true)
    public List<ClienteEntity> findByName(@Param("nombre") String nombre);
	
}
