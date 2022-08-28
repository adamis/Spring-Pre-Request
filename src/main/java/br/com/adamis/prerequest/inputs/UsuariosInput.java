/**
 * 
 */
package br.com.adamis.prerequest.inputs;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * @author Adami
 *
 */
@Data
public class UsuariosInput {
	
	@NotNull
	private Long id;
	
	@NotBlank
	@Size(min = 1,max = 15)
	private String nome;
	
}
