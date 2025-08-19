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
		ProductoDto producto = new ProductoDto();
		producto.setNombreProducto(nombreProducto);
		producto.setCantidad(cantidad);
		producto.setValor(valor);
		this.productos.add(producto);
	}

	public List<ProductoDto> consultarProductos() {
		return productos;
	}

	public ProductoDto consultarProducto(String nombreProducto) {
		for (int i = 0; i < productos.size(); i++) {
			ProductoDto producto = productos.get(i);
			if (producto.getNombreProducto().equals(nombreProducto)) {
				return producto;
			}
		}
		return null;

	}
}