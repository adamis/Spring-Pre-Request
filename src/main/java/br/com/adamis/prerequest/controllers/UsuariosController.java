package br.com.adamis.prerequest.controllers;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.adamis.prerequest.inputs.UsuariosInput;
import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
@RequestMapping("/usuarios")
public class UsuariosController {

	
	@PostMapping
	public ResponseEntity<UsuariosInput> criar(@RequestBody @Valid UsuariosInput usuarios, HttpServletResponse response) {
		log.info("teste");
		return ResponseEntity.ok(usuarios);
	}
	
}
