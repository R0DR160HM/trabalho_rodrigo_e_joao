package formulariosUsuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Carrinho;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class Queijos2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesquisa;
	private JTable table;

	//Criar formulário
	public Queijos2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 339);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Instanciar objeto da classe Acao
		Acao a = new Acao();
		
		
		
		//Campo de texto
		txtPesquisa = new JTextField();
		txtPesquisa.setColumns(10);
		txtPesquisa.setBounds(130, 59, 242, 25);
		contentPane.add(txtPesquisa);
		
		
		
		//Panel
		JPanel panel = new JPanel();
		panel.setBounds(10, 107, 414, 182);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		//Botões
		JButton btnPesquisar = new JButton("");
		
		btnPesquisar.setIcon(new ImageIcon(Queijos2.class.getResource("/imagens/pesquisar.PNG")));
		btnPesquisar.setBounds(370, 59, 40, 25);
		contentPane.add(btnPesquisar);
		
		JButton btnSair = new JButton("");		
		btnSair.setIcon(new ImageIcon(Queijos2.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSair.setBorderPainted(false);
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(405, 11, 19, 19);
		contentPane.add(btnSair);
		
		
		
		//Rótulo
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Queijos2.class.getResource("/imagens/queijo1.png")));
		lblNewLabel.setBounds(10, 29, 100, 67);
		contentPane.add(lblNewLabel);
		
		JLabel indice = new JLabel("");
		indice.setBounds(158, 11, 48, 14);
		contentPane.add(indice);
		indice.setVisible(false);
		
		
		
		//Tabela e ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 414, 182);
		panel.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		
		
		
		//Ação do botão sair
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			JComum frame = new JComum();
			frame.setVisible(true);
			}
		});
		
		//Acao do botao Pesquisar
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if((a.validar1(txtPesquisa.getText()) == true) && (a.validar2() == true)) {
					String text = txtPesquisa.getText();
				
				
				if(a.AnalisarQueijo(text) == true) {
					
					table.setModel(a.tabelaQueijo(text));
				}else {
					JOptionPane.showMessageDialog(null, "Produto nao existe em estoque");
				}
			
			
				}
				
				txtPesquisa.setText("");
				txtPesquisa.requestFocus();
			}
		});
	
	//Ação da tabela para comprar
	table.addMouseListener(new MouseAdapter() {
				
		public void mouseReleased(MouseEvent e) {
					
		//Obter o índice
		indice.setText(String.valueOf(table.getSelectedRow()));
					
		//Habilitar botões

		
		//Pegar o nome
		String nome = table.getValueAt(Integer.parseInt(indice.getText()), 0).toString();
		Double valor1 = ((Double.parseDouble(table.getValueAt(Integer.parseInt(indice.getText()), 3).toString())));
		
		int comprar = JOptionPane.showConfirmDialog(null, "Deseja comprar o produto "+nome+"no valor de R$"+valor1+" ?");
		
		switch(comprar) {
		
		case 0:
			int qtd = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade a ser comprada do produto "+nome));
			
			
			JOptionPane.showMessageDialog(null, "Produto adicionado ao carrinho");
							
			btnPesquisar.setEnabled(true);				
			
			txtPesquisa.setEnabled(true);
			txtPesquisa.setText("");
			txtPesquisa.requestFocus();
			
			Carrinho b = new Carrinho();
			b.setNome(nome);
			b.setQtd(qtd);
			b.setValorUn(Double.parseDouble(table.getValueAt(Integer.parseInt(indice.getText()), 3).toString()));
			b.setProduto("Queijo");
													
			Double qtdF = valor1* qtd;				
							
			JComum.valor=a.total(qtdF);
			a.adicionarCarrinho(b);		
		break;
		
		
		case 1:
			JOptionPane.showMessageDialog(null, "Compra cancelada");				
			btnPesquisar.setEnabled(true);				
			txtPesquisa.setEnabled(true);
			txtPesquisa.setText("");
			txtPesquisa.requestFocus();
			break;	
		}
					
	}
				
});
	
}
	
}
