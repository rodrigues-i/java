package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {
	public static void main(String[] args) {
		Ferrari ferrari = new Ferrari(400);

		ferrari.ligarTurbo();


		System.out.println("Ferrari");
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari.velocidadeAtual);
	
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari.velocidadeAtual);

		ferrari.acelerar();
		System.out.println(ferrari.velocidadeAtual);
		
		System.out.println();

		Carro civic = new Civic();
		System.out.println("Civic");
		
		civic.acelerar();
		System.out.println(civic.velocidadeAtual);
		
		civic.acelerar();
		System.out.println(civic.velocidadeAtual);
		
		civic.acelerar();
		System.out.println(civic.velocidadeAtual);
	}
}