package capitulo03;

public class InvoiceTest {

	public static void main(String[] args) {
		
		Invoice inv = new Invoice("1232", "teste", 5, 50.00);
		System.out.println(inv.toString());
		
		double valorTotal = inv.getInvoiceAmount(10, 20.0);
		System.out.printf("O valor total da compra = $%.2f", valorTotal);
		
		
		

	}//END MAIN


}//END InvoiceTest Class
