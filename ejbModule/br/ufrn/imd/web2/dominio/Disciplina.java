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
@Table(name = "disciplina")
@SequenceGenerator(name="SEQ_DISCIPLINA", initialValue=1, allocationSize=1, 
sequenceName="seq_disciplina")
public class Disciplina{
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ_DISCIPLINA")
	@Column(name="id_disciplina")
    private int id;
	
	public String nome;
	public int cargaHoraria;
	public String codigo;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="estruturacurricular_disciplina", 
			joinColumns = @JoinColumn(name="id_disciplina"),
			inverseJoinColumns = @JoinColumn(name="id_estruturacurricular"))
	private Collection<EstruturaCurricular> estruturascurriculares;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="escolha_disciplina", 
			joinColumns = @JoinColumn(name="id_escolha"),
			inverseJoinColumns = @JoinColumn(name="id_disciplina"))
	private Collection<Disciplina> disciplinas;
	
	// * -> *
	public Escolha escolha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
