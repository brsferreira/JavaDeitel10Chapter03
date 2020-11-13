package capitulo03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/*3.17 (Computadoriza��o  dos  registros  de  sa�de)  Uma  quest�o  relacionada  �  assist�ncia  m�dica  discutida  ultimamente  nos  ve�culos  de 
comunica��o � a computadoriza��o dos registros de sa�de. Essa possibilidade est� sendo abordada de maneira cautelosa por causa de preo-
cupa��es quanto � privacidade e � seguran�a de dados sigilosos, entre outros motivos. [Iremos discutir essas preocupa��es em exerc�cios 
posteriores.] A computadoriza��o dos registros de sa�de pode facilitar que pacientes compartilhem seus perfis e hist�ricos de sa�de entre 
v�rios profissionais de sa�de. Isso talvez aprimore a qualidade da assist�ncia m�dica, ajude a evitar conflitos e prescri��es erradas de me-
dicamentos, reduza custos em ambulat�rios e salve vidas. Neste exerc�cio, voc� projetar� uma classe HealthProfile �inicial� para uma 
pessoa. Os atributos da classe devem incluir nome, sobrenome, sexo, data de nascimento (consistindo em atributos separados para m�s, dia 
e ano de nascimento), altura (em metros) e peso (em quilogramas) da pessoa. Sua classe deve ter um construtor que receba esses dados. 
Para cada atributo, forne�a m�todos set e get. A classe tamb�m deve incluir m�todos que calculem e retornem a idade do usu�rio em anos, 
intervalo de frequ�ncia card�aca m�xima e frequ�ncia card�aca alvo (veja o Exerc�cio 3.16), al�m de �ndice de massa corporal (IMC; veja 
o Exerc�cio�2.33). Escreva um aplicativo Java que solicite as informa��es da pessoa, instancie um objeto da classe HealthProfile para 
ela e imprima as informa��es a partir desse objeto � incluindo nome, sobrenome, sexo, data de nascimento, altura e peso da pessoa ��, e 
ent�o calcule e imprima a idade em anos, IMC, intervalo de frequ�ncia card�aca m�xima e frequ�ncia card�aca alvo. Ele tamb�m deve exibir 
o gr�fico de valores IMC do Exerc�cio�2.33.*/

public class HealthProfile {
	
	private String nome;
	private String sobrenome;
	private String sexo;
	private String diaNascimento;
	private String mesNascimento;
	private String anoNascimento;
	private  float altura;
	private  float peso;
	
	
	public HealthProfile(String nome, String sobrenome, String sexo, String diaNascimento, String mesNascimento,
			String anoNascimento, float altura, float peso) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.diaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.altura = altura;
		this.peso = peso;
	}
	
	public int idade(String dia, String mes, String ano){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 		// Formata a data para o padrao dd/MM/yyyy.
		LocalDate dataAtual = LocalDate.now(); 									// captura a data atual					
		String nascimento = dia + "/" + mes + "/" + ano;
		LocalDate dataNascimento = LocalDate.parse(nascimento, dtf);			// Formata a data de aniversario para o padrao dd/MM/yyyy
		int intervalo = Period.between(dataNascimento, dataAtual).getYears(); 	// Calcula o intervalo em anos entre a data atual e a data de nascimento
		return intervalo;
	}
	
	public int frequenciaCardiacaMaxima(int idade) {
		return 220 - idade;
	}
	
	public double frequenciaCardiacaAlvo(int FCM) {
		return (FCM/220.0)*100;
	}
	
	public void indiceMassCorporal(float peso, float altura) {
		
		float imc = (float) (peso/(Math.pow(altura, 2)));
		
		if(imc <= 18.5) {
			System.out.printf("IMC Underweight = %.2f", imc);
		}else if(imc >= 18.5 || imc <= 24.9) {
			System.out.printf("IMC NORMAL = %.2f", imc);
		}else if(imc >= 25 || imc <= 29.9) { 
			System.out.printf("IMC Overweight = %.2f", imc);
		}else{
			System.out.printf("IMC Obese = %.2f", imc);
		}
		
		System.out.print(
		"\n____________________________________________________________________________\n"		
		+ "BMI VALUES\n"
		+ "Underweight: less than 18.5\n"
		+ "Normal:      between 18.5 and 24.9\n"
		+ "Overweight:  between 25 and 29.9\n"
		+ "Obese:       30 or greater\n"
		+ "____________________________________________________________________________"
		);
	}

	@Override
	public String toString() {
		return "HealthProfile [nome=" + nome + ", sobrenome=" + sobrenome + ", sexo=" + sexo + ", diaNascimento="
				+ diaNascimento + ", mesNascimento=" + mesNascimento + ", anoNascimento=" + anoNascimento + ", altura="
				+ altura + ", peso=" + peso + "]";
	}

	//GETTERSS ANS SETTERS
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDiaNascimento() {
		return diaNascimento;
	}
	public void setDiaNascimento(String diaNascimento) {
		this.diaNascimento = diaNascimento;
	}
	public String getMesNascimento() {
		return mesNascimento;
	}
	public void setMesNascimento(String mesNascimento) {
		this.mesNascimento = mesNascimento;
	}
	public String getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(String anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	} 

}//END CLASS
