package br.com.chrystian.testePratico2.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.chrystian.testePratico2.dto.RequisicaoNovoCadastro;
import br.com.chrystian.testePratico2.model.Conteiner;
import br.com.chrystian.testePratico2.repository.ConteinerRepository;


@Controller
public class ConteinerHomeController {
	
	@Autowired	
	private ConteinerRepository conteinerRepository;
	
	@GetMapping("/home")
	public String hello(Model model,RequisicaoNovoCadastro requisicao) {
		List<Conteiner> conteiners = conteinerRepository.findAllOrderBynumeroConteiner();
	
		model.addAttribute("conteiners", conteiners);
	
		

		return "home";
		
		
			
	}

}
