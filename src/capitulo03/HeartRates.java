package capitulo03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*(Calculadora de frequ�ncia card�aca alvo) Ao fazer exerc�cios f�sicos, voc� pode utilizar um monitor de frequ�ncia card�aca para ver 
se sua frequ�ncia permanece dentro de um intervalo seguro sugerido pelos seus treinadores e m�dicos. Segundo a American Heart Associa-
tion (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a f�rmula para calcular a frequ�ncia card�aca 
m�xima por minuto � 220 menos a idade em anos. Sua frequ�ncia card�aca alvo � um intervalo entre 50-85% da sua frequ�ncia card�aca 
m�xima. [Observa��o: essas f�rmulas s�o estimativas fornecidas pela AHA. As frequ�ncias card�acas m�ximas e alvo podem variar com 
base na sa�de, capacidade f�sica e sexo da pessoa. Sempre consulte um m�dico ou profissional de sa�de qualificado antes de come�ar 
ou modificar um programa de exerc�cios f�sicos.] Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, 
sobrenome e data de nascimento da pessoa (consistindo em atributos separados para m�s, dia e ano de nascimento). Sua classe deve ter um 
construtor que receba esses dados como par�metros. Para cada atributo forne�a m�todos set e get. A classe tamb�m deve incluir um m�todo 
que calcule e retorne a idade (em anos), um que calcule e retorne a frequ�ncia card�aca m�xima e um que calcule e retorne a frequ�ncia 
card�aca alvo da pessoa. Escreva um aplicativo Java que solicite as informa��es da pessoa, instancie um objeto da classe HeartRates e 
imprima as informa��es a partir desse objeto � incluindo nome, sobrenome e data de nascimento da pessoa � calcule e imprima a idade 
da pessoa (em anos), seu intervalo de frequ�ncia card�aca m�xima e sua frequ�ncia card�aca alvo.*/


// f�rmula para calcular a frequ�ncia card�aca m�xima por minuto � 220 menos a idade em anos
// Sua frequ�ncia card�aca alvo � um intervalo entre 50-85% da sua frequ�ncia card�aca m�xima.

public class HeartRates {
	
	private String nome;
	private String sobrenome;
	private String dataMascimento;
	
	
	public HeartRates(String nome, String sobrenome, String dataMascimento) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataMascimento = dataMascimento;
	}

	public int idade(String dataNascimento){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 			// Formata a data para o padrao dd/MM/yyyy.
		LocalDate dataAniversario = LocalDate.parse(dataNascimento, dtf);	// Formata a data de aniversario para o padrao dd/MM/yyyy
		LocalDate dataAtual = LocalDate.now(); 										// captura a data atual					
		int intervalo = Period.between(dataAniversario, dataAtual).getYears(); 		// Calcula o intervalo em anos entre a data atual e a data de nascimento
		return intervalo;
	}
	
	public int frequenciaCardiacaMaxima(int idade) {
		return 220 - idade;
	}
	
	public double frequenciaCardiacaAlvo(int FCM) {
		return (FCM/220.0);
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getDataMascimento() {
		return dataMascimento;
	}


	public void setDataMascimento(String dataMascimento) {
		this.dataMascimento = dataMascimento;
	}
	
	
	
	
	
	

}//END CLASS
