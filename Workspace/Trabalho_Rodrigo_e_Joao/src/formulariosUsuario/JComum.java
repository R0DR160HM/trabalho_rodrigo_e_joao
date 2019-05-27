package formulariosUsuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Carrinho;
import formulario.AlterarDados;
import formulario.Formulario;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class JComum extends JFrame {
	
	public static double valor=0;
	
	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTable table;
	private JTable tableCarrinho;

	//Criar tabela
	public JComum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Instanciar objeto da classe Acao
		Acao a = new Acao();
		
		
		
		//Painéis
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 455, 207);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(null);
		contentPane.add(panel);
		
		JPanel painelDepartamentos = new JPanel();
		painelDepartamentos.setBounds(0, 0, 146, 207);
		painelDepartamentos.setBackground(new Color(0, 206, 209));
		painelDepartamentos.setVisible(false);
		painelDepartamentos.setLayout(null);
		panel.add(painelDepartamentos);
		
		JPanel painelCarrinho = new JPanel();
		painelCarrinho.setBackground(new Color(215, 255, 15));
		painelCarrinho.setBounds(172, 0, 283, 193);
		painelCarrinho.setVisible(false);
		painelCarrinho.setLayout(null);
		panel.add(painelCarrinho);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(445, 0, -83, 235);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(445, 0, -146, 172);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(435, 100, -94, 161);
		panel.add(panel_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(10, 41, 263, 115);
		painelCarrinho.add(panel_4);
		panel_4.setLayout(null);
		
		JPanel painelPesquisa = new JPanel();
		painelPesquisa.setBackground(Color.LIGHT_GRAY);
		painelPesquisa.setBounds(10, 89, 435, 104);
		painelPesquisa.setVisible(false);
		painelPesquisa.setLayout(null);
		panel.add(painelPesquisa);
		
		
		//Botões
		JButton btnUsuario = new JButton("");
		btnUsuario.setBounds(411, 11, 34, 34);
		btnUsuario.setIcon(new ImageIcon(JComum.class.getResource("/imagens/ima1 c\u00F3pia.png")));
		btnUsuario.setBorderPainted(false);
		btnUsuario.setBackground(Color.WHITE);
		panel.add(btnUsuario);
		
		JButton btnLogout = new JButton("");
		btnLogout.setBounds(328, 17, 34, 26);
		btnLogout.setIcon(new ImageIcon(JComum.class.getResource("/imagens/power.jpg")));
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(Color.WHITE);
		panel.add(btnLogout);
		
		JButton btnCarrinho = new JButton("");	
		btnCarrinho.setBounds(369, 16, 34, 26);
		btnCarrinho.setIcon(new ImageIcon(JComum.class.getResource("/imagens/carr c\u00F3pia.png")));
		btnCarrinho.setBorderPainted(false);
		btnCarrinho.setBackground(Color.WHITE);
		panel.add(btnCarrinho);
		
		JButton btnDepartamentos = new JButton("");
		btnDepartamentos.setBounds(10, 17, 34, 26);	
		btnDepartamentos.setIcon(new ImageIcon(JComum.class.getResource("/imagens/3riscos.PNG")));
		btnDepartamentos.setBorderPainted(false);
		btnDepartamentos.setBackground(Color.WHITE);
		panel.add(btnDepartamentos);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setBounds(404, 64, 40, 25);
		btnPesquisar.setIcon(new ImageIcon(JComum.class.getResource("/imagens/pesquisar.PNG")));
		panel.add(btnPesquisar);
		
		JButton btnSai2 = new JButton("");		
		btnSai2.setIcon(new ImageIcon(JComum.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSai2.setBorderPainted(false);
		btnSai2.setBackground(new Color(215, 255, 15));
		btnSai2.setBounds(10, 11, 19, 19);
		painelCarrinho.add(btnSai2);
		
		JButton btnSai = new JButton("");	
		btnSai.setIcon(new ImageIcon(JComum.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSai.setBorderPainted(false);
		btnSai.setBackground(new Color(0, 206, 209));
		btnSai.setBounds(117, 11, 19, 19);
		painelDepartamentos.add(btnSai);
		
		JButton btnVinho = new JButton("Vinhos");
		btnVinho.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		btnVinho.setBorderPainted(false);
		btnVinho.setBackground(new Color(0, 206, 209));
		btnVinho.setBounds(27, 71, 89, 23);
		painelDepartamentos.add(btnVinho);
		
		JButton btnQueijos = new JButton("Queijos");		
		btnQueijos.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		btnQueijos.setBorderPainted(false);
		btnQueijos.setBackground(new Color(0, 206, 209));
		btnQueijos.setBounds(27, 139, 95, 23);
		painelDepartamentos.add(btnQueijos);
		
		JButton btnSaiP = new JButton("");
		btnSaiP.setIcon(new ImageIcon(JComum.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSaiP.setBorderPainted(false);
		btnSaiP.setBackground(Color.LIGHT_GRAY);
		btnSaiP.setBounds(408, 4, 19, 19);
		painelPesquisa.add(btnSaiP);
		
		
		
		//Rótulos
		JLabel lblCarrinhoDeCompras = new JLabel("Carrinho de Compras");
		lblCarrinhoDeCompras.setFont(new Font("Microsoft YaHei Light", Font.ITALIC, 14));
		lblCarrinhoDeCompras.setBounds(31, 11, 140, 19);		
		painelCarrinho.add(lblCarrinhoDeCompras);
		
		JLabel lblTotal = new JLabel("");
		lblTotal.setBounds(215, 1, 48, 14);
		panel_4.add(lblTotal);
		
		JLabel lblValorT = new JLabel(); 
		lblValorT.setText("Total de R$ "+valor);
		lblValorT.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblValorT.setHorizontalAlignment(SwingConstants.CENTER);
		lblValorT.setBounds(10, 167, 263, 19);
		painelCarrinho.add(lblValorT);
		
		JLabel label = new JLabel("Departamentos");
		label.setFont(new Font("Microsoft YaHei Light", Font.ITALIC, 14));
		label.setBounds(10, 11, 97, 19);
		painelDepartamentos.add(label);
		
		JLabel indice = new JLabel("");
		indice.setBounds(139, 17, 48, 14);
		panel.add(indice);
		indice.setVisible(false);
		

		
		//Tabela e ScrollPane
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 263, 115);
		panel_4.add(scrollPane_1);
		
		tableCarrinho = new JTable();
		scrollPane_1.setViewportView(tableCarrinho);
		
		
		
		//Campo de texto
		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(37, 64, 368, 25);
		txtPesquisa.setColumns(10);
		panel.add(txtPesquisa);
		

		
		

		//Tabelas e ScrollPanes
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 415, 69);
		painelPesquisa.add(scrollPane);
		scrollPane.setViewportView(table);
		

		
		
		//Ação da tabela para comprar
		table.addMouseListener(new MouseAdapter() {
					
			public void mouseReleased(MouseEvent e) {
						
			//Obter o índice
			indice.setText(String.valueOf(table.getSelectedRow()));
						
			//Habilitar botões
			painelPesquisa.setVisible(false);
			
			//Pegar o nome
			String nome = table.getValueAt(Integer.parseInt(indice.getText()), 0).toString();
			Double valor1 = ((Double.parseDouble(table.getValueAt(Integer.parseInt(indice.getText()), 3).toString())));
			
			int comprar = JOptionPane.showConfirmDialog(null, "Deseja comprar o produto "+nome+" no valor de R$"+valor1+" ?");
			
			switch(comprar) {
			
			case 0:
				int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser comprada do produto "+nome));
				
				
				JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho");
				btnDepartamentos.setEnabled(true);
				btnDepartamentos.setVisible(true);				
				btnUsuario.setEnabled(true);				
				btnPesquisar.setEnabled(true);				
				btnLogout.setEnabled(true);
				btnCarrinho.setEnabled(true);
				txtPesquisa.setEnabled(true);
				txtPesquisa.setText("");
				txtPesquisa.requestFocus();
				
				Carrinho b = new Carrinho();
				b.setNome(nome);
				b.setQtd(qtd);
				b.setValorUn(Double.parseDouble(table.getValueAt(Integer.parseInt(indice.getText()), 3).toString()));
				
				if(table.getValueAt(Integer.parseInt(indice.getText()), 6).toString().equals("Vinho")) {
					b.setProduto("Vinho");
				}else {
					b.setProduto("Queijo");
				}
				
				
				double qtdF = valor1* qtd;				
				
				valor = a.total(qtdF);
				lblValorT.setText("Total de R$"+valor);
				
				
				
				a.adicionarCarrinho(b);		
			break;
			
			
			case 1:
				JOptionPane.showMessageDialog(null, "Compra cancelada");
				btnDepartamentos.setEnabled(true);
				btnDepartamentos.setVisible(true);				
				btnUsuario.setEnabled(true);				
				btnPesquisar.setEnabled(true);				
				btnLogout.setEnabled(true);
				btnCarrinho.setEnabled(true);
				txtPesquisa.setEnabled(true);
				txtPesquisa.setText("");
				txtPesquisa.requestFocus();
				break;	
			}
						
		}
					
	});
		
		
				//Botão para sair da tabela de pesquisa
		btnSaiP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelPesquisa.setVisible(false); 
				btnDepartamentos.setEnabled(true);
				btnDepartamentos.setVisible(true);				
				btnUsuario.setEnabled(true);				
				btnPesquisar.setEnabled(true);				
				btnLogout.setEnabled(true);
				btnCarrinho.setEnabled(true);
				txtPesquisa.setEnabled(true);
				txtPesquisa.setText("");
				txtPesquisa.requestFocus();
			
			}
		});
		

		
		//Ações dos botões
				//Ação do botão de usuário
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AlterarDados altera = new AlterarDados();
			setVisible(false);
			altera.setVisible(true);
			
			}
		});
		
				//Ação do botão Logout
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Formulario frame = new Formulario();
				frame.setVisible(true);
			
			}
		});
		
				//Ação do botão departamentos
		btnDepartamentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDepartamentos.setEnabled(false);
				btnDepartamentos.setVisible(false);				
				btnUsuario.setEnabled(false);				
				btnPesquisar.setEnabled(false);
				btnLogout.setEnabled(false);
				txtPesquisa.setEnabled(false);
				btnCarrinho.setEnabled(false);
				painelDepartamentos.setVisible(true);
				
			
			}
		});
		
				//Ação do botão SAIR dos departamentos
		btnSai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelDepartamentos.setVisible(false);
				btnDepartamentos.setEnabled(true);
				btnDepartamentos.setVisible(true);			
				btnUsuario.setEnabled(true);			
				btnPesquisar.setEnabled(true);			
				txtPesquisa.setEnabled(true);
				btnCarrinho.setEnabled(true);
				btnLogout.setEnabled(true);
			}
		});
		
				//Ação do botão Queijo
		btnQueijos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Queijos2 frame = new Queijos2();
				frame.setVisible(true);
			}
		});
		
				//Ação do botão do vinho
		btnVinho.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		setVisible(false);
		Vinhos2 frame = new Vinhos2();
		frame.setVisible(true);
			}
		});
		
				//Ação do botão pesquisar
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				if((a.validar1(txtPesquisa.getText()) == true) && (a.validar2() == true)) {
					String text = txtPesquisa.getText();
					
					if(a.Analisar(text) == true) {
					painelPesquisa.setVisible(true); 
					btnDepartamentos.setEnabled(false);
					btnDepartamentos.setVisible(false);					
					btnUsuario.setEnabled(false);					
					btnPesquisar.setEnabled(false);					
					btnLogout.setEnabled(false);
					btnCarrinho.setEnabled(false);
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
		
				//Ação do botão carrinho
		btnCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnDepartamentos.setEnabled(false);				
				btnUsuario.setEnabled(false);				
				btnPesquisar.setEnabled(false);
				btnLogout.setEnabled(false);
				txtPesquisa.setEnabled(false);
				btnCarrinho.setEnabled(false);
				btnCarrinho.setVisible(false);
				painelCarrinho.setVisible(true);
				
				//Atualizar tabela
				tableCarrinho.setModel(a.carrinho());
				lblValorT.setText("Total de R$"+valor);
			}
		});
		
				//Ação do botão SAIR CARRINHO
		btnSai2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelCarrinho.setVisible(false);
				btnDepartamentos.setEnabled(true);						
				btnUsuario.setEnabled(true);			
				btnPesquisar.setEnabled(true);			
				txtPesquisa.setEnabled(true);
				btnCarrinho.setEnabled(true);
				btnCarrinho.setVisible(true);
				btnLogout.setEnabled(true);
					}
				});
	}
}
