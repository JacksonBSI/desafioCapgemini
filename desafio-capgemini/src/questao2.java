import java.util.Scanner;

//C�digo referente � segunda quest�o do desafio de programa��o - Academia Capgemini!

public class questao2 {

	public static void main(String[] args) {
				
		/*Declara��o da variavel tipo Scanner que grava a entrada de dados do usu�rio*/
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		/*Declara��o da vari�vel senha que ir� receber a senha digitada pelo o usu�rio
		conforme pedido no enunciado da quest�o*/
		
		String senha;
		
		
		/* While permanece ativo Lendo valores fornecidos pelo usu�rio enquanto 
		 o mesmo n�o digitar uma senha com os requisitos solicitados*/
		
		while(true){
			System.out.println("Informe uma senha forte que deve conter minimo:\n"
				+ "6 Caracteres \n"
				+ "Numero\n"
				+ "Letra Maiuscula\n"
				+ "Letra minuscula\n"
				+ "Caractere Especial");
				
			senha = leia.nextLine();
			
			/*Declara��o de 5 vari�veis  do tipo Inteiro para gravarem respectivamente:
			 O tamanho da senha atual digitada, e a quantidade de caracteres do tipo
			 numero, maiuscula, minuscula e especial que faltam na senha por isso as 
			 variaves se iniciam com valor = 1, pois no teste logico se testar� a quan-
			 tidade de caracteres especificos e ent�o ser� decrementado das variaveis*/
			
			int tamSenha=senha.length();
			int numero=1;
			int maiuscula=1;
			int minuscula=1;
			int especial=1;
			
			
			/*Declara��o de 4 vari�veis  do tipo Booleano para gravarem a presen�a
			 de caracteres solicitados na senha,  inicialmente s�o declaradas 
			 com valor false, pois no teste logico se testar� a presen�a dos 
			 valores na senha e ent�o � alterado*/
			
			
			boolean achouNumero = false;
			boolean achouMaiuscula = false;
			boolean achouMinuscula = false;
			boolean achouSimbolo = false;
			
			
			/* O For percorre a senha de um em um caractere e testa se ele � 
			 numero inteiro, letra maiuscula, ou minuscula ou caracter especial
			 e de acordo com o tipo o valor boleano � alterado para verdadeiro
			 bem como o valor inteiro relacionado ao tipo do caractere � alterado para
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
			dos requisitos solicitados no enunciado da quest�o, se Sim o While ent�o
			� finalizado e certifica para o usu�rio*/
			
			if(tamSenha>=6 && (achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo)){
				System.out.println("A Senha atende aos requisitos, n�o precisa adicionar nenhum caracter");
				break;	
			}
			
			/*Os demais testes verificam se a senha possue menos de 6 Caracteres e quais 
			tipos de caracteres est�o presentes e de acordo com o resultado, exibe
			para o usu�rio quantos caracteres ainda precisam ser adicionados � senha
			conforme exigido no enunciado da quest�o 2, enquanto o usu�rio n�o digitar
			uma senha apropriada a janela de dialogo n�o � fechada e nem a senha 
			certificada*/
			
			else if(tamSenha<6 && (achouNumero && achouMaiuscula && achouMinuscula && achouSimbolo) ){
				System.out.printf("Adicione %d Caracteres � senha\n\n",(6-tamSenha));
			}else if(tamSenha>=6){
				System.out.printf("Adicione %d Caracteres � senha\n\n",numero+maiuscula+minuscula+especial);
			}else if(tamSenha==5){
				System.out.printf("Adicione %d Caracteres � senha\n\n",numero+maiuscula+minuscula+especial);
			}else if ((tamSenha==4) && (numero+maiuscula+minuscula+especial > 2)) {
				System.out.printf("Adicione 3 Caracteres � senha\n\n");
			} else if ((tamSenha==4) && (numero+maiuscula+minuscula+especial < 2)) {
				System.out.printf("Adicione 2 Caracteres � senha\n\n");
			} 
			else {
				System.out.printf("Adicione %d Caracteres � senha\n\n",(6-tamSenha));
			}
		}

		
   	}

}//fim do c�digo
