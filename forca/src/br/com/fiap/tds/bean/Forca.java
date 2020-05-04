package br.com.fiap.tds.bean;

import java.awt.List;

public class Forca {
	int vidas;
	String palavra;
	String palavraCript;
	List letrasAcertadas;
	List letrasIncorretas;
	Boolean jogoDisponivel;
	char tentativa;
	public Forca(short vidas, String palavra) {
		this.vidas = vidas;
		this.palavra = palavra;
		
	}
	
	
	
	
	
	
	//Getters and Setters
		
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getPalavraCript() {
		return palavraCript;
	}
	public void setPalavraCript(String palavraCript) {
		this.palavraCript = palavraCript;
	}
	public List getLetrasAcertadas() {
		return letrasAcertadas;
	}
	public void setLetrasAcertadas(List letrasAcertadas) {
		this.letrasAcertadas = letrasAcertadas;
	}
	public List getLetrasIncorretas() {
		return letrasIncorretas;
	}
	public void setLetrasIncorretas(List letrasIncorretas) {
		this.letrasIncorretas = letrasIncorretas;
	}
	
	
}
