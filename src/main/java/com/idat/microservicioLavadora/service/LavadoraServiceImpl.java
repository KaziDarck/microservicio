package com.idat.microservicioLavadora.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicioLavadora.client.OpenFeignClient;
import com.idat.microservicioLavadora.modelo.Lavadora_modelo;


@Service
public class LavadoraServiceImpl implements LavadoraService {

	
	@Autowired
	private OpenFeignClient cliente;
	@Override
	public List<Lavadora_modelo> asignarRopaPorLavadora() {
		
		
		List<Lavadora_modelo> listarLavadora = new ArrayList();
		Lavadora_modelo lavadora_modelo = new Lavadora_modelo();
		
		lavadora_modelo.setIdLavadora(1);
		lavadora_modelo.setMarca("LG");
		lavadora_modelo.setVoltaje("120W");
		lavadora_modelo.setDescripcion("primera lavadora en la lista");
		lavadora_modelo.setListarRopa(cliente.listarRopa());
		
		listarLavadora.add(lavadora_modelo);
		
		return listarLavadora;
	}

}

