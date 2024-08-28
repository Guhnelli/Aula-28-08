package Aula28_08_;

public abstract class Animals02 {
	
	String nome;
	String sexo;
	String raca;
	
	public abstract void dorme ();
	public abstract void caminha ();
	public abstract void corre();
	public abstract void emitirSom ();
	
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
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
}
