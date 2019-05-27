package beans;

public class Carrinho {

	String nome, produto;
	int qtd;
	double valorUn;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getValorUn() {
		return valorUn;
	}
	public void setValorUn(double valorUn) {
		this.valorUn = valorUn;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	
}
