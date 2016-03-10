package com.fiveware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fiveware.model.Formulario;
import com.fiveware.service.FormularioService;

@Controller
public class FormularioController {

	@Autowired
    FormularioService service;

	@RequestMapping("/formulario")
	public String execute(Formulario formulario) {
		System.out.println("salvando...");

		service.salvarFormulario(formulario);

		return "ok";
	}

}
