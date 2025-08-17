package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.FacturaDto;
import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.dto.ProductoDto;

public class FacturaService {
	
	private List<FacturaDto> facturas;
	
	public FacturaService() {
		facturas=new ArrayList<>();
	}
	
	public void crearFactura(PersonaDto personas, List<ProductoDto> productos) {
		FacturaDto facturas1=new FacturaDto();
		facturas1.setPersona(personas);
		facturas1.setProductos(productos);
		this.facturas.add(facturas1);
	}

}
