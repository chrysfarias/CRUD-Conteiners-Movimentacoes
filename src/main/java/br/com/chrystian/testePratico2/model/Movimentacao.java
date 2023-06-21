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



}
