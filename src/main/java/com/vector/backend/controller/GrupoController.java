package com.vector.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vector.backend.entity.GrupoEntity;
import com.vector.backend.service.interfaces.GrupoService;

/**
 * 
 *
 * @version 1.0.0
 * @author eandr
 * @since 20/09/2019
 * @see Creación
 */
@RestController
@RequestMapping("/api")
public class GrupoController {


	@Autowired
	private GrupoService grupoService;

	@GetMapping("/grupo")
	public ResponseEntity<?> list() throws Exception {
		List<GrupoEntity> list = grupoService.listAll();
		if (list != null) {
			if (list.size() > 0) {
				return new ResponseEntity<>(list, HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}

	@PostMapping("/grupo")
	public ResponseEntity<?> create(@RequestBody GrupoEntity grupo) throws Exception {
		grupoService.saveGrupo(grupo);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
}
