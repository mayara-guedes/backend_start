package com.capgemini.start.api.dto.input;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "GeneroInput", description = "Objeto de entrada para inclusão e alteração da entidade Gênero")
public class GeneroInputDTO {

	@NotNull
	@Length(max = 100)
	private String descricao;
	
}
