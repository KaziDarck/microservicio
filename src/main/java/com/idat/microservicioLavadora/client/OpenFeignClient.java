package com.idat.microservicioLavadora.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.microservicioLavadora.modelo.Ropa;

@FeignClient(name="ec04", url = "localhost:8080")
public interface OpenFeignClient{

	@GetMapping("/ropa/v1/listar")
	public List<Ropa> listarRopa();
}
