package br.com.etechoracio.training.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import br.com.etechoracio.common.model.BaseORM;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends BaseORM {

	private Long id;

	private String nome;

	private Long cpf;

	private String telefone;

	private String email;

	private Date dataCriacao;

	@OneToOne(mappedBy = "aluno", cascade = CascadeType.ALL)
	private Endereco endereco = new Endereco();
}
