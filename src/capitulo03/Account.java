package capitulo03;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Figura 3.1: Account.java
// Classe Account que cont�m uma vari�vel de inst�ncia name 
// e m�todos para configurar e obter seu valor.

public class Account {
	
	private String name;
	private double balance;
	


	public Account() {
	}
	
	
	public Account(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	
	public void deposito(double valorDepoisto) {
		if(valorDepoisto > 0.0)
			balance = balance + valorDepoisto;
		else
			System.out.print("Apenas valores positivos podem ser depositados !");
	}
	
	
	public static void displayAccount(Account ac) {
		
		JOptionPane.showMessageDialog(null, ac.name + ", Bemvido ao sistema", "Sistema Banc�rio", 1);
		JOptionPane.showMessageDialog(null, "Prezado(a) " + ac.name + " seu saldo inicial �: " + ac.balance + " reais");
		String valor = JOptionPane.showInputDialog("Insira o valor do deposito:");
		double depositado = Double.parseDouble(valor); // converte a string(valor) para double.
		String message = String.format("O valor depositado foi de: $%.2f reais", depositado);
		JOptionPane.showMessageDialog(null, message);
		ac.deposito(depositado);//chama o metodo deposito(...) passando o valor depositado.
		String message2 = String.format("prezado(a) %s, seu saldo �: $%.2f reais", ac.name,ac.balance);
		JOptionPane.showMessageDialog(null, message2);
		
		/*System.out.printf("Saldo conta de %s = $%.2f %n", ac.getName(), ac.getBalance());
		Scanner sc = new Scanner(System.in);
		System.out.printf("Insira o valor do deposito para conta de %s:", ac.getName());
		double valorDeposito = sc.nextDouble();
		System.out.printf("Valor depositado = $%.2f %n",valorDeposito);
		ac.deposito(valorDeposito);
		System.out.printf("Saldo conta(%s) = $%.2f %n", ac.getName(),ac.getBalance());*/
		
	}

	/* (Classe Account modificada) Modifique a classe Account (Figura�3.8) para fornecer um m�todo chamado withdraw que retira
	 *  dinheiro de uma Account. Assegure que o valor de d�bito n�o exceda o saldo de Account. Se exceder, o saldo deve ser deixado inalterado 
	 *  e o m�todo deve imprimir uma mensagem que indica "Withdrawalamountexceededaccountbalance" [Valor de d�bito 
	 *  excedeu o saldo da conta]. Modifique a classe AccountTest (Figura 3.9) para testar o m�todo withdraw.*/
	
	public static void withdraw(Account ac) {
		
		System.out.print("Insira o valor a ser debitado:");
		Scanner sc = new Scanner(System.in);
		double debito = sc.nextDouble();
		if(debito > ac.balance)
			System.out.print("N�o h� saldo suficiente.\n");
		else
			ac.balance = ac.balance - debito;
			System.out.printf("Saldo atual: $%.2f" + "reais", ac.balance);
		sc.close();
	}	
	
	

	//GET AND SET
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	

}
