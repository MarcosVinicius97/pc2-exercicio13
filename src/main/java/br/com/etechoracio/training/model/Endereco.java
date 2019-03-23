package br.com.etechoracio.training.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Endereco extends BaseORM {

	private Long id;

	private String logradouro;

	private Long numero;

	private String complemento;

	private String bairro;

	private String cidade;

	private String uf;

	private String cep;

	@OneToOne(mappedBy = "endereco", cascade = CascadeType.ALL)
	private Aluno aluno;

}