package controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import entidade.Visitante;
import repository.VisitanteRepository;

@RestController
@RequestMapping("/Visitantes")
public class VisitanteController {
	
	@Autowired
	private VisitanteRepository visitanteRepository;
	
	//Lista todos os visitantes Cadastrados.
	@GetMapping(value = "/listar")
	public List<Visitante> listarVisitante(){
		return visitanteRepository.findAll();
	}
	
	//Lista um Visitante pelo Id.
	@GetMapping(value = "/visitante/{id}")
    public ResponseEntity<Visitante> getById(@PathVariable(value = "id") Integer id)
    {
        Optional<Visitante> visitante = visitanteRepository.findById(id);
        if(visitante.isPresent())
            return new ResponseEntity<Visitante>(visitante.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }	
	
	
	//Adiciona um novo visitante.
	@PostMapping(value = "/novo")
	public Visitante novo(@RequestBody Visitante visitante) {
		return visitanteRepository.save(visitante);
	}
	
	//Deleta um visitante
	@DeleteMapping(value = "/Visitantes/{id}")
	public ResponseEntity<Visitante> delete(@PathVariable(value = "id")Integer Id){
		
		Optional<Visitante> visitante = visitanteRepository.findById(Id);
        if(visitante.isPresent()){
            visitanteRepository.delete(visitante.get());
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);		
	}
	
	//Atualiza o cadastro de um visitante.
	@RequestMapping(value = "/visitante/{id}", method = RequestMethod.PATCH)
    public ResponseEntity<Visitante> update(@PathVariable(value = "id") Integer id, @RequestBody Visitante visitante){
    	return visitanteRepository.update(visitante);
    	
    	
    }

	

}
