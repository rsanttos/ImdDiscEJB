package br.ufrn.imd.web2.dao;

import javax.ejb.Stateless;

import br.ufrn.imd.web2.dominio.Escolha;
@Stateless
public class EscolhaDAO extends GenericDAO<Escolha> {

	public EscolhaDAO(Class<Escolha> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

}
