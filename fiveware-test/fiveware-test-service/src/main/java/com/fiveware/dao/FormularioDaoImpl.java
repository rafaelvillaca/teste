package com.fiveware.dao;

import org.springframework.stereotype.Repository;

import com.fiveware.model.Formulario;

@Repository("FormularioDao")
public class FormularioDaoImpl extends AbstractDao<Integer, Formulario> implements FormularioDao {

	public void salvarFormulario(Formulario formulario) {
		persist(formulario);
	}

}