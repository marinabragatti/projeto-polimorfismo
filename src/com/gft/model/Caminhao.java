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
	
	//M�todos
	
	public void abastecer(float quantidade) {
		if ((getlitrosCombustivel() + quantidade) <= 200) {
			setlitrosCombustivel(getlitrosCombustivel() + (int)this.quantidade);
			System.out.println("O carro est� abastecido com " + getlitrosCombustivel() + " litros");
		}
		else
			System.out.println("N�o foi poss�vel abastecer. \nQuantidade de litros que faltam para completar o tanque: " + (200 - getlitrosCombustivel()));
			
	}
	
	@Override
	public void acelerar() {
		if(getisLigado() && getlitrosCombustivel() >= 1 && this.getvelocidade() <= 90) {
			setvelocidade(this.getvelocidade() + 20);
			setlitrosCombustivel(getlitrosCombustivel() - 1);
			System.out.println("O carro est� a " + this.getvelocidade() + "km/h");
			System.out.println("O carro possui " + getlitrosCombustivel() + " litros de combust�vel.");
		}
		else if(getisLigado() == false)
			System.out.println("O carro est� desligado, ligue o carro para acelerar.");
		
		else if(this.getvelocidade() > 90)
			System.out.println("Voc� est� muito r�pido. N�o � poss�vel acelerar.");
		else
			System.out.println("O carro est� sem combust�vel.");
			
	}
}

