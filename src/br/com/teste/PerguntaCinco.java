package br.com.teste;

public class PerguntaCinco {
	
	public static void main(String[] args) {
		
//		Escreva um programa que inverta os caracteres de um string. 
//
//		IMPORTANTE: 
//		a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código; 
//		b) Evite usar funções prontas, como, por exemplo, reverse; 
		
		
		String texto = "Fabiano";
		
		char[] charText = texto.toCharArray();
		char[] charTextReverse = new char[texto.length()];
		
		for (int i = charText.length - 1; i > -1; i--) {
			charTextReverse[charText.length - 1 - i] = charText[i];
		}
		
		String textoReverso = new String(charTextReverse);
		System.out.println(textoReverso);
		
	}

}
