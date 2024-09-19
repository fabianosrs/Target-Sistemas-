package br.com.teste;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONArray;
import org.json.JSONObject;

public class PerguntaTres {
	
	public static void main(String[] args) throws Exception {
//		3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne: 
//		• O menor valor de faturamento ocorrido em um dia do mês; 
//		• O maior valor de faturamento ocorrido em um dia do mês; 
//		• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal. 
//
//		IMPORTANTE: 
//		a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal; 
//		b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média; 
		
	    String loc = new String("src/br/com/teste/dados.json");
        File file = new File(loc);
        String content = new String(Files.readAllBytes(Paths.get(file.toURI())));

        JSONArray json = new JSONArray(content);

        double maiorValor = 0.0; 
        double menorValor = Double.MAX_VALUE;
        double media = 0;
        double diasZerados = 0;
        
        for (Object dado : json) {
            JSONObject dadoJson = (JSONObject) dado;
            if (dadoJson.getDouble("valor") > maiorValor) {
            	maiorValor = dadoJson.getDouble("valor");
			}
            if (dadoJson.getDouble("valor") != 0.0 && dadoJson.getDouble("valor") < menorValor) {
            	menorValor = dadoJson.getDouble("valor");
			}
            
            if (dadoJson.getDouble("valor") == 0.0) {
            	diasZerados++;
			}
            
            media = media + dadoJson.getDouble("valor");
        }
        
        media = media / (json.length() - diasZerados);
		
        System.out.println("Maior Valor: " + maiorValor);
        System.out.println("Menor Valor: " + menorValor);
        System.out.println("Media, ignorando os dias zerados: " + media);
	}
}