package br.com.chrystian.testePratico2.dto;

import java.time.LocalDateTime;

public class RequisicaoNovaMovimentacao {
	
	private String numeroConteiner;
	private String tipoMovimentacao;
	private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    
    
	public String getNumeroConteiner() {
		return numeroConteiner;
	}
	public void setNumeroConteiner(String numeroConteiner) {
		this.numeroConteiner = numeroConteiner;
	}
	public String getTipoMovimentacao() {
		return tipoMovimentacao;
	}
	public void setTipoMovimentacao(String tipoMovimentacao) {
		this.tipoMovimentacao = tipoMovimentacao;
	}
	public LocalDateTime getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public LocalDateTime getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(LocalDateTime dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
   
}

