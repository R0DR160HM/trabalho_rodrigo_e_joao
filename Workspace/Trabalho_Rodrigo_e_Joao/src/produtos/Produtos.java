package produtos;

public class Produtos {
	
	//Atributos genéricos
	private String nome, pais, marca;
	private double valor;
	
	//Construtor
	public Produtos(String nome, String pais, String marca, double valor) {
		
		this.nome = nome;
		this.pais = pais;
		this.marca = marca;
		this.valor = valor;
		
	}
	
	//Setters & Getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	

}
