package br.com.teste;

public class PerguntaQuatro {

	public static void main(String[] args) {
		
//		4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado: 
//		•    SP – R$67.836,43 
//		•    RJ – R$36.678,66 
//		•    MG – R$29.229,88 
//		•    ES – R$27.165,48 
//		•    Outros – R$19.849,53
//
//		Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. 
	
		double faturamentoMensalSP = 67836.43;
		double faturamentoMensalRJ = 36678.66;
		double faturamentoMensalMG = 29229.88;
		double faturamentoMensalES = 27165.48;
		double faturamentoMensalOutros = 19849.53;
		
		double soma = faturamentoMensalSP + faturamentoMensalRJ + faturamentoMensalMG + faturamentoMensalES + faturamentoMensalOutros;
		
		System.out.println("Percentual de representação de SP: " + faturamentoMensalSP / soma * 100);
		System.out.println("Percentual de representação de RJ: " + faturamentoMensalRJ / soma * 100);
		System.out.println("Percentual de representação de MG: " + faturamentoMensalMG / soma * 100);
		System.out.println("Percentual de representação de ES: " + faturamentoMensalES / soma * 100);
		System.out.println("Percentual de representação de outros: " + faturamentoMensalOutros / soma * 100);
		
	}
	
}
