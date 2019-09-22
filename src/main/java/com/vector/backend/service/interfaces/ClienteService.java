package com.vector.backend.service.interfaces;

import java.util.List;

import com.vector.backend.entity.ClienteEntity;

/**
 * 
 *
 * @version 1.0.0
 * @author eandr
 * @since 20/09/2019
 * @see Creación
 */
public interface ClienteService {

	public void saveCliente(ClienteEntity cliente) throws Exception;
	
	public List<ClienteEntity> listAll() throws Exception;
	
	public List<ClienteEntity> getByName(String nombre) throws Exception;
	
}
