package br.com.chrystian.testePratico2.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;


import br.com.chrystian.testePratico2.model.Movimentacao;
import br.com.chrystian.testePratico2.repository.MovimentacaoRepository;

@Controller
@RequestMapping("/movimentacao")
public class MovimentacaoHomeController {
	
	@Autowired
	private  MovimentacaoRepository movimentacaoRepository;
	
	
	@GetMapping("/home")
	
	public String homePageMovimentacao(Model model) {
		
		List<Movimentacao> movimentacoes = movimentacaoRepository.findAll();
		model.addAttribute("movimentacoes", movimentacoes);
		return  "homeMovimentacao";
	}
	
	
	}


