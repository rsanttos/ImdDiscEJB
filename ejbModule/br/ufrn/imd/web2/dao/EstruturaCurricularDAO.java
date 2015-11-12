package br.ufrn.imd.web2.dao;

import javax.ejb.Stateless;

import br.ufrn.imd.web2.dominio.EstruturaCurricular;
@Stateless
public class EstruturaCurricularDAO extends GenericDAO<EstruturaCurricular> {

	public EstruturaCurricularDAO(Class<EstruturaCurricular> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}

}
