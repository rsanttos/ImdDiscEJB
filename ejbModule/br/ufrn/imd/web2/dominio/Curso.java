package br.ufrn.imd.web2.dominio;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "curso")
@SequenceGenerator(name="SEQ_CURSO", initialValue=1, allocationSize=1, 
sequenceName="seq_curso")
public class Curso {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ_CURSO")
	@Column(name="id_curso")
    public int id;
	
	public String nome;
	public int cargaHoraria;
	
	// 1 -> *
	@OneToMany(mappedBy="estruturacurricular") 
	private Collection<EstruturaCurricular> estruturascurriculares;
	
	

}
