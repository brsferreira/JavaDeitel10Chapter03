package capitulo03;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Objeto para entrada de dados.
		
		// COLETAR DADOS DO USUARIO
		System.out.println("Prezado cliente, por favor, insira as informações necessárias ao processamento.");
		
		System.out.print("Informe o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Informe o seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Informe o seu sexo: ");
		String sexo = sc.nextLine();
		
		System.out.print("Informe o dia de nascimento: ");
		String diaNascimento = sc.nextLine();
		
		System.out.print("Informe o mês de nascimento: ");
		String mesNascimento = sc.nextLine();
		
		System.out.print("Informe o ano de nascimento: ");
		String anoNascimento = sc.nextLine();
		
		System.out.print("Informe o seu peso em Kilogramas: ");
		float peso = (float)sc.nextFloat();
		
		System.out.print("Informe a sua altura em metros: ");
		float altura = (float)sc.nextFloat();
		
		sc.close();
		
		// CRIAR O OBJETO COM OS VALORES INFORMADOS
		
		HealthProfile hp = new HealthProfile(nome, sobrenome, sexo, diaNascimento, mesNascimento, anoNascimento, altura, peso);
		
		System.out.println("Dados informados...");
		System.out.println(hp.toString());

		// CALCULO DA IDADE
		
		int idade = hp.idade(diaNascimento, mesNascimento, anoNascimento);
		System.out.print("Idade: " + idade + "anos\n");
		
		// FREQUENCIA CARDIACA MAXIMA
		
		int fcm = hp.frequenciaCardiacaMaxima(idade);
		System.out.print("Frequencia cardíaca máxima: " + fcm + "bpm\n");
		
		// FREQUENCIA CARDIACA MAXIMA
		
		double fca = hp.frequenciaCardiacaAlvo(fcm);
		System.out.printf("Frequancia cardíaca alvo: %.2f%%%n", fca);
		
		// CALCULO DO IMC
		
		hp.indiceMassCorporal(peso, altura);
		System.out.println("");
	}

}//END CLASS
