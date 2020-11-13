package capitulo03;

/*(Classe  Invoice) Crie uma classe chamada Invoice para que uma loja de suprimentos de inform�tica a utilize para representar uma 
fatura de um item vendido nela. Uma Invoice (fatura) deve incluir quatro partes das informa��es como vari�veis de inst�ncia � o 
n�mero (tipo String), a descri��o (tipo String), a quantidade comprada de um item (tipo int) e o pre�o por item (double). Sua 
classe deve ter um construtor que inicializa as quatro vari�veis de inst�ncia. Forne�a um m�todo set e um get para cada vari�vel de ins-
t�ncia. Al�m disso, forne�a um m�todo chamado getInvoiceAmount que calcula o valor de fatura (isto �, multiplica a quantidade pelo 
pre�o por item) e depois retorna esse valor como double. Se a quantidade n�o for positiva, ela deve ser configurada como 0. Se o pre�o 
por item n�o for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado InvoiceTest que demonstra as 
capacidades da classe Invoice.*/

public class Invoice {
	
	private String numero;
	private String descricao;
	private int qtdItem;
	private double preco;
	
	
	public Invoice(String numero, String descricao, int qtdItem, double preco) {
		super();
		this.numero = numero;
		this.descricao = descricao;
		this.qtdItem = qtdItem;
		this.preco = preco;
	}
	
	public double getInvoiceAmount(int qtdItem, double preco) {
		
		this.qtdItem = qtdItem;
		this.preco = preco;
		if(qtdItem < 0)
			qtdItem = 0;
		if(preco < 0)
			preco = 0.0;
		
		return qtdItem*preco;
		
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getQtdItem() {
		return qtdItem;
	}


	public void setQtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Invoice [numero=" + numero + ", descricao=" + descricao + ", qtdItem=" + qtdItem + ", preco=" + preco
				+ "]";
	}
	
	
	
	

}//END Invoice Class
