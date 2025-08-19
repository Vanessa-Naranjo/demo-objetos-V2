package com.lvnr.demo.objetos.controller;

import com.lvnr.demo.objetos.dto.FacturaDto;
import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.service.FacturaService;
import com.lvnr.demo.objetos.service.PersonaService;

public class PersonaController {

	public static void main(String[] args) {

		PersonaService personaService = new PersonaService();
		FacturaService facturas = new FacturaService();

		personaService.crearPersona("CC", "4234325", "Camilo Rodriguez");
		personaService.crearPersona("CC", "645645554", "Laura Rodriguez");
		personaService.crearPersona("CC", "4594954", "Eduardo Rodriguez");

		PersonaDto personaDto = personaService.ConsultarPersona("4234325");
		System.out.println("Tipo identificacion: " + personaDto.getTipoIdentificacion());
		System.out.println("Numero identificación: " + personaDto.getNumeroIdentificacion());
		System.out.println("Nombre Completo: " + personaDto.getNombreCompleto());
		


	}
	
	public void crearPersona () {
		PersonaService personaService = new PersonaService();
		personaService.crearPersona("CC", "4234325", "Camilo Rodriguez");
		personaService.crearPersona("CC", "645645554", "Laura Rodriguez");
		personaService.crearPersona("CC", "4594954", "Eduardo Rodriguez");
	}
	
	

}
