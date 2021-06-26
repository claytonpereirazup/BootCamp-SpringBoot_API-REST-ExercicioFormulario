package br.com.zup.avaliacao.controller.dto;

public class AlunoDto {
	
	private String nome;
	private Integer idade;
	private String email;
	
	public AlunoDto() {
	}

	public AlunoDto(String nome, Integer idade, String email) {
		this.nome = nome;
		this.idade = idade;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public String getEmail() {
		return email;
	}
	
}
