package br.com.zup.avaliacao.controller.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.zup.avaliacao.modelo.Aluno;

public class AlunoForm {
	
	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 5, max = 30, message = "Deve estar entre 3 e 30 Caracteres")
	private String nome;
	@NotNull(message = "Campo Obrigatório")
	private Integer idade;
	@Email(message = "Deve ser um e-mail válido")
	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 15, max = 40, message = "Deve estar entre 10 e 40 Caracteres")
	private String email;
	
	public AlunoForm() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//metodo conversor de Form -> Entidade
	public Aluno converteFomParaEntidade(AlunoForm form) {
		return new Aluno(null, nome, idade, email);
	}
	
	
}
