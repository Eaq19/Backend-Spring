package com.vector.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	@GetMapping("/cliente/{nombre}")
	public ResponseEntity<?> getByName(@PathVariable("nombre") String nombre) throws Exception {
		List<ClienteEntity> list = clienteService.getByName(nombre);
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

	@GetMapping("/cliente")
	public ResponseEntity<?> list() throws Exception {
		List<ClienteEntity> list = clienteService.listAll();
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

	@PostMapping("/cliente")
	public ResponseEntity<?> create(@RequestBody ClienteEntity cliente) throws Exception {
		clienteService.saveCliente(cliente);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
