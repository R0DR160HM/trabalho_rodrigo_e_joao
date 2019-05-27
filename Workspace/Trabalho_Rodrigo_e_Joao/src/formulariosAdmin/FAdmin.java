package formulariosAdmin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import acao.Acao;
import dados.Vetor;
import formulario.AlterarDados;
import formulario.Formulario;
import produtos.Queijo;
import produtos.Vinho;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FAdmin extends JFrame {

	private JPanel contentPane;
	private JButton btnDepartamentos;
	private JTextField txtPesquisa;
	private JButton btnAlterar;
	private JButton btnExcluir;
	private JButton btnCadastrar;
	private JButton btnLogout;
	private JButton btnSai;
	private JButton btnVinho;
	private JButton btnQueijos;
	private JLabel lblDepartamentos;
	private JPanel painelPesquisa;
	private JScrollPane scrollPane;
	private JTable table;

	
	//Criar formulário
	public FAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Painéis
		JPanel painelDepartamentos = new JPanel();
		scrollPane = new JScrollPane();
		painelPesquisa = new JPanel();
		
		
		painelDepartamentos.setBackground(new Color(0, 206, 209));
		painelDepartamentos.setBounds(0, 0, 142, 270);
		painelDepartamentos.setVisible(false);
		painelDepartamentos.setLayout(null);
		contentPane.add(painelDepartamentos);
		
		
		painelPesquisa.setBackground(Color.LIGHT_GRAY);
		painelPesquisa.setBounds(0, 80, 434, 179);
		painelPesquisa.add(scrollPane);
		painelPesquisa.setVisible(false);
		painelPesquisa.setLayout(null);
		contentPane.add(painelPesquisa);
		
		
		//Instanciar objeto da classe Acao
		Acao a = new Acao();
		
		
		
		//Botões
		JButton btnUsuario = new JButton("");
		
		btnCadastrar = new JButton("Cadastrar Produto");
		
		btnExcluir = new JButton("Excluir Produto");
		
		btnDepartamentos = new JButton("");
		
		btnAlterar = new JButton("Alterar Produto");
		
		JButton btnPesquisar = new JButton("");
		
		JButton btnSaiP = new JButton("");
		
		btnSai = new JButton("");
		
		btnVinho = new JButton("Vinhos");
		
		btnQueijos = new JButton("Queijos");
		
		btnLogout = new JButton("");
		
		
		
		
		
		
		
		
		//Design
		btnDepartamentos.setBackground(Color.WHITE);
		btnDepartamentos.setBorderPainted(false);
		btnDepartamentos.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/3riscos.PNG")));
		btnDepartamentos.setBounds(17, 22, 28, 14);
		contentPane.add(btnDepartamentos);
				
		
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrar.setBounds(287, 159, 125, 65);
		contentPane.add(btnCadastrar);
		
		
		btnExcluir.setEnabled(false);
		btnExcluir.setBackground(Color.WHITE);		
		btnExcluir.setBounds(152, 159, 125, 65);
		contentPane.add(btnExcluir);
		
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.setBounds(17, 159, 125, 65);
		contentPane.add(btnAlterar);
				
		
		setVisible(false);
		btnPesquisar.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/pesquisar.PNG")));
		btnPesquisar.setBounds(384, 55, 40, 25);
		contentPane.add(btnPesquisar);
		
			
		btnSaiP.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSaiP.setBorderPainted(false);
		btnSaiP.setBackground(Color.LIGHT_GRAY);
		btnSaiP.setBounds(405, 11, 19, 19);
		painelPesquisa.add(btnSaiP);
		
				
		btnSai.setBackground(new Color(0, 206, 209));
		btnSai.setBorderPainted(false);
		btnSai.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSai.setBounds(113, 11, 19, 19);
		painelDepartamentos.add(btnSai);
		
		
		btnVinho.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		btnVinho.setBackground(new Color(0, 206, 209));
		btnVinho.setBorderPainted(false);
		btnVinho.setBounds(27, 73, 89, 23);
		painelDepartamentos.add(btnVinho);
		
		
		btnQueijos.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		btnQueijos.setBackground(new Color(0, 206, 209));
		btnQueijos.setBorderPainted(false);
		btnQueijos.setBounds(27, 135, 95, 23);
		painelDepartamentos.add(btnQueijos);
		
		btnUsuario.setBackground(Color.WHITE);
		btnUsuario.setBorderPainted(false);		
		btnUsuario.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/ima1 c\u00F3pia.png")));
		btnUsuario.setBounds(390, 10, 34, 34);
		contentPane.add(btnUsuario);
		
			
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/power.jpg")));
		btnLogout.setBounds(350, 13, 34, 26);
		contentPane.add(btnLogout);
		
		
		
		//Campos de texto
		txtPesquisa = new JTextField();	
		txtPesquisa.setBounds(17, 55, 368, 25);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		

		//Tabela e ScrollPane
		table = new JTable();
		scrollPane.setBounds(10, 30, 414, 138);
		scrollPane.setViewportView(table);
		
		
		
		//Rótulos
		lblDepartamentos = new JLabel("Departamentos");
		lblDepartamentos.setFont(new Font("Microsoft YaHei Light", Font.ITALIC, 14));
		lblDepartamentos.setBounds(6, 11, 97, 19);
		painelDepartamentos.add(lblDepartamentos);
		
		JLabel indice = new JLabel("");
		indice.setBounds(229, 11, 48, 14);
		indice.setVisible(false);
		contentPane.add(indice);
		

		
		
		
		//------Ações dos botões e da tabela-------
		
		
		
		//Ação da tabela
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) {
				
				//Obter o índice
				indice.setText(String.valueOf(table.getSelectedRow()));
				
				//Habilitar botões
				painelPesquisa.setVisible(false);
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				
			}
			
		});
		
		
		//Ação do botão de usuário
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AlterarDados altera = new AlterarDados();
				setVisible(false);
				altera.setVisible(true);
			}
		});
				
		//Ação do botão Pesquisar
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
			if((a.validar1(txtPesquisa.getText()) == true) && (a.validar2() == true)) {
				String text = txtPesquisa.getText();
				
				if(a.Analisar(text) == true) {
				painelPesquisa.setVisible(true); 
				btnDepartamentos.setEnabled(false);
				btnDepartamentos.setVisible(false);
				btnCadastrar.setEnabled(false);
				btnUsuario.setEnabled(false);
				btnAlterar.setEnabled(false);
				btnPesquisar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnLogout.setEnabled(false);
				txtPesquisa.setEnabled(false);
				table.setModel(a.atualizar(text));
				
				}else {
					JOptionPane.showMessageDialog(null, "Produto nao existe em estoque");					
				}
			}
			
			txtPesquisa.setText("");
			txtPesquisa.requestFocus();
			}
		});
		
				//Botão sair da tabela de pesquisa
				btnSaiP.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						painelPesquisa.setVisible(false); 
						btnDepartamentos.setEnabled(true);
						btnDepartamentos.setVisible(true);
						btnCadastrar.setEnabled(true);
						btnUsuario.setEnabled(true);						
						btnPesquisar.setEnabled(true);						
						btnLogout.setEnabled(true);
						txtPesquisa.setEnabled(true);
						txtPesquisa.setText("");
						txtPesquisa.requestFocus();
					}
				});
		
				//Ação de cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCadastrar cadastra = new JCadastrar();
				setVisible(false);
				cadastra.setVisible(true);
				
			}
		});
		
				//Ação do botão de logout
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Formulario frame = new Formulario();
			frame.setVisible(true);
			}
		});
		
				//Ação do botão de departamentos
		btnDepartamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			btnDepartamentos.setEnabled(false);
			btnDepartamentos.setVisible(false);
			btnCadastrar.setEnabled(false);
			btnUsuario.setEnabled(false);
			btnAlterar.setEnabled(false);
			btnPesquisar.setEnabled(false);
			btnExcluir.setEnabled(false);
			btnLogout.setEnabled(false);
			txtPesquisa.setEnabled(false);
			painelDepartamentos.setVisible(true);
			}
		});
		
				//Ação do botão SAIR dos Departamentos
		btnSai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			painelDepartamentos.setVisible(false);
			btnDepartamentos.setEnabled(true);
			btnDepartamentos.setVisible(true);
			btnCadastrar.setEnabled(true);
			btnUsuario.setEnabled(true);			
			btnPesquisar.setEnabled(true);			
			txtPesquisa.setEnabled(true);
			btnLogout.setEnabled(true);
			}
		});
		
				//Ação do botão vinho
		btnVinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Vinhos frame = new Vinhos();
			frame.setVisible(true);
			}
		});
		
				//Ação do botao queijo
		btnQueijos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Queijos frame = new Queijos();
			frame.setVisible(true);
			}
		});
		
			//Ação do botão excluir
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = table.getValueAt(Integer.parseInt(indice.getText()), 0).toString();
				int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir o produto"+nome+"?");
				if (excluir == 0) {
					
					a.Excluir(nome);
					
					JOptionPane.showMessageDialog(null, nome+" excluido com sucesso!");
					
				}else {
					JOptionPane.showMessageDialog(null, "Exclusão cancelada");
				}
				
				btnAlterar.setEnabled(false);
				btnExcluir.setEnabled(false);
				btnCadastrar.setEnabled(true);
				btnDepartamentos.setEnabled(true);
				btnDepartamentos.setVisible(true);
				btnCadastrar.setEnabled(true);
				btnUsuario.setEnabled(true);
				btnAlterar.setEnabled(true);
				btnPesquisar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnLogout.setEnabled(true);
				txtPesquisa.setEnabled(true);
				
			}
		});
		
				//Botão de alterar
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int index = Integer.parseInt(indice.getText());
				String nome = table.getValueAt(index, 0).toString();
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja alterar as informações de "+nome+"?");
				if (confirm == 0) {
					
					if (a.AnalisarVinho(nome) == true) {
						
						
					String novonome = JOptionPane.showInputDialog("Insira o novo nome\nAtaul "+nome+"\nDeixe o campo em branco para manter o padrão atual");
					if (novonome.equals("")) {
						novonome = nome;
					}
					
					String marca = JOptionPane.showInputDialog("Insira a nova marca\nAtual: "+Vetor.vetorVinho.get(index).getMarca()+"\nDeixe o campo em brancom para manter o padrão atual");
					if (marca.equals("")) {
						marca = Vetor.vetorVinho.get(index).getMarca();
					}
					
					String origem = JOptionPane.showInputDialog("Insira o novo país de origem\nAtual: "+Vetor.vetorVinho.get(index).getPais()+"\nDeixe o campo em brancom para manter o padrão atual");
					if (origem.equals("")) {
						origem = Vetor.vetorVinho.get(index).getMarca();
					}
						
					String valor = JOptionPane.showInputDialog("Insira o novo valor\nAtual: "+Vetor.vetorVinho.get(index).getValor()+"\nDeixe o campo em brancom para manter o padrão atual");
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
					
					Vinho v = new Vinho(novonome, origem, marca, Double.parseDouble(valor), novacor, novotipo, "Vinho");
					Vetor.vetorVinho.set(index, v);
					
						
					}
					
					if (a.AnalisarQueijo(nome) == true) {
						
						
						
						String novonome = JOptionPane.showInputDialog("Insira o novo nome\nAtaul "+nome+"\nDeixe o campo em branco para manter o padrão atual");
						if (novonome.equals("")) {
							novonome = nome;
						}
						
						String marca = JOptionPane.showInputDialog("Insira a nova marca\nAtual: "+Vetor.vetorQueijo.get(index).getMarca()+"\nDeixe o campo em brancom para manter o padrão atual");
						if (marca.equals("")) {
							marca = Vetor.vetorQueijo.get(index).getMarca();
						}
						
						String origem = JOptionPane.showInputDialog("Insira o novo país de origem\nAtual: "+Vetor.vetorQueijo.get(index).getPais()+"\nDeixe o campo em brancom para manter o padrão atual");
						if (origem.equals("")) {
							origem = Vetor.vetorQueijo.get(index).getMarca();
						}
							
						String valor = JOptionPane.showInputDialog("Insira o novo valor\nAtual: "+Vetor.vetorQueijo.get(index).getValor()+"\nDeixe o campo em brancom para manter o padrão atual");
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
						
						Queijo q = new Queijo(novonome, origem, marca, Double.parseDouble(valor), novoanimal, novatextura, "Queijo");
						Vetor.vetorQueijo.set(index, q);	
							
						
						
					}
					
					JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso! ");
					
				}else {
					JOptionPane.showMessageDialog(null, "Alteração cancelada!");
				}
				
				btnExcluir.setEnabled(false);
				btnAlterar.setEnabled(false);
				btnCadastrar.setEnabled(true);
				btnDepartamentos.setEnabled(true);
				btnDepartamentos.setVisible(true);
				btnCadastrar.setEnabled(true);
				btnUsuario.setEnabled(true);
				btnAlterar.setEnabled(true);
				btnPesquisar.setEnabled(true);
				btnExcluir.setEnabled(true);
				btnLogout.setEnabled(true);
				txtPesquisa.setEnabled(true);
				
			}
		});
	}
}
