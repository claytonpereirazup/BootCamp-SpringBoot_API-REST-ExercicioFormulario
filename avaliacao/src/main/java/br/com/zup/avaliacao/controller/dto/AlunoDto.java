package br.com.zup.avaliacao.controller.dto;

import br.com.zup.avaliacao.modelo.Aluno;

public class AlunoDto {
	
	private String nome;
	private String email;
	
	public AlunoDto() {
	}

	public AlunoDto(Aluno entity) {
		this.nome = entity.getNome();
		this.email = entity.getEmail();
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
}
