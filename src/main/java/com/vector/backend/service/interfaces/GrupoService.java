package com.vector.backend.service.interfaces;

import java.util.List;
import com.vector.backend.entity.GrupoEntity;

/**
 * 
 *
 * @version 1.0.0
 * @author eandr
 * @since 20/09/2019
 * @see Creación
 */
public interface GrupoService {

	public void saveGrupo(GrupoEntity grupo) throws Exception;

	public List<GrupoEntity> listAll() throws Exception;

}
