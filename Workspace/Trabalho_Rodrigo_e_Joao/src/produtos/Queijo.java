package produtos;

public class Queijo extends Produtos{
	
	//Atributos específicos
	private String animal, textura, TProduto;
	
	//Construtor
	public Queijo(String nome, String pais, String marca, double valor, String animal, String textura, String TProduto) {
		super (nome, pais, marca, valor);
		this.animal = animal;
		this.textura = textura;
		this.TProduto = TProduto;
	}
	
	

	//Getters & Setters
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getTextura() {
		return textura;
	}
	public void setTextura(String textura) {
		this.textura = textura;
	}
	
	public String getTProduto() {
		return TProduto;
	}

	public void setTProduto(String tProduto) {
		TProduto = tProduto;
	}

}
