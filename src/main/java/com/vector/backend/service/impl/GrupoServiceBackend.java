/**
 * 
 */
package com.vector.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vector.backend.dao.interfaces.GrupoDao;
import com.vector.backend.entity.GrupoEntity;
import com.vector.backend.service.interfaces.GrupoService;

/**
 * @author eandr
 *
 */
@Service
public class GrupoServiceBackend implements GrupoService {

	@Autowired
    private GrupoDao grupoDao;
	
	@Override
	public void saveGrupo(GrupoEntity grupo) throws Exception {
		grupoDao.save(grupo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<GrupoEntity> listAll() throws Exception {
		// TODO Auto-generated method stub
		return grupoDao.findAll();
	}

}
