package br.com.chrystian.testePratico2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.chrystian.testePratico2.model.Conteiner;
import br.com.chrystian.testePratico2.model.Movimentacao;


public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
	
	@Query("SELECT c.cliente, m.tipoMovimentacao FROM Movimentacao m JOIN m.conteiner c")
    List<Object[]> findClienteAndTipoMovimentacao();
	
}