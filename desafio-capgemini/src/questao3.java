//Código referente à segunda questão do desafio de programação - Academia Capgemini!

import java.util.Arrays;

import java.util.Scanner;

public class questao3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		/*Declaração da variavel tipo Scanner que grava a entrada de dados do usuário*/
		Scanner leia = new Scanner(System.in);
	
		System.out.println("Digite a palavra: ");
		
		/*Declaração da variável que irá receber a palavra digitada pelo o usuário
		conforme pedido no enunciado da questão, também há a declaração de uma outra
		variavel do tipo String no e que atuará como auxiliar para verificar se a 
		palavra possui anagramas*/
		
		String palavra = leia.nextLine();
		
		String aux = palavra;
		
		/*Declaração da variável contador que retornará a quantidade de anagramas na 
		 palavra*/
		
		int contador=0;
		
		
		/*Na lógica implementada foram feitos dois For, o For mais externo (o primeiro
		no caso), irá percorrer a string do primeiro caractere até a metade da palavra
		inicia fazendo o teste individual com a primeira letra e as demais para verificar
		a ocorrencia, da mesma letra o teste é realizado no For mais interno e assim 
		após percorrer toda a palavra testando as ocorrencias o algoritmo passa à 
		segunda letra e passa a testar de 2 em 2 depois de 3 em 3 e assim sucessivamente
		ao final retorna a quantidade de anagramas encontrados e exibe o resultado*/
		
		for(int i=0; i<=(int)(palavra.length()/2); i++){
			String b = (aux.substring(0, i+1));
			char[] x = b.toCharArray();
								
			b = (aux.substring(i+1,palavra.length()));
			char[] y = b.toCharArray(); 
			
			
			Arrays.sort(x);
			Arrays.sort(y);
			
			/*Após a ordenação dos 2 vetores contendo partes da palavra digitada
			então é feito o teste de ocorrencia dos anagramas*/
				
			for (char c : x) {
				
				for(char d : y){
						
					/*Caso os caracteres armazenados,sejam exatamente iguais independente da 
					ordem de ocorrencia então o contador é incrementado*/
					
					if((Character.compare(c, d)==0)){
						contador=contador+1;
					}
				
				}
			}
			
		}
		
		//Ao fim é exibido o resultado final de quantos anagramas a palavra possui
		
		System.out.println(contador);
	}		
}
