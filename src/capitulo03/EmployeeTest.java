package capitulo03;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Bruno", "Ferreira", 1000.0);
		
		double salarioMensal = emp1.getSalarioMensal();
		
		double salarioAnual = emp1.salarioAnual(salarioMensal);
		
		System.out.printf("Salario Anual: $%.2f%n", salarioAnual);
		System.out.println("Aplicando aumento de salario:");
		
		double novoSalario = emp1.AumentoSalarial(10);
		emp1.setSalarioMensal(novoSalario);
		System.out.printf("Novo salario: %.2f%n", emp1.getSalarioMensal());
		
		
		salarioAnual = emp1.salarioAnual(novoSalario);
		System.out.printf("Salario Anual: $%.2f%n", salarioAnual);
		
		
	}

}//END CLASS
