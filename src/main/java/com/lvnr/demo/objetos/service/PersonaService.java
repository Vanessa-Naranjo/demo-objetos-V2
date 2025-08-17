package com.lvnr.demo.objetos.service;

import java.util.ArrayList;
import java.util.List;

import com.lvnr.demo.objetos.dto.PersonaDto;

public class PersonaService {

	private List<PersonaDto> personas;

	public PersonaService() {
		personas = new ArrayList<>();

	}

	public void crearPersona(String tipoIdentificacion, String numeroIdentificacion, String nombreCompleto) {
		PersonaDto personadto = new PersonaDto();
		personadto.setTipoIdentificacion(tipoIdentificacion);
		personadto.setNumeroIdentificacion(numeroIdentificacion);
		personadto.setNombreCompleto(nombreCompleto);
		this.personas.add(personadto);

	}

	public List<PersonaDto> consultarPersonas() {
		return personas;
	}

	public PersonaDto ConsultarPersona(String numeroIdentidicacion) {
		for (int i = 0; i < personas.size(); i++) {
			PersonaDto personadto1 = personas.get(i);
			if(personadto1.getNumeroIdentificacion().equals(numeroIdentidicacion)) {
				return personadto1;
			}
		}
		return null; 
	}

}
