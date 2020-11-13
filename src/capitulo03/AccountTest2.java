package capitulo03;

public class AccountTest2 {

	public static void main(String[] args) {

		Account ac1 = new Account("Bruno", 50.00);
		new Account("Nadia", -30.00);
		
		/*//exibi o saldo inicial de cada objeto
		System.out.printf("Saldo conta1 %s = $%.2f %n", ac1.getName(), ac1.getBalance());
		System.out.printf("Saldo conta2 %s = $%.2f %n", ac2.getName(), ac2.getBalance());
		
		//Obter entrada dos valores para deposito
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o valoe do deposito para conta1: ");
		double valorDeposito1 = sc.nextDouble();
		System.out.printf("Valor depositado = $%.2f %n",valorDeposito1);
		ac1.deposito(valorDeposito1);
		
		System.out.printf("Insira o valoe do deposito para conta2: ");
		double valorDeposito2 = sc.nextDouble();
		System.out.printf("Valor depositado = $%.2f %n",valorDeposito2);
		ac2.deposito(valorDeposito2);
		
		//Exibir os saldos
		System.out.printf("Saldo conta1(%s) = $%.2f %n", ac1.getName(),ac1.getBalance());
		System.out.printf("Saldo conta2(%s) = $%.2f %n", ac2.getName(),ac2.getBalance());*/
		
		Account.displayAccount(ac1);
		//Account.displayAccount(ac2);
		
		Account.withdraw(ac1);
		
	}

}
