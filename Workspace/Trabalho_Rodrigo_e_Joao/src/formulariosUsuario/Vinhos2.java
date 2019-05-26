package formulariosUsuario;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vinhos2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	//Criar formulário
	public Vinhos2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 359);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Rótulo
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Vinhos2.class.getResource("/imagens/vinhos1.png")));
		lblNewLabel.setBounds(9, 1, 101, 130);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		
		
		//Campo de texto
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(127, 57, 242, 25);
		contentPane.add(textField);
		
		
		
		//Botões
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Vinhos2.class.getResource("/imagens/pesquisar.PNG")));
		button.setBounds(367, 57, 40, 25);
		contentPane.add(button);
		
		JButton btnSair = new JButton("");		
		btnSair.setIcon(new ImageIcon(Vinhos2.class.getResource("/imagens/X c\u00F3pia.png")));
		btnSair.setBorderPainted(false);
		btnSair.setBackground(Color.WHITE);
		btnSair.setBounds(405, 11, 19, 19);
		contentPane.add(btnSair);
		
		
		
		//ScrollPane
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(9, 129, 415, 178);
		scrollPane.setViewportView(lblNewLabel_1);
		contentPane.add(scrollPane);
		

		

		
		//Ação do botão
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			JComum frame = new JComum();
			frame.setVisible(true);
			}
		});
	}
}
