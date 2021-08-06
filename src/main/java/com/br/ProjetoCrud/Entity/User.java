package com.br.ProjetoCrud.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idUser;
	private String nome;
	private String email;
}
