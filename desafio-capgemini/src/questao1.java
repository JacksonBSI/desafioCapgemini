import java.util.Scanner;

//Código referente à primeira questão do desafio de programação - Academia Capgemini!

public class questao1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		/*Declaração da variável n que irá determinar o tamanho da "escada" de * 
		pedido no enunciado da questão*/
		
		int n=0;
		
		/*Declaração da variavel tipo Scanner que grava a entrada de dados do usuário*/
		
		Scanner leia = new Scanner(System.in);
	
		/* While permanece ativo Lendo valores fornecidos pelo usuário enquanto 
		 o mesmo não digitar um numero Inteiro*/
		
		while(true){
			
			System.out.println("Informe um número de '*' que formarão a escada: ");
		    
			/*Inicialmente o valor recebido é do tipo String e mais a frente usando
			tratamento de excessões é convertido para tipo Inteiro*/
			
			String tamanho = leia.nextLine();

		    try{
		        n = Integer.parseInt(tamanho); 
		        break;
		    }
		    catch(NumberFormatException e){
		        System.out.printf("Você não digitou um número inteiro, tente novamente!\n\n");
		    }
		}
		
		/*Foi criado um array chamado escada, para armazenar os 'n' "*" que constituem a escada
		do enunciado da questão*/
		
		char[] escada;
		escada = new char[n];
		
		/*No primeiro For todos os N espaços são preenchidos com ' ' espaços em branco*/
		
		for(int i = 0; i < n; i++){
			   escada[i]=' ';
		} 
		
		/*No segundo For os espaços do Array Escada são preenchidos em ordem decrescente
		e exibe-se o estudo atual do vetor após cada iteração! para alcançar o
		objetivo proposto no enunciado da questão!*/
				
		for(int i = n-1; i>-1; i--){
			   escada[i]='*';
			   System.out.println(escada);
		}		
	}

}//fim do código
