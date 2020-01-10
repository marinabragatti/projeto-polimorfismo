package com.gft.model;

public class Caminhao extends Veiculo{
	
	private double peso;
	
	private int eixos;
	
	private float quantidade;
	
	public double getpeso() {
		return this.peso;
	}
	
	public void setpeso(double peso){
		this.peso = peso;
	}
	
	public int geteixos() {
		return this.eixos;
	}
	
	public void seteixos(int eixos) {
		this.eixos = eixos;
	}
		
	public float getquantidade() {
		return quantidade;
	}
	
	public void setquantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	
	//Métodos
	
	public void abastecer(float quantidade) {
		if ((getlitrosCombustivel() + quantidade) <= 200) {
			setlitrosCombustivel(getlitrosCombustivel() + (int)this.quantidade);
			System.out.println("O carro está abastecido com " + getlitrosCombustivel() + " litros");
		}
		else
			System.out.println("Não foi possível abastecer. \nQuantidade de litros que faltam para completar o tanque: " + (200 - getlitrosCombustivel()));
			
	}
	
	@Override
	public void acelerar() {
		if(getisLigado() && getlitrosCombustivel() >= 1 && this.getvelocidade() <= 90) {
			setvelocidade(this.getvelocidade() + 20);
			setlitrosCombustivel(getlitrosCombustivel() - 1);
			System.out.println("O carro está a " + this.getvelocidade() + "km/h");
			System.out.println("O carro possui " + getlitrosCombustivel() + " litros de combustível.");
		}
		else if(getisLigado() == false)
			System.out.println("O carro está desligado, ligue o carro para acelerar.");
		
		else if(this.getvelocidade() > 90)
			System.out.println("Você está muito rápido. Não é possível acelerar.");
		else
			System.out.println("O carro está sem combustível.");
			
	}
}

