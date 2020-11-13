package capitulo03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*(Calculadora de frequência cardíaca alvo) Ao fazer exercícios físicos, você pode utilizar um monitor de frequência cardíaca para ver 
se sua frequência permanece dentro de um intervalo seguro sugerido pelos seus treinadores e médicos. Segundo a American Heart Associa-
tion (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), a fórmula para calcular a frequência cardíaca 
máxima por minuto é 220 menos a idade em anos. Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca 
máxima. [Observação: essas fórmulas são estimativas fornecidas pela AHA. As frequências cardíacas máximas e alvo podem variar com 
base na saúde, capacidade física e sexo da pessoa. Sempre consulte um médico ou profissional de saúde qualificado antes de começar 
ou modificar um programa de exercícios físicos.] Crie uma classe chamada HeartRates. Os atributos da classe devem incluir o nome, 
sobrenome e data de nascimento da pessoa (consistindo em atributos separados para mês, dia e ano de nascimento). Sua classe deve ter um 
construtor que receba esses dados como parâmetros. Para cada atributo forneça métodos set e get. A classe também deve incluir um método 
que calcule e retorne a idade (em anos), um que calcule e retorne a frequência cardíaca máxima e um que calcule e retorne a frequência 
cardíaca alvo da pessoa. Escreva um aplicativo Java que solicite as informações da pessoa, instancie um objeto da classe HeartRates e 
imprima as informações a partir desse objeto — incluindo nome, sobrenome e data de nascimento da pessoa — calcule e imprima a idade 
da pessoa (em anos), seu intervalo de frequência cardíaca máxima e sua frequência cardíaca alvo.*/


// fórmula para calcular a frequência cardíaca máxima por minuto é 220 menos a idade em anos
// Sua frequência cardíaca alvo é um intervalo entre 50-85% da sua frequência cardíaca máxima.

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
