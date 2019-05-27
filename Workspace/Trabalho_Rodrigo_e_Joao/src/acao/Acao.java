package acao;

import java.time.LocalDateTime;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.table.DefaultTableModel;

import beans.Atributos;
import beans.Carrinho;
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
	
	
	
	
	//Metodo para verificar o cadastro Queijo
	public boolean verificarCadastroQueijo(String a, String b) {
		boolean valida = true;
		
		for(int i=0; i < Vetor.vetorQueijo.size(); i++) {
			
			String nome2 = Vetor.vetorQueijo.get(i).getNome();
			String tipoProduto = Vetor.vetorQueijo.get(i).getTipoProduto();
			
			if(a.equals(nome2) && (b.equals(tipoProduto))) {
				valida = false;
			}
		}
		
		return valida;
	}
	
	
	
	
	//Metodo para verificar o cadastro Vinho
	public boolean verificarCadastroVinho(String a, String b) {
		boolean valida = true;
		
		for(int i=0; i < Vetor.vetorVinho.size(); i++) {
			
			String nome2 = Vetor.vetorVinho.get(i).getNome();
			String tipoProduto = Vetor.vetorVinho.get(i).getTipoProduto();
			
			if(a.equals(nome2) && (b.equals(tipoProduto))) {
				valida = false;
			}
		}
		
		return valida;
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
			dadosTabela.addRow(new Object[] {Vetor.vetorVinho.get(i).getNome(), Vetor.vetorVinho.get(i).getMarca(), Vetor.vetorVinho.get(i).getPais(), Vetor.vetorVinho.get(i).getValor(), Vetor.vetorVinho.get(i).getCor(), Vetor.vetorVinho.get(i).getTipo(), Vetor.vetorVinho.get(i).getTipoProduto()});
			}
			
		}
			for(int i2=0; i2<Vetor.vetorQueijo.size(); i2++) {
			if(Vetor.vetorQueijo.get(i2).getNome().startsWith(pesquisa)) {
				dadosTabela.addRow(new Object[] {Vetor.vetorQueijo.get(i2).getNome(), Vetor.vetorQueijo.get(i2).getMarca(), Vetor.vetorQueijo.get(i2).getPais(), Vetor.vetorQueijo.get(i2).getValor(), Vetor.vetorQueijo.get(i2).getAnimal(), Vetor.vetorQueijo.get(i2).getTextura(), Vetor.vetorQueijo.get(i2).getTipoProduto()});
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
	
	
	
	
	//Exluir queijo
	public void ExcluirQueijo(String nome) {
		for (int i=0; i<Vetor.vetorQueijo.size(); i++) {						
			if (Vetor.vetorQueijo.get(i).getNome().equals(nome)) {
				Vetor.vetorQueijo.remove(i);
			}						
		}
		
		
	}
	
	
	
	
	//Excluir vinho
	public void ExcluirVinho(String nome) {
		
		for (int i=0; i<Vetor.vetorVinho.size(); i++) {
			if (Vetor.vetorVinho.get(i).getNome().equals(nome)) {
				Vetor.vetorVinho.remove(i);
			}	
			
		}
		
	}
	
	
	
	
	//Alterar queijo
	public void alterarQjo(String nome, int index) {
		
		String novonome = JOptionPane.showInputDialog("Insira o novo nome\nAtual "+nome+"\nDeixe o campo em branco para manter o padrão atual");
		if (novonome.equals("")) {
			novonome = nome;
		}
		
		String marca = JOptionPane.showInputDialog("Insira a nova marca\nAtual: "+Vetor.vetorQueijo.get(index).getMarca()+"\nDeixe o campo em branco para manter o padrão atual");
		if (marca.equals("")) {
			marca = Vetor.vetorQueijo.get(index).getMarca();
		}
		
		String origem = JOptionPane.showInputDialog("Insira o novo país de origem\nAtual: "+Vetor.vetorQueijo.get(index).getPais()+"\nDeixe o campo em branco para manter o padrão atual");
		if (origem.equals("")) {
			origem = Vetor.vetorQueijo.get(index).getMarca();
		}
			
		String valor = JOptionPane.showInputDialog("Insira o novo valor\nAtual: "+Vetor.vetorQueijo.get(index).getValor()+"\nDeixe o campo em branco para manter o padrão atual");
		if (valor.equals("")) {
			valor = ""+Vetor.vetorQueijo.get(index).getValor();
		}
		
		Object[] animal = {"Vaca", "Ovelha", "Cabra", "Búfala"};
		String novoanimal = "";
		int animalint = JOptionPane.showOptionDialog(null, "Escolha o novo animal de origem\nAtual: "+Vetor.vetorQueijo.get(index).getAnimal(), "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, animal, 0);
		if (animalint == 0) {
			novoanimal = "Vaca";
		}else if (animalint == 1) {
			novoanimal = "Ovelha";
		}else if (animalint == 2) {
			novoanimal = "Cabra";
		}else if (animalint == 3) {
			novoanimal = "Búfala";
		}
		
		Object[] textura = {"Macio", "Semimacio", "Semifirme", "Firme"};
		String novatextura = "";
		int textint = JOptionPane.showOptionDialog(null, "Escolha a nova textura\nAtual: "+Vetor.vetorQueijo.get(index).getTextura(), "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, textura, 0);
		if (textint == 0) {
			novatextura = "Macio";
		}else if (textint == 1) {
			novatextura = "Semimacio";
		}else if (textint == 2) {
			novatextura = "Semifirme";
		}else if (textint == 3) {
			novatextura = "Firme";
		}
		
		try {
		Queijo q = new Queijo(novonome, origem, marca, Double.parseDouble(valor), novoanimal, novatextura, "Queijo");
		Vetor.vetorQueijo.set(index, q);	
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Insira um valor válido.");
		}	
		
		
	}
	
	
	
	
	//Alterar vinho
	public void alterarVin(String nome, int index) {
		
		String novonome = JOptionPane.showInputDialog("Insira o novo nome\nAtual "+nome+"\nDeixe o campo em branco para manter o padrão atual");
		if (novonome.equals("")) {
			novonome = nome;
		}
		
		String marca = JOptionPane.showInputDialog("Insira a nova marca\nAtual: "+Vetor.vetorVinho.get(index).getMarca()+"\nDeixe o campo em branco para manter o padrão atual");
		if (marca.equals("")) {
			marca = Vetor.vetorVinho.get(index).getMarca();
		}
		
		String origem = JOptionPane.showInputDialog("Insira o novo país de origem\nAtual: "+Vetor.vetorVinho.get(index).getPais()+"\nDeixe o campo em branco para manter o padrão atual");
		if (origem.equals("")) {
			origem = Vetor.vetorVinho.get(index).getMarca();
		}
		
		
		String valor = JOptionPane.showInputDialog("Insira o novo valor\nAtual: "+Vetor.vetorVinho.get(index).getValor()+"\nDeixe o campo em branco para manter o padrão atual");
		if (valor.equals("")) {
			valor = ""+Vetor.vetorVinho.get(index).getValor();
		}
		
		Object[] tipo = {"Seco", "Suave"};
		String novotipo = "";
		int tipoint = JOptionPane.showOptionDialog(null, "Escolha o novo tipo\nAtual: "+Vetor.vetorVinho.get(index).getTipo(), "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, tipo, 0);
		if (tipoint == 0) {
			novotipo = "Seco";
		}else if (tipoint == 1) {
			novotipo = "Suave";
		}
		
		Object[] cor = {"Branco", "Tinto"};
		String novacor = "";
		int corint = JOptionPane.showOptionDialog(null, "Escolha a nova cor\nAtual: "+Vetor.vetorVinho.get(index).getCor(), "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, cor, 0);
		if (corint == 0) {
			novacor = "Branco";
		}else if (corint == 1) {
			novacor = "Tinto";
		}
		
		try {
		Vinho v = new Vinho(novonome, origem, marca, Double.parseDouble(valor), novacor, novotipo, "Vinho");
		Vetor.vetorVinho.set(index, v);
		}catch (Exception erro) {
			JOptionPane.showMessageDialog(null, "Insira um valor válido.");
		}
	}
	
	
	
	//Adicionar ao carrinho
		public void adicionarCarrinho(Carrinho at) {
			
			Vetor.vetorCarrinho.add(at);
			
		}
		
		
		
	//Adicionar ao carrinho
		public DefaultTableModel carrinho () {
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Nome");
			dadosTabela.addColumn("Qtd");
			dadosTabela.addColumn("Valor Un");
			dadosTabela.addColumn("Produto");
			
			for(int i=0; i<Vetor.vetorCarrinho.size(); i++) {
				dadosTabela.addRow(new Object[] {Vetor.vetorCarrinho.get(i).getNome(), Vetor.vetorCarrinho.get(i).getQtd(), Vetor.vetorCarrinho.get(i).getValorUn(), Vetor.vetorCarrinho.get(i).getProduto()});
			}
			
			return dadosTabela;
		}

		  private static double d =0;
		
		  //Metodo para exibir o valor total
		public double total(Double qtd) {
			
			d+=qtd;
			
			return d;
		}
		
}
