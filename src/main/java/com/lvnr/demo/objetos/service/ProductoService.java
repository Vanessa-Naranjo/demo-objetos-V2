package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.ProductoDto;

public class ProductoService {

	private List<ProductoDto> productos;

	public ProductoService() {
		productos = new ArrayList<>();
	}

	public void crearProducto(String nombreProducto, int cantidad, int valor) {
		ProductoDto productos = new ProductoDto();
		productos.setNombreProducto(nombreProducto);
		productos.setCantidad(cantidad);
		productos.setValor(valor);
		this.productos.add(productos);
	}

	public List<ProductoDto> consultarProductos() {
		return productos;
	}

	public ProductoDto consultarProducto(String nombreProducto) {
		for (int i=0; i<productos.size(); i++) {
			ProductoDto productos1=productos.get(i);
			if (productos1.getNombreProducto().equals(nombreProducto)) {
			return productos1;
		}
}
	return null;

}
}