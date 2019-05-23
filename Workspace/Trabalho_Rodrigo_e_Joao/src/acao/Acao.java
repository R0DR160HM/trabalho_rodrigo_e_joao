package acao;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

import beans.Atributos;
import dados.Vetor;
import produtos.Queijo;
import produtos.Vinho;

public class Acao {
	
	//Cadastrar ao ArrayList
	public void cadastrarUsuarios(Atributos at) {
		Vetor.vetorUsuarios.add(at);
		
	}
	
	
	
	//Cadastrar vinhos
	public void cadastrarVinho(String nome, String pais, String marca, double valor, String cor, String tipo) {
		
		try {
		Vinho v = new Vinho(nome, pais, marca, valor, cor, tipo);
		Vetor.vetorProdutos.add(v);
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Insira um valor válido");
		}
		
	}
	
	//Cadastrar queijos
	public void cadastrarQueijo(String nome, String pais, String marca, double valor, String animal, String textura) {
		
		try {
		Queijo q = new Queijo(nome, pais, marca, valor, animal, textura);
		Vetor.vetorProdutos.add(q);
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Insira um valor válido");
		}
		
	}
	
	
	
	//Retornar data
	public String data() {
		LocalDateTime date = LocalDateTime.now();
		
		int dia = date.getDayOfMonth();
		int mes = date.getMonthValue();
		int ano = date.getYear();
		String texto = dia+"/"+mes+"/"+ano;
		
		return texto;
	}
	
	
	
	//Retornar hora
	public String horario() {
		LocalDateTime date = LocalDateTime.now();
		
		int hora = date.getHour();
		int minuto = date.getMinute();
		
		String texto = hora+":"+minuto;
		
		return texto;
	}
	
	
	
	//Converter senha em String
	public String senha(JPasswordField senha) {
		
		char[] texto = senha.getPassword();
		String resultado = "";
		
		for (int i=0; i<texto.length; i++) {
			resultado+=texto[i];
		}
		
		return resultado;
		
	}
	
	//Atualizar a tabela de pesquisa
	public DefaultTableModel atualizar(String a) {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Marca");
		dadosTabela.addColumn("PdO");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Vetor.vetorProdutos.size(); i++) {
			
			if(Vetor.vetorProdutos.get(i).getNome().startsWith(a)) {
			dadosTabela.addRow(new Object[] {Vetor.vetorProdutos.get(i).getNome(), Vetor.vetorProdutos.get(i).getMarca(), Vetor.vetorProdutos.get(i).getPais(), Vetor.vetorProdutos.get(i).getValor()});
			}
		}
			

		return dadosTabela;
	}
	


	//Verificar se existe um produto cadastrado
	public boolean Analisar(String a) {
		boolean valida = false;
		
		for(int i=0; i<Vetor.vetorProdutos.size(); i++) {
		
			if(Vetor.vetorProdutos.get(i).getNome().startsWith(a)) {
				valida = true;
			}
			
		}
		return valida;
	}
}