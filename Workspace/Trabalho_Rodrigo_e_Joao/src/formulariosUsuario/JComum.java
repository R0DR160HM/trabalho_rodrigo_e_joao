package formulariosUsuario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Vetor;
import formulario.AlterarDados;
import formulario.Formulario;
import formulariosAdmin.Queijos;
import formulariosAdmin.Vinhos;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JComum extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTable table;
	private JTable table_1;

	public JComum() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 455, 207);
		panel.setBackground(Color.WHITE);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.add(panel);
		
		//Criar botoes
		JButton btnUsuario = new JButton("");
		btnUsuario.setBounds(411, 11, 34, 34);
		
		JButton btnLogout = new JButton("");
		btnLogout.setBounds(328, 17, 34, 26);
		
		JButton btnCarrinho = new JButton("");
		
		btnCarrinho.setBounds(369, 16, 34, 26);
		JButton btnDepartamentos = new JButton("");
		btnDepartamentos.setBounds(10, 17, 34, 26);
		
		JButton btnPesquisar = new JButton("");
		btnPesquisar.setBounds(404, 64, 40, 25);
		
		JPanel painelDepartamentos = new JPanel();
		painelDepartamentos.setBounds(0, 0, 146, 207);
		painelDepartamentos.setBackground(new Color(0, 206, 209));
		painelDepartamentos.setVisible(false);
		panel.setLayout(null);
		
		JPanel painelCarrinho = new JPanel();
		painelCarrinho.setBackground(new Color(215, 255, 15));
		painelCarrinho.setBounds(242, 0, 213, 193);
		painelCarrinho.setVisible(false);
		
		JPanel painelPesquisa = new JPanel();
		painelPesquisa.setBackground(Color.LIGHT_GRAY);
		painelPesquisa.setBounds(37, 89, 366, 104);
		panel.add(painelPesquisa);
		painelPesquisa.setVisible(false);
		painelPesquisa.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 346, 69);
		painelPesquisa.add(scrollPane);
		
		table = new JTable();
		
		scrollPane.setViewportView(table);
		
		JButton btnSaiP = new JButton("");
		
		btnSaiP.setIcon(new ImageIcon(JComum.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSaiP.setBorderPainted(false);
		btnSaiP.setBackground(Color.LIGHT_GRAY);
		btnSaiP.setBounds(338, 4, 19, 19);
		painelPesquisa.add(btnSaiP);
		panel.add(painelCarrinho);
		painelCarrinho.setLayout(null);
		
		JButton btnSai2 = new JButton("");
		
		btnSai2.setIcon(new ImageIcon(JComum.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSai2.setBorderPainted(false);
		btnSai2.setBackground(new Color(215, 255, 15));
		btnSai2.setBounds(10, 11, 19, 19);
		painelCarrinho.add(btnSai2);
		
		JLabel lblCarrinhoDeCompras = new JLabel("Carrinho de Compras");
		lblCarrinhoDeCompras.setFont(new Font("Microsoft YaHei Light", Font.ITALIC, 14));
		lblCarrinhoDeCompras.setBounds(39, 11, 154, 19);
		
		painelCarrinho.add(lblCarrinhoDeCompras);
		
		JScrollPane tableCarrinho = new JScrollPane();
		tableCarrinho.setBounds(10, 41, 193, 141);
		painelCarrinho.add(tableCarrinho);
		
		table_1 = new JTable();
		tableCarrinho.setViewportView(table_1);
		
		
		panel.add(painelDepartamentos);
		painelDepartamentos.setLayout(null);
		
		JButton btnSai = new JButton("");
		
		btnSai.setIcon(new ImageIcon(JComum.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSai.setBorderPainted(false);
		btnSai.setBackground(new Color(0, 206, 209));
		btnSai.setBounds(117, 11, 19, 19);
		painelDepartamentos.add(btnSai);
		
		JLabel label = new JLabel("Departamentos");
		label.setFont(new Font("Microsoft YaHei Light", Font.ITALIC, 14));
		label.setBounds(10, 11, 97, 19);
		painelDepartamentos.add(label);
		
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
		
		
		
		
		btnUsuario.setIcon(new ImageIcon(JComum.class.getResource("/imagens/ima1 c\u00F3pia.png")));
		btnUsuario.setBorderPainted(false);
		btnUsuario.setBackground(Color.WHITE);
		panel.add(btnUsuario);
		
		
		btnLogout.setIcon(new ImageIcon(JComum.class.getResource("/imagens/power.jpg")));
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(Color.WHITE);
		panel.add(btnLogout);
		
		
		btnCarrinho.setIcon(new ImageIcon(JComum.class.getResource("/imagens/carr c\u00F3pia.png")));
		btnCarrinho.setBorderPainted(false);
		btnCarrinho.setBackground(Color.WHITE);
		panel.add(btnCarrinho);
		
		
		btnDepartamentos.setIcon(new ImageIcon(JComum.class.getResource("/imagens/3riscos.PNG")));
		btnDepartamentos.setBorderPainted(false);
		btnDepartamentos.setBackground(Color.WHITE);
		panel.add(btnDepartamentos);
		
		
		btnPesquisar.setIcon(new ImageIcon(JComum.class.getResource("/imagens/pesquisar.PNG")));
		panel.add(btnPesquisar);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setBounds(37, 64, 368, 25);
		txtPesquisa.setColumns(10);
		panel.add(txtPesquisa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(445, 0, -83, 235);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(445, 0, -146, 172);
		panel.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(435, 100, -94, 161);
		panel.add(panel_3);
		
		Acao a = new Acao();
		//Ações do botao de usuario
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			AlterarDados altera = new AlterarDados();
			setVisible(false);
			altera.setVisible(true);
			
			}
		});
		
		//Ação do botao Logout
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
		
		//Ação do botao SAIR dos departamentos
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
		
		//Ação do botao Queijo
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
		
		
		//Ação do botao pesquisar
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
		
		//Botao sair da tabela de pesquisa
		btnSaiP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				painelPesquisa.setVisible(false); 
				btnDepartamentos.setEnabled(true);
				btnDepartamentos.setVisible(true);				
				btnUsuario.setEnabled(true);				
				btnPesquisar.setEnabled(true);				
				btnLogout.setEnabled(true);
				txtPesquisa.setEnabled(true);
				txtPesquisa.setText("");
				txtPesquisa.requestFocus();
			}
		});
		
		//Ação do botao carrinho
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
				
			}
		});
		
		//Ação do botao SAIR CARRINHO
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
