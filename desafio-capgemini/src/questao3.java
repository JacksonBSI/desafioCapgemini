//C�digo referente � segunda quest�o do desafio de programa��o - Academia Capgemini!

import java.util.Arrays;

import java.util.Scanner;

public class questao3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*Declara��o da variavel tipo Scanner que grava a entrada de dados do usu�rio*/
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite a palavra: ");
		
		/*Declara��o da vari�vel que ir� receber a palavra digitada pelo o usu�rio
		conforme pedido no enunciado da quest�o, tamb�m h� a declara��o de uma outra
		variavel do tipo String no e que atuar� como auxiliar para verificar se a 
		palavra possui anagramas*/
		
		String palavra = leia.nextLine();
		
		String aux = palavra;
		
		/*Declara��o da vari�vel contador que retornar� a quantidade de anagramas na 
		 palavra*/
		
		int contador=0;
		
		
		/*Na l�gica implementada foram feitos dois For, o For mais externo (o primeiro
		no caso), ir� percorrer a string do primeiro caractere at� a metade da palavra
		inicia fazendo o teste individual com a primeira letra e as demais para verificar
		a ocorrencia, da mesma letra o teste � realizado no For mais interno e assim 
		ap�s percorrer toda a palavra testando as ocorrencias o algoritmo passa � 
		segunda letra e passa a testar de 2 em 2 depois de 3 em 3 e assim sucessivamente
		ao final retorna a quantidade de anagramas encontrados e exibe o resultado*/
		
		for(int i=0; i<=(int)(palavra.length()/2); i++){
			String b = (aux.substring(0, i+1));
			char[] x = b.toCharArray();
								
			b = (aux.substring(i+1,palavra.length()));
			char[] y = b.toCharArray(); 
			
			
			Arrays.sort(x);
			Arrays.sort(y);
			
			/*Ap�s a ordena��o dos 2 vetores contendo partes da palavra digitada
			ent�o � feito o teste de ocorrencia dos anagramas*/
				
			for (char c : x) {
				
				for(char d : y){
						
					/*Caso os caracteres armazenados,sejam exatamente iguais independente da 
					ordem de ocorrencia ent�o o contador � incrementado*/
					
					if((Character.compare(c, d)==0)){
						contador=contador+1;
					}
				
				}
			}
			
		}
		
		//Ao fim � exibido o resultado final de quantos anagramas a palavra possui
		
		System.out.println(contador);
	}		
}
