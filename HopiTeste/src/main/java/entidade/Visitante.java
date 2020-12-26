package entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Visitante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	@Column(name = "nome")
	public String nomeVisitante;
	
	@Column(name = "rg")
	public int rgVisitante;
	
	@Column(name = "email")
	public String emailVisitante;
	
	@Column(name = "cidade")
	public String cidadeVisitante;
	
	@Column(name = "anuali")
	public Date anualiVisitante;
	
	
	
	public Visitante (String nomeVisitante, int rgVisitante, String emailVisitante, 
			  String cidadeVisitante, Date anualiVisitante ) {

this.nomeVisitante = nomeVisitante;
this.rgVisitante = rgVisitante;
this.emailVisitante = emailVisitante;
this.cidadeVisitante = cidadeVisitante;
this.anualiVisitante = anualiVisitante;	
}

public String getNomeVisitante() {
return nomeVisitante;
}

public void setNomeVisitante(String nomeVisitante) {
this.nomeVisitante = nomeVisitante;
}

public int getRgVisitante() {
return rgVisitante;
}

public void setRgVisitante(int rgVisitante) {
this.rgVisitante = rgVisitante;
}

public String getEmailVisitante() {
return emailVisitante;
}

public void setEmailVisitante(String emailVisitante) {
this.emailVisitante = emailVisitante;
}

public String getCidadeVisitante() {
return cidadeVisitante;
}

public void setCidadeVisitante(String cidadeVisitante) {
this.cidadeVisitante = cidadeVisitante;
}

public Date getAnualiVisitante() {
return anualiVisitante;
}

public void setAnualiVisitante(Date anualiVisitante) {
this.anualiVisitante = anualiVisitante;
}

public Visitante orElse(Object object) {
	// TODO Auto-generated method stub
	return null;
}

}
