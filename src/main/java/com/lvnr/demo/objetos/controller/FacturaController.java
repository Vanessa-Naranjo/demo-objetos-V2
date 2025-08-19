package com.lvnr.demo.objetos.controller;

import java.util.List;

import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.dto.ProductoDto;
import com.lvnr.demo.objetos.service.FacturaService;
import com.lvnr.demo.objetos.service.PersonaService;
import com.lvnr.demo.objetos.service.ProductoService;

public class FacturaController {

	public static void main(String[] args) {

		PersonaService personaService = new PersonaService();
		personaService.crearPersona("CC", "4234325", "Camilo Rodriguez");
		personaService.crearPersona("CC", "645645554", "Laura Rodriguez");
		personaService.crearPersona("CC", "4594954", "Eduardo Rodriguez");
		
		ProductoService productoService=new ProductoService();
		productoService.crearProducto("Arroz", 20, 1500);
		productoService.crearProducto("Papa", 30, 1700);
		productoService.crearProducto("Pasta", 2, 1400);
		
		FacturaService facturaService=new FacturaService();
		PersonaDto personaDto=personaService.ConsultarPersona("4234325");
		List<ProductoDto> productos=productoService.consultarProductos();
		facturaService.crearFactura(personaDto, productos);
		
		facturaService.imprimirFactura();

	}

}
