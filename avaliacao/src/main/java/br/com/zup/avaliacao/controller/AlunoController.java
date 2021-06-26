package br.com.zup.avaliacao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.avaliacao.modelo.Aluno;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@GetMapping
	public Aluno listar() {
	// lista em memória
	Aluno aluno = new Aluno(1L, "Clayton Pereira", 48, "clayton.pereira@zup.com.br");
	return aluno;
		
	}

}
