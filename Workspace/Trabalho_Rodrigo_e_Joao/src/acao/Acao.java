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
	
	//Cadastrar usuário ao ArrayList
	public void cadastrarUsuarios(Atributos at) {
		
		Vetor.vetorUsuarios.add(at);
		
	}
	
	
	
	
	//Cadastrar vinhos
	public void cadastrarVinho(String nome, String pais, String marca, double valor, String cor, String tipo) {
		
		try {
			
		Vinho v = new Vinho(nome, pais, marca, valor, cor, tipo);
		Vetor.vetorVinho.add(v);
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
		
		}catch (Exception erro) {
			
			JOptionPane.showMessageDialog(null, "Insira um valor válido");
		
		}
		
	}
	
	
	
	
	//Cadastrar queijos
	public void cadastrarQueijo(String nome, String pais, String marca, double valor, String animal, String textura) {
		
		try {
			
		Queijo q = new Queijo(nome, pais, marca, valor, animal, textura);
		Vetor.vetorQueijo.add(q);
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
		
		}catch (Exception erro) {
			
			JOptionPane.showMessageDialog(null, "Insira um valor válido");
		
		}
		
	}
	
	
	
	
	//Calcular o número de produtos cadastrados
	public int calcular() {
		
		int resultado = Vetor.vetorQueijo.size() + Vetor.vetorVinho.size();
		return resultado;
		
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
	public DefaultTableModel atualizar(String pesquisa) {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Marca");
		dadosTabela.addColumn("Origem");
		dadosTabela.addColumn("Valor");
		
		for(int i=0; i<Vetor.vetorVinho.size(); i++) {
			
			if(Vetor.vetorVinho.get(i).getNome().startsWith(pesquisa)) {
			dadosTabela.addRow(new Object[] {Vetor.vetorVinho.get(i).getNome(), Vetor.vetorVinho.get(i).getMarca(), Vetor.vetorVinho.get(i).getPais(), Vetor.vetorVinho.get(i).getValor()});
			}
			
			if(Vetor.vetorQueijo.get(i).getNome().startsWith(pesquisa)) {
				dadosTabela.addRow(new Object[] {Vetor.vetorQueijo.get(i).getNome(), Vetor.vetorQueijo.get(i).getMarca(), Vetor.vetorQueijo.get(i).getPais(), Vetor.vetorQueijo.get(i).getValor()});
				}
			
		}
			

		return dadosTabela;
	}
	
	


	//Verificar se existe um produto cadastrado
	public boolean Analisar(String pesquisa) {
		
		boolean valida = false;
		
		for(int i=0; i<Vetor.vetorVinho.size(); i++) {
		
			if(Vetor.vetorVinho.get(i).getNome().startsWith(pesquisa)) {
				valida = true;
			}
			
		}
		
		for(int i=0; i<Vetor.vetorQueijo.size(); i++) {
			
			if(Vetor.vetorQueijo.get(i).getNome().startsWith(pesquisa)) {
				valida = true;
			}
			
		}
		
		return valida;
	}
	
	
	
	
	//Metodo para validar se há algo escrito
	public boolean validar1(String texto) {
		boolean valida = true;
		
		if (texto.equals("")) {
			JOptionPane.showMessageDialog(null, "Insira um produto");
			valida= false;
		}		
		return valida;
	}
	
	
	
	
	//Metodo para validar se o array produto tem algo
	public boolean validar2() {
		boolean valida = true;
		if (calcular() == 0) {
			JOptionPane.showMessageDialog(null, "Nao há nenhum produto cadastrado");
			valida= false;
	
		}		
		return valida;
	}
	
	
	
}