package capitulo03;


public class HeartRatesTest {

	public static void main(String[] args) {
		
		
		HeartRates hr1 = new HeartRates("Bruno", "Ferreira", "08/02/1975");
		
		String nascimento = hr1.getDataMascimento();
		int 		idade = hr1.idade(nascimento);
		int 		FCM   = hr1.frequenciaCardiacaMaxima(idade);
		double 		FCA   = hr1.frequenciaCardiacaAlvo(FCM);
		
		
		System.out.println("Idade: \t\t\t\t"+ idade + " anos");
		System.out.println("Frequencia cardíaca máxima = \t" + FCM + "bpm");
		System.out.printf("Frequencia cardíaca alvo   = \t%.2f%%", FCA*100);

		
	}

}
