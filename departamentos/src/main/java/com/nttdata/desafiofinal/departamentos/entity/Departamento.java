package com.nttdata.desafiofinal.departamentos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Departamento {
	 
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)	
	  private Long departamentoId;
	  private String departamentoName;
	 
	
	public Long getDepartamentoId() {
		return departamentoId;
	}


	public void setDepartamentoId(Long departamentoId) {
		this.departamentoId = departamentoId;
	}


	public String getDepartamentoName() {
		return departamentoName;
	}


	public void setDepartamentoName(String departamentoName) {
		this.departamentoName = departamentoName;
	}


	public Departamento( String deparmentoName, Long departamentoId){
		super();
		this.departamentoId = departamentoId;
		this.departamentoName = deparmentoName;
	
	}
	    

}
