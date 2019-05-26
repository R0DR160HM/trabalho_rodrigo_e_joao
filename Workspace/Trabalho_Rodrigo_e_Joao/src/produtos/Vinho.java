package produtos;

public class Vinho extends Produtos{

	//Atributos específicos
	private String cor, tipo, TProduto;
	
	
	//Construtor
	public Vinho(String nome, String pais, String marca, double valor, String cor, String tipo, String TProduto) {
		super(nome, pais, marca, valor);
		
		this.cor = cor;
		this.tipo = tipo;
		this.TProduto = TProduto;
	}


	//Getters & Setters
	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTProduto() {
		return TProduto;
	}


	public void setTProduto(String tProduto) {
		TProduto = tProduto;
	}
	
	
	
	
	
	
}
