package br.edu.ufape.reu.controller.dto.request;

import java.time.LocalDateTime;

import org.modelmapper.ModelMapper;

import br.edu.ufape.reu.config.SpringApplicationContext;
import br.edu.ufape.reu.model.RestricoesHorario;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter @NoArgsConstructor
public  class RestricoesHorarioRequest  {
	private Long espacoID;
	private String diaSemana;
	private LocalDateTime horarioInicio;
	private LocalDateTime horarioTermino;
	private String mobile;


	public RestricoesHorario convertToEntity() {
		ModelMapper modelMapper = (ModelMapper) SpringApplicationContext.getBean("modelMapper");
		RestricoesHorario obj = modelMapper.map(this, RestricoesHorario.class);
		return obj;
	}



}
