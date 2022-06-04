package com.idat.microservicioLavadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.idat.microservicioLavadora.modelo.Lavadora_modelo;
import com.idat.microservicioLavadora.service.LavadoraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
@RequestMapping("/lavadora_modelo/v1")
public class LavadoraController {
	
	@Autowired
	private LavadoraService service; 
	
	/*public List<Lavadora_modelo> listarLavadora(){
		
	}*/

}



