package capitulo03;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		
		//Obter a entrada do usuario
		Scanner sc = new Scanner(System.in);
				
		//Criar o objeto account
		Account myAccount = new Account();
		
		//Exibe o valor inicial do nome
		System.out.printf("Valor inicial do nome: %s%n", myAccount.getName());
		
		//Solicita e le o nome inserido pelo usuario
		System.out.print("Insira seu nome: ");
		String theName = sc.nextLine();
		myAccount.setName(theName);
		System.out.printf("O nome inserido foi: %s%n", myAccount.getName());
		sc.close();
	}

}//END CLASS
