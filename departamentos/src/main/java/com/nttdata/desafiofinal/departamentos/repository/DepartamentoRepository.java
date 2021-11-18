package com.nttdata.desafiofinal.departamentos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nttdata.desafiofinal.departamentos.entity.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Long> {
	
	Departamento getDeparmentoByDeparmentId(Long departamentoId);

}
