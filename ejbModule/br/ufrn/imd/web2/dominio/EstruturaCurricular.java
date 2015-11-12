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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "estruturacurricular")
@SequenceGenerator(name="SEQ_ESTRUTURACURRICULAR", initialValue=1, allocationSize=1, 
sequenceName="seq_estruturacurricular")
public class EstruturaCurricular {	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ_ESTRUTURACURRICULAR")
	@Column(name="id_estruturacurricular")
    public int id;
		
	@OneToMany(mappedBy="aluno") 
	private Collection<Aluno> alunos;
	
	@ManyToOne 
	@JoinColumn(name="id_curso")
	private Curso curso;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="estruturacurricular_disciplina", 
			joinColumns = @JoinColumn(name="id_estruturacurricular"),
			inverseJoinColumns = @JoinColumn(name="id_disciplina"))
	private Collection<Disciplina> disciplinas;

}
