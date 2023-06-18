package br.com.chrystian.testePratico2.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.AbstractBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.chrystian.testePratico2.dto.RequisicaoNovoCadastro;
import br.com.chrystian.testePratico2.model.Conteiner;
import br.com.chrystian.testePratico2.repository.ConteinerRepository;

@Controller
@RequestMapping("/cadastro")
public class ConteinerCadastroController {
	
	@Autowired	
	private ConteinerRepository conteinerRepository;
	
	@PostMapping("/novo")
	
	public String cadastro(@Valid RequisicaoNovoCadastro requisicao, BindingResult result) {
		
		if(result.hasErrors()) {
			return "home";
		}
		
		Conteiner conteinerTeste  = requisicao.toConteiner();	
		conteinerRepository.save(conteinerTeste);
		return "hello";
	}
	
}
