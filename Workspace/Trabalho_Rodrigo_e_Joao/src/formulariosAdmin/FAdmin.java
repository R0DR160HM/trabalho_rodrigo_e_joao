package formulariosAdmin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;

import acao.Acao;
import formulario.AlterarDados;
import formulario.Formulario;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class FAdmin extends JFrame {

	public static int indice;
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

	
	//Criar formul�rio
	public FAdmin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 451, 309);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Pain�is
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
		
		
		
		//Bot�es
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
		
		
		
		//R�tulos
		lblDepartamentos = new JLabel("Departamentos");
		lblDepartamentos.setFont(new Font("Microsoft YaHei Light", Font.ITALIC, 14));
		lblDepartamentos.setBounds(6, 11, 97, 19);
		painelDepartamentos.add(lblDepartamentos);
		
		
		
		
		//------A��es dos bot�es e da tabela-------
		
		
		
		//A��o da tabela
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) {
				
				//Obter o �ndice
				indice = table.getSelectedRow();
				
				//Habilitar bot�es
				painelPesquisa.setVisible(false);
				txtPesquisa.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
				
			}
			
		});
		
		
		//A��o do bot�o de usu�rio
		btnUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				AlterarDados altera = new AlterarDados();
				setVisible(false);
				altera.setVisible(true);
			}
		});
				
		//A��o do bot�o Pesquisar
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
		
				//Bot�o sair da tabela de pesquisa
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
		
				//A��o de cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCadastrar cadastra = new JCadastrar();
				setVisible(false);
				cadastra.setVisible(true);
				
			}
		});
		
				//A��o do bot�o de logout
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Formulario frame = new Formulario();
			frame.setVisible(true);
			}
		});
		
				//A��o do bot�o de departamentos
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
		
				//A��o do bot�o SAIR dos Departamentos
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
		
				//A��o do bot�o vinho
		btnVinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Vinhos frame = new Vinhos();
			frame.setVisible(true);
			}
		});
		
				//A��o do botao queijo
		btnQueijos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			Queijos frame = new Queijos();
			frame.setVisible(true);
			}
		});
		
			//A��o do bot�o excluir
		btnExcluir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String nome = table.getValueAt(indice, 0).toString();
				String tipo = table.getValueAt(indice, 6).toString();
			
				int excluir = JOptionPane.showConfirmDialog(null, "Deseja excluir o produto "+nome+"?");
				if (excluir == 0) {
					
					if (tipo.equals("Vinho")) {
						a.ExcluirVinho(nome);
						table.setModel(a.tabelaVinho(nome));
					}else if (tipo.equals("Queijo")) {
						a.ExcluirQueijo(nome);
						table.setModel(a.tabelaQueijo(nome));
					}
					
					JOptionPane.showMessageDialog(null, nome+" excluido com sucesso!");
					
				}else {
					JOptionPane.showMessageDialog(null, "Exclus�o cancelada");
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
		
				//Bot�o de alterar
		btnAlterar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int index = indice;
				String tipo = table.getValueAt(indice, 6).toString();
				String nome = table.getValueAt(index, 0).toString();
				int confirm = JOptionPane.showConfirmDialog(null, "Deseja alterar as informa��es de "+nome+"?");
				if (confirm == 0) {
					
					if ((a.AnalisarVinho(nome) == true) && (tipo.equals("Vinho"))) {
						
						
						a.alterarVin(nome, index);
						table.setModel(a.tabelaVinho(nome));
						
					}
					
					if ((a.AnalisarQueijo(nome) == true) && (tipo.equals("Queijo"))) {
						
						a.alterarQjo(nome, index);
						table.setModel(a.tabelaQueijo(nome));
						
					}
					
					JOptionPane.showMessageDialog(null, "Altera��o realizada com sucesso! ");
					
				}else {
					JOptionPane.showMessageDialog(null, "Altera��o cancelada!");
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
