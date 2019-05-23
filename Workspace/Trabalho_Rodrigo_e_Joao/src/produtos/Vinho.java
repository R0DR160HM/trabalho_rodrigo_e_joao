package produtos;

public class Vinho extends Produtos{

	//Atributos específicos
	private String cor, tipo;
	
	//Construtor
	public Vinho(String nome, String pais, String marca, double valor, String cor, String tipo) {
		super(nome, pais, marca, valor);
		
		this.cor = cor;
		this.tipo = tipo;
		
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
	
}
