package br.com.zup.avaliacao.form;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class AlunoForm {
	
	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 5, max = 30, message = "Deve estar entre 3 e 30 Caracteres")
	private String nome;
	@NotBlank(message = "Campo Obrigatório")
	private Integer idade;
	@NotBlank(message = "Campo Obrigatório")
	@Size(min = 15, max = 30, message = "Deve estar entre 10 e 30 Caracteres")
	private String email;
	
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
