package br.com.chrystian.testePratico2.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;


@Entity
public class Movimentacao {
	
	 	@Id	
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id_movimentacao;

	    @Column(name = "tipo_movimentacao")
	    private String tipoMovimentacao;

	    @Column(name = "data_hora_inicio")
	    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	    private LocalDateTime dataHoraInicio;

	    
	    @Column(name = "data_hora_fim")
	    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
	    private LocalDateTime dataHoraFim;
	    
	    @OneToOne
	    @JoinColumn(name="numero_conteiner")
	    private Conteiner conteiner;
	    

		public Long getId_movimentacao() {
			return id_movimentacao;
		}

		public void setId_movimentacao(Long id_movimentacao) {
			this.id_movimentacao = id_movimentacao;
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

		public Conteiner getConteiner() {
			return conteiner;
		}

		public void setConteiner(Conteiner conteiner) {
			this.conteiner = conteiner;
		}



}
