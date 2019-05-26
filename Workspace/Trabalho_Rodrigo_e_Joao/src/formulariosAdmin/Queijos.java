package formulariosAdmin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queijos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	//Criar formulário
	public Queijos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 339);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Campos de texto
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 59, 242, 25);
		contentPane.add(textField);
		
		
		
		//Botões
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Queijos.class.getResource("/imagens/pesquisar.PNG")));
		button.setBounds(370, 59, 40, 25);
		contentPane.add(button);
		
		JButton btnSair = new JButton("");		
		btnSair.setIcon(new ImageIcon(Queijos.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSair.setBorderPainted(false);
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(405, 11, 19, 19);
		contentPane.add(btnSair);
		
		
		
		//Rótulo
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Queijos.class.getResource("/imagens/queijo1.png")));
		lblNewLabel.setBounds(10, 29, 100, 67);
		contentPane.add(lblNewLabel);
		
		
		
		//Tabela e ScrollPane
		table = new JTable();
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 107, 414, 182);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(table);
		
		
		
		//Ação do botão
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			FAdmin frame = new FAdmin();
			frame.setVisible(true);
			}
		});
		
	}

}
