package service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entidade.Visitante;
import repository.VisitanteRepository;

@Service
public class VisitanteService {
	
	@Autowired
	VisitanteRepository visitanteRepository;
	
	public Visitante getVisitante(Integer id) {
		Optional<Visitante> visitante = this.visitanteRepository.findById(id);
		return visitante.orElse(null);
		
	}
	
	public Visitante getAllVisitante(Visitante visitante){
		Visitante visitantes = this.visitanteRepository.findAllVisitante(visitante);
		return visitantes;
	}
	
	public Visitante criarVisitante(Visitante visitante) {
		Visitante newVisitante = this.visitanteRepository.save(visitante);
		return newVisitante;
	}
	
	public Visitante alterarVisitante(Integer id, Visitante visitante, String nomeVisitante, int rgVisitante,
			String cidadeVisitante, String emailVisitante, Date anualiVisitante) {
		if (visitanteRepository.existById(id)) {
			visitante.setNomeVisitante(nomeVisitante);
			visitante.setRgVisitante(rgVisitante);
			visitante.setCidadeVisitante(cidadeVisitante);
			visitante.setEmailVisitante(emailVisitante);
			visitante.setAnualiVisitante(anualiVisitante);
			
			Visitante alterVisitante = this.visitanteRepository.save(visitante);
			return alterVisitante;
		}else {
			return null;
		}					
	}
	
	public Visitante novoAnuali (Visitante visitante) {
		Visitante newAnuali = this.visitanteRepository.save(visitante);
		return newAnuali;
			
	}

}
