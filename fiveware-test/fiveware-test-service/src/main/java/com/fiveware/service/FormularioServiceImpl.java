package com.fiveware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fiveware.dao.FormularioDao;
import com.fiveware.model.Formulario;

@Service("formularioService")
@Transactional
public class FormularioServiceImpl implements FormularioService {

	@Autowired
	private FormularioDao dao;

	public void salvarFormulario(Formulario formulario) {
		dao.salvarFormulario(formulario);
	}

}