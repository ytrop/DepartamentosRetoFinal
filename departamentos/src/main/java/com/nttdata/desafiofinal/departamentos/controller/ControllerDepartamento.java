package com.nttdata.desafiofinal.departamentos.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.desafiofinal.departamentos.entity.Departamento;
import com.nttdata.desafiofinal.departamentos.service.DepartamentoService;

@RestController
@RequestMapping ("/departamentos")
public class ControllerDepartamento {

@Autowired
	private DepartamentoService departamentoService;

@PostMapping("/")
	public Departamento saveDepartamento(@RequestBody Departamento departamento) {
	    return departamentoService.saveDepartamento(departamento);
	}

@GetMapping("/{id}")
public Departamento getDepartmentById(@PathVariable("id") Long departamentoId) {
   
    return departamentoService.getDepartamentoById(departamentoId);
}

}

