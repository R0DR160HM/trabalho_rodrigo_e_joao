package formulariosAdmin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Vetor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Vinhos extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JButton btnPesquisar;
	private JTable table;

	//Criar formulário
	public Vinhos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Instanciar objeto da classe Acao
		Acao a = new Acao();
		
		
		
		//Rótulos
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Vinhos.class.getResource("/imagens/vinhos1.png")));
		lblNewLabel.setBounds(9, 1, 101, 130);
		contentPane.add(lblNewLabel);
		
		
		
		//Campo de texto
		txtPesquisa = new JTextField();
		txtPesquisa.setColumns(10);
		txtPesquisa.setBounds(127, 57, 242, 25);
		contentPane.add(txtPesquisa);
		
		
		
		//Botões
		btnPesquisar = new JButton("");
		
		btnPesquisar.setIcon(new ImageIcon(Vinhos.class.getResource("/imagens/pesquisar.PNG")));
		btnPesquisar.setBounds(367, 57, 40, 25);
		contentPane.add(btnPesquisar);
		
		JButton btnSair = new JButton("");	
		btnSair.setIcon(new ImageIcon(Vinhos.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSair.setBorderPainted(false);
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(405, 11, 19, 19);
		contentPane.add(btnSair);
		
		
		
		//Painel
		JPanel panel = new JPanel();
		panel.setBounds(9, 121, 415, 188);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		//ScrollPane e tabela
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 415, 188);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		
		//Ação do botão
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			FAdmin frame = new FAdmin();
			frame.setVisible(true);
			}
		});
		
		//Acao do botao de Pesquisa
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((a.validar1(txtPesquisa.getText()) == true) && (a.validar2() == true)) {
					String text = txtPesquisa.getText();
				
				
				if(a.AnalisarVinho(text) == true) {					
					table.setModel(a.tabelaVinho(text));
					
				}else {
					JOptionPane.showMessageDialog(null, "Produto nao existe em estoque");
				}
			
			
				}
				
				txtPesquisa.setText("");
				txtPesquisa.requestFocus();
			}
		});
		
		//Ação da tabela
		table.addMouseListener(new MouseAdapter() {
			
			public void mouseReleased(MouseEvent e) {
				
				//Obter o índice
				FAdmin.indice = table.getSelectedRow();
				
				int index = FAdmin.indice;
				String nome = table.getValueAt(index, 0).toString();
				
				Object[] objeto = {"Alterar", "Excluir", "Cancelar"};
				int acao = JOptionPane.showOptionDialog(null, "Escolha a ação que deseja realizar com "+Vetor.vetorVinho.get(FAdmin.indice).getNome(), "", JOptionPane.PLAIN_MESSAGE, JOptionPane.PLAIN_MESSAGE, null, objeto, 0);
				
				switch (acao) {
				case 0:
				
					a.alterarVin(nome, index);
					table.setModel(a.tabelaVinho(nome));
					
				break;
				case 1:
					
					a.ExcluirVinho(nome);
					table.setModel(a.tabelaVinho(nome));
					
				break;
				case 2:
					
					
					
				break;
				}
				
			}
			
		});
		
	}
}
