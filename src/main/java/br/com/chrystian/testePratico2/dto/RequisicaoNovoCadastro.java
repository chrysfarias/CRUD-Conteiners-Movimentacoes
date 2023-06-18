package br.com.chrystian.testePratico2.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import br.com.chrystian.testePratico2.model.Conteiner;

public class RequisicaoNovoCadastro {
	
	@NotBlank
	@Pattern(regexp = "[A-Z]{4}\\d{7}", message="Formato deve ser: 4 letras e 7 números. Ex: TEST1234567")
	private String conteinerNumeroConteiner;
	@NotBlank
	private String conteinerStatus;
	@NotBlank
	private String conteinerTipo;
	@NotBlank
	private String conteinerCliente;
	@NotBlank
	private String conteinerCategoria;
	
	
	
	public String getConteinerNumeroConteiner() {
		return conteinerNumeroConteiner;
	}
	public void setConteinerNumeroConteiner(String conteinerNumeroConteiner) {
		this.conteinerNumeroConteiner = conteinerNumeroConteiner;
	}
	public String getConteinerStatus() {
		return conteinerStatus;
	}
	public void setConteinerStatus(String conteinerStatus) {
		this.conteinerStatus = conteinerStatus;
	}
	public String getConteinerTipo() {
		return conteinerTipo;
	}
	public void setConteinerTipo(String conteinerTipo) {
		this.conteinerTipo = conteinerTipo;
	}
	public String getConteinerCliente() {
		return conteinerCliente;
	}
	public void setConteinerCliente(String conteinerCliente) {
		this.conteinerCliente = conteinerCliente;
	}
	public String getConteinerCategoria() {
		return conteinerCategoria;
	}
	public void setConteinerCategoria(String conteinerCategoria) {
		this.conteinerCategoria = conteinerCategoria;
	}
	public Conteiner toConteiner() {
		Conteiner conteiner = new Conteiner();
		conteiner.setNumeroConteiner(conteinerNumeroConteiner);
		conteiner.setCliente(conteinerCliente);
		conteiner.setTipo(conteinerTipo);
		conteiner.setCategoria(conteinerCategoria);
		conteiner.setStatus(conteinerStatus);
		return conteiner;
	}
	
	
}
