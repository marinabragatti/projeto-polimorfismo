package com.gft.model;

public class Aviao extends Veiculo{

	private String tipo;
	
	private String uso;
	
	private String quantidade;
	
	public String gettipo() {
		return tipo;
	}
	
	public void settipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getuso() {
		return uso;
	}
	
	public void setuso(String uso) {
		this.uso = uso;
	}
	
	public void abastecer(String quantidade) {
		if ((getlitrosCombustivel() + Integer.parseInt(this.quantidade)) <= 200) {
			setlitrosCombustivel(getlitrosCombustivel() + Integer.parseInt(this.quantidade));
			System.out.println("O carro est� abastecido com " + getlitrosCombustivel() + " litros");
		}
		else
			System.out.println("N�o foi poss�vel abastecer. \nQuantidade de litros que faltam para completar o tanque: " + (200 - getlitrosCombustivel()));
			
	}
	
	@Override
	public void acelerar() {
		if(getisLigado() && getlitrosCombustivel() >= 1 && getvelocidade() <= 400) {
			setvelocidade(getvelocidade() + 20);
			setlitrosCombustivel(getlitrosCombustivel() - 1);
			System.out.println("O carro est� a " + getvelocidade() + "km/h");
			System.out.println("O carro possui " + getlitrosCombustivel() + " litros de combust�vel.");
		}
		else if(getisLigado() == false)
			System.out.println("O carro est� desligado, ligue o carro para acelerar.");
		
		else if(getvelocidade() > 400)
			System.out.println("Voc� est� muito r�pido. N�o � poss�vel acelerar.");
		else
			System.out.println("O carro est� sem combust�vel.");
}
}
