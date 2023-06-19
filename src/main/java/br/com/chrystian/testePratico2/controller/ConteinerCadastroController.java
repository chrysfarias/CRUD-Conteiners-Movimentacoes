package br.com.chrystian.testePratico2.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

	public String cadastro(@Valid RequisicaoNovoCadastro requisicao, BindingResult result,Model model) {
		
		List<Conteiner> conteiners = conteinerRepository.findAllOrderBynumeroConteiner();
		model.addAttribute("conteiners", conteiners);
		
		
		if(result.hasErrors()) {
			
			
			model.addAttribute("mensagemErro", "Ocorreu um erro");
			return "home";
		}
		
		Conteiner conteinerTeste  = requisicao.toConteiner();	
		conteinerRepository.save(conteinerTeste);
		model.addAttribute("mensagemSucesso", "Operação Realizada com Sucesso");
		return "redirect:/home";
	}
	
	@GetMapping("/excluir/{id}")
	
	public String alterarConteiner(@PathVariable("id") String id, Model model) {
	
		Optional<Conteiner> conteinerOpt = conteinerRepository.findById(id);
		 
		conteinerRepository.delete(conteinerOpt.get());
		
		
		return "redirect:/home";
	}
	
}
