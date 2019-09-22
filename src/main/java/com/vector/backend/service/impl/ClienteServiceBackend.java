package com.vector.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.backend.dao.interfaces.ClienteDao;
import com.vector.backend.entity.ClienteEntity;
import com.vector.backend.service.interfaces.ClienteService;

/**
 * 
 *
 * @version 1.0.0
 * @author eandr
 * @since 20/09/2019
 * @see Creación
 */
@Service
public class ClienteServiceBackend implements ClienteService {

	@Autowired
	private ClienteDao clienteDao;

	@Override
	public void saveCliente(ClienteEntity cliente) throws Exception {
		// TODO Auto-generated method stubFS
		clienteDao.save(cliente);
	}

	@Override
	public List<ClienteEntity> listAll() throws Exception {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public List<ClienteEntity> getByName(String nombre) throws Exception {
		// TODO Auto-generated method stub
		return clienteDao.findByName(nombre);
	}

}
