package com.gft.model;

public class Carro extends Veiculo{

	private String marca;
	
	private int combustivel;
	
	private int velocidade;
	
	public String getmarca() {
		return marca;
	}
	
	public void setmarca(String marca) {
		this.marca = marca;
	}
	
	public int getcombustivel() {
		return combustivel;
	}
	
	public void setcombustivel(int combustivel) {
		this.combustivel = combustivel;
	}
	
	public int getvelocidade() {
		return velocidade;
	}
	
	public void setvelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	//Métodos
	
	@Override
	public void abastecer(int quantidade) {
		if ((getlitrosCombustivel() + quantidade) <= 120) {
			combustivel = getlitrosCombustivel() + quantidade;
			System.out.println("O carro está abastecido com " + combustivel + " litros");
		}
		else
			System.out.println("Não foi possível abastecer. \nQuantidade de litros que faltam para completar o tanque: " + (120 - getlitrosCombustivel()));
	
	}
	
	@Override
	public void acelerar() {
		if(getisLigado() && getlitrosCombustivel() >= 1 && getvelocidade() <= 160) {
			this.velocidade += 20;
			combustivel -= 1;
			System.out.println("O carro está a " + this.velocidade + "km/h");
			System.out.println("O carro possui " + combustivel + " litros de combustível.");
		}
		else if(getisLigado() == false)
			System.out.println("O carro está desligado, ligue o carro para acelerar.");
		
		else if(this.velocidade > 160)
			System.out.println("Você está muito rápido. Não é possível acelerar.");
		else
			System.out.println("O carro está sem combustível.");
			
	}
}