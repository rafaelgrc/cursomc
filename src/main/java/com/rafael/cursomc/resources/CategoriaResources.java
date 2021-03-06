package com.rafael.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rafael.cursomc.domain.Categoria;
import com.rafael.cursomc.services.CategoriaService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/categorias", method = RequestMethod.GET)
public class CategoriaResources {

	@Autowired
	private CategoriaService categoriaService;

	@RequestMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Categoria obj = categoriaService.buscar(id);
		return ResponseEntity.ok().body(obj);

	}

}
