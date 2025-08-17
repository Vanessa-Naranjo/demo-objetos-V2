package com.lvnr.demo.objetos.controller;

import com.lvnr.demo.objetos.dto.PersonaDto;
import com.lvnr.demo.objetos.service.PersonaService;

public class PersonaController {
	
	public static void main(String[] args) {
		
		PersonaService personacon=new PersonaService();
		
		personacon.crearPersona("CC", "4234325", "Camilo Rodriguez");
		personacon.crearPersona("CC", "645645554", "Laura Rodriguez");
		personacon.crearPersona("CC", "4594954", "Eduardo Rodriguez");
		
		PersonaDto personaDto=personacon.ConsultarPersona("4594954");
		System.out.println("Tipo identificacion: " +personaDto.getTipoIdentificacion());
		System.out.println("Numero identificación: " +personaDto.getNumeroIdentificacion());
		System.out.println("Nombre Completo: " +personaDto.getNombreCompleto());
	
		
		
	}

}
