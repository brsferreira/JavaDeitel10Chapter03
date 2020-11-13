package capitulo03;

/*(Classe Employee) Crie uma classe chamada Employee que inclua tr�s vari�veis de inst�ncia � um primeiro nome (tipo String), um 
sobrenome (tipo String) e um sal�rio mensal (double). Forne�a um construtor que inicializa as tr�s vari�veis de inst�ncia. Forne�a um 
m�todo set e um get para cada vari�vel de inst�ncia. Se o sal�rio mensal n�o for positivo, n�o configure seu valor. Escreva um aplicativo de 
teste chamado EmployeeTest que demonstre as capacidades da classe Employee. Crie dois objetos Employee e exiba o sal�rio anual
de cada objeto. Ent�o d� a cada Employee um aumento de 10% e exiba novamente o sal�rio anual de cada Employee.*/

public class Employee {
	
	private String nome;
	private String sobrenome;
	private double salarioMensal;
	
	
	public Employee(String nome, String sobrenome, double salarioMensal) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMensal = salarioMensal;
	}
	
	public double salarioAnual(double salarioAnual) {
		salarioAnual = this.salarioMensal*12;
		return salarioAnual;
	}
	
	public double AumentoSalarial(int aumento) {
		return salarioMensal + (aumento/100.0)*salarioMensal;
		
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

	public double getSalarioMensal() {
		if(salarioMensal < 0)
			System.out.printf("O sal�rio mansal deve ser um n�mero positivo.");
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}

}//END CLASS 
