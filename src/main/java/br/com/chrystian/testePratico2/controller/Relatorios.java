package br.com.chrystian.testePratico2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import br.com.chrystian.testePratico2.repository.MovimentacaoRepository;

@Controller
public class Relatorios{

	@Autowired	
	private MovimentacaoRepository movimentacaoRepository;
	
	@GetMapping("/relatorios")
	public String consultarRelatorios(Model model) {
		
		
		List<Object[]> resultado = movimentacaoRepository.findClienteAndTipoMovimentacao();
		for (Object[] obj : resultado) {
		    String cliente = (String) obj[0];
		    String tipoMovimentacao = (String) obj[1];
		    System.out.println("Cliente: " + cliente);
		    System.out.println("Tipo de Movimentação: " + tipoMovimentacao);
		    System.out.println("--------------------");
		}
			model.addAttribute("resultado", resultado);
		
		
		return "relatorio";
		
	}
	

}
