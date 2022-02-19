import java.util.Scanner;

//Código referente à segunda questão do desafio de programação - Academia Capgemini!

public class questao2 {

	public static void main(String[] args) {
				
		/*Declaração da variavel tipo Scanner que grava a entrada de dados do usuário*/
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		/*Declaração da variável senha que irá receber a senha digitada pelo o usuário
		conforme pedido no enunciado da questão*/
		
		String senha;
		
		
		/* While permanece ativo Lendo valores fornecidos pelo usuário enquanto 
		 o mesmo não digitar uma senha com os requisitos solicitados*/
		
		while(true){
			System.out.println("Informe uma senha forte que deve conter minimo:\n"
				+ "6 Caracteres \n"
				+ "Numero\n"
				+ "Letra Maiuscula\n"
				+ "Letra minuscula\n"
				+ "Caractere Especial");
				
			senha = leia.nextLine();
			
			/*Declaração de 5 variáveis  do tipo Inteiro para gravarem respectivamente:
			 O tamanho da senha atual digitada, e a quantidade de caracteres do tipo
			 numero, maiuscula, minuscula e especial que faltam na senha por isso as 
			 variaves se iniciam com valor = 1, pois no teste logico se testará a quan-
			 tidade de caracteres especificos e então será decrementado das variaveis*/
			
			int tamSenha=senha.length();
			int numero=1;
			int maiuscula=1;
			int minuscula=1;
			int especial=1;
			
			
			/*Declaração de 4 variáveis  do tipo Booleano para gravarem a presença
			 de caracteres solicitados na senha,  inicialmente são declaradas 
			 com valor false, pois no teste logico se testará a presença dos 
			 valores na senha e então é alterado*/
			
			
			boolean achouNumero = false;
			boolean achouMaiuscula = false;
			boolean achouMinuscula = false;
			boolean achouSimbolo = false;
			
			
			/* O For percorre a senha de um em um caractere e testa se ele é 
			 numero inteiro, letra maiuscula, ou minuscula ou caracter especial
			 e de acordo com o tipo o valor boleano é alterado para verdadeiro
			 bem como o valor inteiro relacionado ao tipo do caractere é alterado para
			 0, significando que o requisito de possuir aquele tipo na senha foi atingido*/
			
			
			for (char c : senha.toCharArray()) {
				if (c >= '0' && c <= '9') {
			             achouNumero = true;
			             numero=0;
			    } else if (c >= 'A' && c <= 'Z') {
			             achouMaiuscula = true;
			             maiuscula=0;
			    } else if (c >= 'a' && c <= 'z') {
			             achouMinuscula = true;
			             minuscula=0;
			    } else {
			             achouSimbolo = true;
			             especial=0;
			    }
			}
			
			/*O primeiro teste verifica se a senha possui 6 digitos no minimo e cada um
			dos requisitos solicitados no enunciado da questão, se Sim o While então
			é finalizado e certifica para o usuário*/
			
			if(tamSenha>=6 && (achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo)){
				System.out.println("A Senha atende aos requisitos, não precisa adicionar nenhum caracter");
				break;	
			}
			
			/*Os demais testes verificam se a senha possue menos de 6 Caracteres e quais 
			tipos de caracteres estão presentes e de acordo com o resultado, exibe
			para o usuário quantos caracteres ainda precisam ser adicionados à senha
			conforme exigido no enunciado da questão 2, enquanto o usuário não digitar
			uma senha apropriada a janela de dialogo não é fechada e nem a senha 
			certificada*/
			
			else if(tamSenha<6 && (achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo) ){
				System.out.printf("Adicione %d Caracteres à senha\n\n",(6-tamSenha));
			}else if(tamSenha>=6){
				System.out.printf("Adicione %d Caracteres à senha\n\n",numero+maiuscula+minuscula+especial);
			}else if(tamSenha==5){
				System.out.printf("Adicione %d Caracteres à senha\n\n",numero+maiuscula+minuscula+especial);
			}else if ((tamSenha==4) && (numero+maiuscula+minuscula+especial > 2)) {
				System.out.printf("Adicione 3 Caracteres à senha\n\n");
			} else if ((tamSenha==4) && (numero+maiuscula+minuscula+especial < 2)) {
				System.out.printf("Adicione 2 Caracteres à senha\n\n");
			} 
			else {
				System.out.printf("Adicione %d Caracteres à senha\n\n",(6-tamSenha));
			}
		}

		
   	}

}//fim do código
