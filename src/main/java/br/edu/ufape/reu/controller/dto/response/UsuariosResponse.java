package br.edu.ufape.reu.controller.dto.response;

import org.modelmapper.ModelMapper;

import br.edu.ufape.reu.config.SpringApplicationContext;
import br.edu.ufape.reu.model.Usuarios;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter @Setter @NoArgsConstructor
public  class UsuariosResponse  {
	private Long id;
	private String nome;
	private String email;
	private String tipo;



	public UsuariosResponse(Usuarios obj) {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		modelMapper.map(obj, this);
	}

}
