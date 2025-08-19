package com.lvnr.demo.objetos.controller;

import com.lvnr.demo.objetos.service.ProductoService;

public class ProductoController {
	
	public void crearProducto() {
		ProductoService productoService=new ProductoService();
		productoService.crearProducto("Arroz", 20, 1500);
		productoService.crearProducto("Papa", 30, 1700);
		productoService.crearProducto("Pasta", 2, 1400);
	}

}
