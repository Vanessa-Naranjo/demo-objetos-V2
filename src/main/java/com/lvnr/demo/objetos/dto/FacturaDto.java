package com.lvnr.demo.objetos.dto;

import java.util.List;

public class FacturaDto {
	private PersonaDto persona;
	private List<ProductoDto> productos;
	private int numeroFactura;

	public PersonaDto getPersona() {
		return persona;
	}

	public void setPersona(PersonaDto persona) {
		this.persona = persona;
	}

	public List<ProductoDto> getProductos() {
		return productos;
	}

	public void setProductos(List<ProductoDto> productos) {
		this.productos = productos;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

}
