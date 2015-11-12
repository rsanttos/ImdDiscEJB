package br.ufrn.imd.web2.dao;

import javax.ejb.Stateless;

import br.ufrn.imd.web2.dominio.Aluno;

@Stateless
public class AlunoDAO extends GenericDAO<Aluno> {

	public AlunoDAO(Class<Aluno> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

}
