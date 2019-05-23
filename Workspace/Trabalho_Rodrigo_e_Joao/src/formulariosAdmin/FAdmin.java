package formulariosAdmin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.security.auth.callback.TextOutputCallback;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ChangeListener;

import acao.Acao;
import dados.Vetor;
import formulario.AlterarDados;
import formulario.Formulario;

import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
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

	public FAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Criar botoes
		JButton btnUsuario = new JButton("");
		
		btnDepartamentos = new JButton("");
		
		txtPesquisa = new JTextField();		
		btnCadastrar = new JButton("Cadastrar Produto");
		btnExcluir = new JButton("Excluir Produto");
		btnAlterar = new JButton("Alterar Produto");
		
		
		JButton btnPesquisar = new JButton("");
		setVisible(false);
		
		JPanel painelDepartamentos = new JPanel();
		painelDepartamentos.setBackground(new Color(0, 206, 209));
		painelDepartamentos.setBounds(0, 0, 142, 270);
		painelDepartamentos.setVisible(false);
		
		painelPesquisa = new JPanel();
		painelPesquisa.setBackground(Color.LIGHT_GRAY);
		painelPesquisa.setBounds(17, 80, 382, 179);
		contentPane.add(painelPesquisa);
		painelPesquisa.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 30, 362, 138);
		painelPesquisa.add(scrollPane);
		painelPesquisa.setVisible(false);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnSaiP = new JButton("");
		
		btnSaiP.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSaiP.setBorderPainted(false);
		btnSaiP.setBackground(Color.LIGHT_GRAY);
		btnSaiP.setBounds(353, 11, 19, 19);
		painelPesquisa.add(btnSaiP);
		
		
		contentPane.add(painelDepartamentos);
		painelDepartamentos.setLayout(null);
		
		btnSai = new JButton("");
		
		btnSai.setBackground(new Color(0, 206, 209));
		btnSai.setBorderPainted(false);
		btnSai.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSai.setBounds(113, 11, 19, 19);
		painelDepartamentos.add(btnSai);
		
		btnVinho = new JButton("Vinhos");
		btnVinho.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		btnVinho.setBackground(new Color(0, 206, 209));
		btnVinho.setBorderPainted(false);
		btnVinho.setBounds(27, 73, 89, 23);
		painelDepartamentos.add(btnVinho);
		
		btnQueijos = new JButton("Queijos");
		btnQueijos.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		btnQueijos.setBackground(new Color(0, 206, 209));
		btnQueijos.setBorderPainted(false);
		btnQueijos.setBounds(27, 135, 95, 23);
		painelDepartamentos.add(btnQueijos);
		
		lblDepartamentos = new JLabel("Departamentos");
		lblDepartamentos.setFont(new Font("Microsoft YaHei Light", Font.ITALIC, 14));
		lblDepartamentos.setBounds(6, 11, 97, 19);
		painelDepartamentos.add(lblDepartamentos);
		
		btnUsuario.setBackground(Color.WHITE);
		btnUsuario.setBorderPainted(false);
		
		
		btnUsuario.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/ima1 c\u00F3pia.png")));
		btnUsuario.setBounds(390, 10, 34, 34);
		contentPane.add(btnUsuario);
		
		
		btnDepartamentos.setBackground(Color.WHITE);
		btnDepartamentos.setBorderPainted(false);
		btnDepartamentos.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/3riscos.PNG")));
		btnDepartamentos.setBounds(17, 22, 28, 14);
		contentPane.add(btnDepartamentos);
		txtPesquisa.setBounds(17, 55, 368, 25);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		
		btnPesquisar.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/pesquisar.PNG")));
		btnPesquisar.setBounds(384, 55, 40, 25);
		contentPane.add(btnPesquisar);
		
		
		btnAlterar.setEnabled(false);
		btnAlterar.setBackground(Color.WHITE);
		btnAlterar.setBounds(17, 159, 125, 65);
		contentPane.add(btnAlterar);
		
		
		btnExcluir.setEnabled(false);
		btnExcluir.setBackground(Color.WHITE);
		
		btnExcluir.setBounds(152, 159, 125, 65);
		contentPane.add(btnExcluir);
		
		
		
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrar.setBounds(287, 159, 125, 65);
		contentPane.add(btnCadastrar);
		
		btnLogout = new JButton("");
		
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(Color.WHITE);
		btnLogout.setIcon(new ImageIcon(FAdmin.class.getResource("/imagens/power.jpg")));
		btnLogout.setBounds(350, 13, 34, 26);
		contentPane.add(btnLogout);
	
		Acao a = new Acao();
		//Açao do botao de usuario
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
		
		//Botao sair da tabela de pesquisa
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
		
		//Ação do botão do vinho
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
	}
}
