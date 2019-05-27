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
	public void cadastrarVinho(String nome, String pais, String marca, double valor, String cor, String tipo, String TipoProduto) {
		
		try {
			
		Vinho v = new Vinho(nome, pais, marca, valor, cor, tipo, TipoProduto);
		Vetor.vetorVinho.add(v);
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
		
		}catch (Exception erro) {
			
			JOptionPane.showMessageDialog(null, "Insira um valor válido");
		
		}
		
	}
	
	
	
	
	//Cadastrar queijos
	public void cadastrarQueijo(String nome, String pais, String marca, double valor, String animal, String textura, String tipoProduto) {
		
		try {
			
		Queijo q = new Queijo(nome, pais, marca, valor, animal, textura, tipoProduto);
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
		dadosTabela.addColumn("Cor/Animal");
		dadosTabela.addColumn("Tipo/Textura");
		dadosTabela.addColumn("Produto");
		
		for(int i=0; i<Vetor.vetorVinho.size(); i++) {
			
			
			
			if(Vetor.vetorVinho.get(i).getNome().startsWith(pesquisa)) {
			dadosTabela.addRow(new Object[] {Vetor.vetorVinho.get(i).getNome(), Vetor.vetorVinho.get(i).getMarca(), Vetor.vetorVinho.get(i).getPais(), Vetor.vetorVinho.get(i).getValor(), Vetor.vetorVinho.get(i).getCor(), Vetor.vetorVinho.get(i).getTipo(), Vetor.vetorVinho.get(i).getTProduto()});
			}
			
		}
			for(int i2=0; i2<Vetor.vetorQueijo.size(); i2++) {
			if(Vetor.vetorQueijo.get(i2).getNome().startsWith(pesquisa)) {
				dadosTabela.addRow(new Object[] {Vetor.vetorQueijo.get(i2).getNome(), Vetor.vetorQueijo.get(i2).getMarca(), Vetor.vetorQueijo.get(i2).getPais(), Vetor.vetorQueijo.get(i2).getValor(), Vetor.vetorQueijo.get(i2).getAnimal(), Vetor.vetorQueijo.get(i2).getTextura(), Vetor.vetorQueijo.get(i2).getTProduto()});
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
	
	//Tabela de pesquisa do departamento de vinho
	public DefaultTableModel tabelaVinho(String pesquisa) {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Marca");
		dadosTabela.addColumn("Origem");
		dadosTabela.addColumn("Valor");
		dadosTabela.addColumn("Tipo");
		dadosTabela.addColumn("Cor");
		
		for(int i=0; i<Vetor.vetorVinho.size(); i++) {
			
			if(Vetor.vetorVinho.get(i).getNome().startsWith(pesquisa)) {
				dadosTabela.addRow(new Object[] {Vetor.vetorVinho.get(i).getNome(), Vetor.vetorVinho.get(i).getMarca(), Vetor.vetorVinho.get(i).getPais(), Vetor.vetorVinho.get(i).getValor(), Vetor.vetorVinho.get(i).getCor(), Vetor.vetorVinho.get(i).getTipo()});
			}
			
		}
		return dadosTabela;
	}
	
	//Analisar o vinho
	public boolean AnalisarVinho(String pesquisa) {
		
		boolean valida = false;
		
		for(int i=0; i<Vetor.vetorVinho.size(); i++) {
		
			if(Vetor.vetorVinho.get(i).getNome().startsWith(pesquisa)) {
				valida = true;
			}
			
		}	
		return valida;
	}
	
	
	//Tabela de pesquisa do departamento de queijo
		public DefaultTableModel tabelaQueijo(String pesquisa) {
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Nome");
			dadosTabela.addColumn("Marca");
			dadosTabela.addColumn("Origem");
			dadosTabela.addColumn("Valor");
			dadosTabela.addColumn("Animal");
			dadosTabela.addColumn("Textura");
			
			for(int i=0; i<Vetor.vetorQueijo.size(); i++) {
				
				if(Vetor.vetorQueijo.get(i).getNome().startsWith(pesquisa)) {
					dadosTabela.addRow(new Object[] {Vetor.vetorQueijo.get(i).getNome(), Vetor.vetorQueijo.get(i).getMarca(), Vetor.vetorQueijo.get(i).getPais(), Vetor.vetorQueijo.get(i).getValor(), Vetor.vetorQueijo.get(i).getAnimal(), Vetor.vetorQueijo.get(i).getTextura()});
				}
				
			}
			return dadosTabela;
		}
	//Analisar tabela Queijo
	public boolean AnalisarQueijo(String pesquisa) {
			
			boolean valida = false;
			
			for(int i=0; i<Vetor.vetorQueijo.size(); i++) {
			
				if(Vetor.vetorQueijo.get(i).getNome().startsWith(pesquisa)) {
					valida = true;
				}
				
			}	
			return valida;
		}
	
	//Exluir
	public void Excluir(String nome) {
		for (int i=0; i<Vetor.vetorQueijo.size(); i++) {						
			if (Vetor.vetorQueijo.get(i).getNome().equals(nome)) {
				Vetor.vetorQueijo.remove(i);
			}						
		}
		
		for (int i=0; i<Vetor.vetorVinho.size(); i++) {
			if (Vetor.vetorVinho.get(i).getNome().equals(nome)) {
				Vetor.vetorVinho.remove(i);
			}	
			
		}
	}
}
