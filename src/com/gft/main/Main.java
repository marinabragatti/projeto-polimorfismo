package com.gft.main;

import java.util.Scanner;

import com.gft.model.Aviao;
import com.gft.model.Caminhao;
import com.gft.model.Carro;

public class Main {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		Aviao aviao = new Aviao();
		
		Caminhao caminhao = new Caminhao();
		
		caminhao.ligar();
		
		caminhao.abastecer(15);
		
		caminhao.acelerar();
		
		carro.ligar();
		
		carro.abastecer(15);
		
		carro.acelerar();
		
		aviao.ligar();
		
		aviao.abastecer(15);
		
		aviao.acelerar();
		
	}

}
