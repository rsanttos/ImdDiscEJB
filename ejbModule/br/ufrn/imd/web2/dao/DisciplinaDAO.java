package br.ufrn.imd.web2.dao;

import javax.ejb.Stateless;

import br.ufrn.imd.web2.dominio.Disciplina;
@Stateless
public class DisciplinaDAO extends GenericDAO<Disciplina> {

	public DisciplinaDAO(Class<Disciplina> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

}
