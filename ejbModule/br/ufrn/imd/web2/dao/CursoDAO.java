package br.ufrn.imd.web2.dao;

import javax.ejb.Stateless;

import br.ufrn.imd.web2.dominio.Curso;

@Stateless
public class CursoDAO extends GenericDAO<Curso> {

	public CursoDAO(Class<Curso> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

}
