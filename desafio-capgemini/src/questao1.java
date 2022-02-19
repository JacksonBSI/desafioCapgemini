import java.util.Scanner;

//C�digo referente � primeira quest�o do desafio de programa��o - Academia Capgemini!

public class questao1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		
		/*Declara��o da vari�vel n que ir� determinar o tamanho da "escada" de * 
		pedido no enunciado da quest�o*/
		
		int n=0;
		
		/*Declara��o da variavel tipo Scanner que grava a entrada de dados do usu�rio*/
		
		Scanner leia = new Scanner(System.in);
	
		/* While permanece ativo Lendo valores fornecidos pelo usu�rio enquanto 
		 o mesmo n�o digitar um numero Inteiro*/
		
		while(true){
			
			System.out.println("Informe um n�mero de '*' que formar�o a escada: ");
		    
			/*Inicialmente o valor recebido � do tipo String e mais a frente usando
			tratamento de excess�es � convertido para tipo Inteiro*/
			
			String tamanho = leia.nextLine();

		    try{
		        n = Integer.parseInt(tamanho); 
		        break;
		    }
		    catch(NumberFormatException e){
		        System.out.printf("Voc� n�o digitou um n�mero inteiro, tente novamente!\n\n");
		    }
		}
		
		/*Foi criado um array chamado escada, para armazenar os 'n' "*" que constituem a escada
		do enunciado da quest�o*/
		
		char[] escada;
		escada = new char[n];
		
		/*No primeiro For todos os N espa�os s�o preenchidos com ' ' espa�os em branco*/
		
		for(int i = 0; i < n; i++){
			   escada[i]=' ';
		} 
		
		/*No segundo For os espa�os do Array Escada s�o preenchidos em ordem decrescente
		e exibe-se o estudo atual do vetor ap�s cada itera��o! para alcan�ar o
		objetivo proposto no enunciado da quest�o!*/
				
		for(int i = n-1; i>-1; i--){
			   escada[i]='*';
			   System.out.println(escada);
		}		
	}

}//fim do c�digo
