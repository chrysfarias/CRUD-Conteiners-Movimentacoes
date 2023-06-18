package br.com.chrystian.testePratico2.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.chrystian.testePratico2.model.Conteiner;

@Repository
public interface ConteinerRepository  extends JpaRepository<Conteiner, String>{
	@Query("SELECT c FROM Conteiner c ORDER BY c.numeroConteiner ASC")
	    List<Conteiner> findAllOrderBynumeroConteiner();
	
	//List<Conteiner> findByClienteContainingIgnoreCase(String name);
	List<Conteiner> findBynumeroConteinerContainingIgnoreCase(String numeroConteiner);
	
	
	

	
	
	
    	



}
