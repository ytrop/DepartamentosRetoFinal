package com.nttdata.desafiofinal.departamentos.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.desafiofinal.departamentos.entity.Departamento;
import com.nttdata.desafiofinal.departamentos.repository.DepartamentoRepository;


@Service
	public class DepartamentoService {
	private static final Logger log = LoggerFactory.getLogger(DepartamentoService.class);
@Autowired
	private DepartamentoRepository departamentoRepository;

	public Departamento saveDepartamento(Departamento departamento) {
		log.info("Departamento guardado");
    	return departamentoRepository.save(departamento);
}

	public Departamento getDepartamentoById(Long departamentoId) {
		log.info("Obtencion de departamento por Id");
    	return departamentoRepository.getDeparmentoByDeparmentId(departamentoId);
}


}
