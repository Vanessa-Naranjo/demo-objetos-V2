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

			PersonaDto persona = factura.getPersona();
			System.out.println("Nombre: " + persona.getNombreCompleto());
			System.out.println("Tipo Identificación: " + persona.getTipoIdentificacion());
			System.out.println("Numero identificación: " + persona.getNumeroIdentificacion());

			System.out.println("***LISTA DE PRODUCTOS***");
			List<ProductoDto> productos = factura.getProductos();

			for (int j = 0; j < productos.size(); j++) {
				ProductoDto producto = productos.get(j);
				System.out.println("Nombre de Producto: " + producto.getNombreProducto());
				System.out.println("Cantidad: " + producto.getCantidad());
				System.out.println("Valor: " + producto.getValor());
			}

		}
	}

	public void imprimirFacturaV2() {
		for (FacturaDto facturaDto : facturas) {
			PersonaDto persona = facturaDto.getPersona();
			System.out.println("Nombre: " + persona.getNombreCompleto());
			System.out.println("Tipo Identificación: " + persona.getTipoIdentificacion());
			System.out.println("Numero identificación: " + persona.getNumeroIdentificacion());

			System.out.println("***LISTA DE PRODUCTOS***");
			List<ProductoDto> productos = facturaDto.getProductos();

			for (ProductoDto producto : productos) {
				System.out.println("Nombre de Producto: " + producto.getNombreProducto());
				System.out.println("Cantidad: " + producto.getCantidad());
				System.out.println("Valor: " + producto.getValor());

			}
		}
	}
}
