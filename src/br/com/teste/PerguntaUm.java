package br.com.teste;

public class PerguntaUm {
	public static void main(String[] args) {
		
//		Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 0; 
//		Enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; }
//		Imprimir(SOMA); 
//		Ao final do processamento, qual será o valor da variável SOMA?
				
		int INDICE = 13;
		int SOMA = 0;
		
		for (int K = 0; K < INDICE; K++) {
			SOMA = SOMA + K;
		}
		
		System.out.println(SOMA);
		
	}
}