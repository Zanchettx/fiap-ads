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
@Table(name = "tbl_cliente")
public class Cliente {

	@Id
	@SequenceGenerator(name = "cliente", sequenceName = "sq_tbl_cliente", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente")
	@Column(name = "id_cliente")
	private Integer id;

	@Column(name = "nome_cliente", length = 50)
	private String nome;
	
	@Column(name = "idade_cliente")
	private int idade;
	
	@Column(name = "dt_nasc_cli")
	private Calendar dataNascimento;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dt_cadastro")
	private Calendar dataCadastro;

	private Calendar dataCriacao;

	

	public Cliente(Integer id, String nome, int idade, Calendar dataNascimento, Calendar dataCadastro,
			Calendar dataCriacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.dataCadastro = dataCadastro;
		this.dataCriacao = dataCriacao;
	}

	public Cliente() {
		super();

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	
	
}
