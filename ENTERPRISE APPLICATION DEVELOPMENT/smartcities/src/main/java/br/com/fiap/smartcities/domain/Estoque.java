package br.com.fiap.smartcities.domain;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "tbl_estoque")
public class Estoque {

	@Id
	@SequenceGenerator(name = "estoque", sequenceName = "sq_tbl_estoque", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estoque")
	@Column(name = "id_produto")
	private Integer id;

	@Column(name = "nome_produto", length = 50)
	private String nome;
	
	@Column(name = "qtd_produto")
	private int quantidade;

	@Column(name = "dt_reposicao")
	private Calendar dataReposicao;
	
	@Column(name = "dt_validade")
	private Calendar validade;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_cadastro")
	private Calendar dataCadastro;


}