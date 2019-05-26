package formulario;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Vetor;
import formulariosAdmin.FAdmin;
import formulariosUsuario.JComum;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	public static int indice;
	private JTextField textEmail;

	
	
	//Criar formulário
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Instanciar objeto da classe Acao
		Acao a = new Acao();
		
		
		
		//Rótulos
		JLabel lblNome = new JLabel("E-mail");
		lblNome.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		lblNome.setBounds(58, 60, 83, 32);
		contentPane.add(lblNome);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 25));
		lblSenha.setBounds(56, 121, 75, 17);
		contentPane.add(lblSenha);
		
		
		
		//Botões
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(58, 198, 116, 38);
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(new Color(224, 247, 255));
		contentPane.add(btnLogin);
		
		JButton bnCadastrar = new JButton("Registrar");
		bnCadastrar.setBorderPainted(false);
		bnCadastrar.setBackground(new Color(224, 247, 255));
		bnCadastrar.setBounds(262, 198, 116, 38);
		contentPane.add(bnCadastrar);
		
		
		
		//Campo de senha
		passwordField = new JPasswordField();
		passwordField.setBounds(167, 123, 211, 20);
		contentPane.add(passwordField);
		
		
		
		//Campo de texto
		textEmail = new JTextField();
		textEmail.setBounds(167, 70, 211, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		
		
		//Ações dos botões
		bnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				CriarUsuario criar = new CriarUsuario();
				criar.setVisible(true);
				
			}
		});

		//=-=-=-=-=-=-=-=-=	
			
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Variáveis
				String email = textEmail.getText();
				String senha = a.senha(passwordField);
				boolean confirm = false;
				
				
				//Limpar campos de texto
				passwordField.setText("");
				textEmail.setText("");

				
				//Verificar a existência do e-mail
				for (int i=0; i<Vetor.vetorUsuarios.size(); i++) {
					
					if (email.equals(Vetor.vetorUsuarios.get(i).getEmail())) {
					indice = i;
					confirm = true;
					}
					
				}
				
				
				//Verificar a compatibilidade do e-mail e da senha
				if ((senha.equals(Vetor.vetorUsuarios.get(indice).getSenha())) && (confirm == true)) {
				
					setVisible(false);
					
					if (Vetor.vetorUsuarios.get(indice).isAdmin() == true) {
						
						FAdmin form = new FAdmin();
						form.setVisible(true);
						
					}else {
						
						JComum form = new JComum();
						form.setVisible(true);
					
					}
					
	
				}else {
					
					JOptionPane.showMessageDialog(null, "Senha ou usuário incorreto");
				
				}
	
			}
		});
		


	}
}
