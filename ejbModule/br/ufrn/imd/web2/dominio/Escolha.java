package br.ufrn.imd.web2.dominio;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "escolha")
@SequenceGenerator(name="SEQ_ESCOLHA", initialValue=1, allocationSize=1, 
sequenceName="seq_escolha")
public class Escolha {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ_ESCOLHA")
	@Column(name="id_escolha")
    public int id;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="escolha_disciplina", 
			joinColumns = @JoinColumn(name="id_disciplina"),
			inverseJoinColumns = @JoinColumn(name="id_escolha"))
	private Collection<Escolha> escolhas;
	
	
}
