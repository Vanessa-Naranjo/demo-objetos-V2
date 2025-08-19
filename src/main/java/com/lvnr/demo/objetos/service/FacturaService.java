package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.FacturaDto;
import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.dto.ProductoDto;

public class FacturaService {

	private List<FacturaDto> facturas;

	public FacturaService() {
		facturas = new ArrayList<>();
	}

	public void crearFactura(PersonaDto personas, List<ProductoDto> productos) {
		FacturaDto factura = new FacturaDto();
		factura.setPersona(personas);
		factura.setProductos(productos);
		this.facturas.add(factura);
	}

	public void imprimirFactura() {
		for (int i = 0; i < facturas.size(); i++) {
			FacturaDto factura = facturas.get(i);
			System.out.println("Persona: " + factura.getPersona());
			System.out.println("Productos: " + factura.getProductos());

		}
	}

}
