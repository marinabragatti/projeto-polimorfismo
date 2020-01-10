package com.gft.model;

public class Veiculo {
	
private String marca;
	
	private String modelo;
	
	private String placa;
	
	private String cor;
	
	private float km;
	
	private boolean isLigado;
	
	private int litrosCombustivel;
	
	private int velocidade;
	
	private double preco;
	
	public String getmarca() {
		return marca;
	}
	
	public void setmarca(String marca) {
		this.marca = marca;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getplaca() {
		return placa;
	}
	
	public void setplaca(String placa) {
		this.placa = placa;
	}
	
	public String getcor() {
		return cor;
	}
	
	public void setcor(String cor) {
		this.cor = cor;
	}
	
	public float getkm() {
		return km;
	}
	
	public void setkm(float km) {
		this.km = km;
	}
	
	public boolean getisLigado() {
		return isLigado;
	}
	
	public void setisLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	public int getlitrosCombustivel() {
		return litrosCombustivel;
	}
	
	public void setlitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	
	public int getvelocidade() {
		return velocidade;
	}
	
	public void setvelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public double getpreco() {
		return preco;
	}
	
	public void setpreco(double preco) {
		this.preco = preco;
	}
	
	
	
	//Métodos
	
	public void ligar() {
		if(this.isLigado == true)
			System.out.println("O carro já está ligado.");
		else {
			this.isLigado = true;
			System.out.println("Você ligou o carro.");
		}
	}
	
	public void desligar() {
		if(this.isLigado == false)
			System.out.println("O carro já está desligado.");
		else {
			this.isLigado = false;
			System.out.println("Você desligou o carro.");
		}
	}
	
	public void acelerar() {
		if(this.isLigado && this.litrosCombustivel >= 1 && this.velocidade <= 140) {
			this.velocidade += 20;
			this.litrosCombustivel -= 1;
			System.out.println("O carro está a " + this.velocidade + "km/h");
			System.out.println("O carro possui " + this.litrosCombustivel + " litros de combustível.");
		}
		
		else if(this.isLigado == false)
			System.out.println("O carro está desligado, ligue o carro para acelerar.");
		
		else if(this.velocidade > 140)
			System.out.println("Você está muito rápido. Não é possível acelerar.");
		else
			System.out.println("O carro está sem combustível.");
			
		}
	
	public void frear() {
		if(this.isLigado && this.velocidade != 0) {
			this.velocidade -= 10;
			System.out.println("O carro está a " + this.velocidade + "km/h");
		}
		else if (this.isLigado && this.velocidade == 0)
			System.out.println("O carro está ligado e parado.");
		else
			System.out.println("O carro está desligado.");
		
	}
	
	public void pintar(String cor){
		this.cor = cor;
		System.out.println("Seu carro agora é " + this.cor);
	}
	
	public void abastecer(int qtdeLitros) {
		if ((this.litrosCombustivel + qtdeLitros) <= 100) {
			this.litrosCombustivel = this.litrosCombustivel + qtdeLitros;
			System.out.println("O carro está abastecido com " + this.litrosCombustivel + " litros");
		}
		else
			System.out.println("Não foi possível abastecer. \nQuantidade de litros que faltam para completar o tanque: " + (100 - this.litrosCombustivel));
	}
	
}
