package br.com.zup.avaliacao.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.avaliacao.controller.dto.AlunoDto;
import br.com.zup.avaliacao.controller.dto.AlunoDtoDetalhe;
import br.com.zup.avaliacao.modelo.Aluno;
import br.com.zup.avaliacao.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping
	public List<AlunoDto> listar() {
	//lista em memória
	//Aluno aluno = new Aluno(1L, "Clayton Pereira", 48, "clayton.pereira@zup.com.br");
	//return aluno;
		
	List<Aluno> alunos = alunoRepository.findAll();
	return Aluno.converteEntidadeParaDto(alunos);
	}
	
	@GetMapping("/{id}")
	public AlunoDtoDetalhe listarPorId(@PathVariable Long id) {
	Optional<Aluno> obj = alunoRepository.findById(id);
	Aluno aluno = obj.get();
	return new AlunoDtoDetalhe(aluno);
	}

}
