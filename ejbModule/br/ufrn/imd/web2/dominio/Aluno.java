package br.ufrn.imd.web2.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "aluno")
@SequenceGenerator(name="SEQ_ALUNO", initialValue=1, allocationSize=1, 
sequenceName="seq_aluno")
public class Aluno{
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="SEQ_ALUNO")
	@Column(name="id_aluno")
    private int id;
	
	public String nome;
	public long matricula;
	public String login;
	public String senha;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "id_escolha")	
	public Escolha escolha;
	
	@ManyToOne 
	@JoinColumn(name="id_estruturacurricular")
	public EstruturaCurricular estruturacurricular;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getMatricula() {
		return matricula;
	}
	
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}

