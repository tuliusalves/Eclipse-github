package com.tulius.Praticas;

public class Gato {
	private Integer ano;
	private String nome;
	private String sexo;
	
	public Gato(Integer ano, String nome, String sexo) {
		super();
		this.ano = ano;
		this.nome = nome;
		this.sexo = sexo;
	}
	

	public Integer getAno() {
		return ano;
	}


	public void setAno(Integer ano) {
		this.ano = ano;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	@Override
	public String toString() {
		return "Gato [ano=" + ano + ", nome=" + nome + ", sexo=" + sexo + "]";
	}
	

}
