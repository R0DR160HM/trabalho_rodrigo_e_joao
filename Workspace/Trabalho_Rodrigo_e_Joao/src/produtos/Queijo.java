package produtos;

public class Queijo extends Produtos{
	
	//Atributos específicos
	private String animal, textura;
	
	//Construtor
	public Queijo(String nome, String pais, String marca, double valor, String animal, String textura, String tipoProduto) {
		super (nome, pais, marca, valor, tipoProduto);
		this.animal = animal;
		this.textura = textura;
		
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
	

}
