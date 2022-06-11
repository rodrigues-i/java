package colecoes;

import java.util.HashMap;
import java.util.Map;

import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();

		// O metodo put tanto adiciona valor quanto o atualiza
		usuarios.put(1,"Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty()); // checa se a colecao está vazia

		System.out.println(usuarios.keySet()); // keySet pega todas as chaves
		System.out.println(usuarios.values()); // values retorna os valores
		System.out.println(usuarios.entrySet()); // entrySet retorna tanto as chaves quanto os valores

		System.out.println();

		// Checa se contem 
		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Rebeca"));

		System.out.println();
		System.out.println(usuarios.get(3)); // Pega o valor com base na chave

		System.out.println();

		// REMOVE COM BASE NA CHAVE
		usuarios.remove(3);

		// REMOVE A PARTIR DA CHAVE VALOR
		usuarios.remove(1, "Okga");

		// Percorrendo as chaves
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}

		System.out.println();

		// Percorrendo os valores
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}

		System.out.println();

		// Percorrendo valor e chave ao mesmo tempo
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
		
	}
}