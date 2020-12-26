package repository;

import java.util.Optional;

import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import entidade.Visitante;

@Repository
public interface VisitanteRepository extends JpaRepository<Visitante, Id> {
	
public Optional<Visitante> findById(Integer id);
	
	//'SELECT * FROM visitante order by cres'
	public Visitante findAllVisitante(Visitante visitante);

	@SuppressWarnings("unchecked")
	public Visitante save(Visitante visitante);

	public boolean existById(Integer id);

	public ResponseEntity<Visitante> update(Visitante visitante);


}
