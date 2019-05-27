package formulario;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Atributos;
import dados.Vetor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.font.TextMeasurer;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CriarUsuario extends JFrame {

	private JPanel contentPane;
	private JPasswordField passSenha;
	private JPasswordField passConfirm;
	private JTextField textEmail;
	private JTextField textData;


	//Criar formulário
	public CriarUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Instanciar objetos das classes Atributos e Acao
		Atributos at = new Atributos();
		Acao a = new Acao();
		
		
		
		//Rótulos
		JLabel lblCadastrarUsurios = new JLabel("CADASTRAR USU\u00C1RIO");
		lblCadastrarUsurios.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCadastrarUsurios.setBounds(160, 11, 198, 30);
		contentPane.add(lblCadastrarUsurios);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(43, 203, 70, 23);
		contentPane.add(lblSenha);
		
		JLabel lblConfirmarSenha = new JLabel("Confirmar Senha");
		lblConfirmarSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblConfirmarSenha.setBounds(42, 253, 134, 23);
		contentPane.add(lblConfirmarSenha);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEmail.setBounds(42, 102, 70, 30);
		contentPane.add(lblEmail);
		
		
		
		//Campos de senha
		passSenha = new JPasswordField();
		passSenha.setBounds(206, 206, 256, 20);
		contentPane.add(passSenha);
		
		passConfirm = new JPasswordField();
		passConfirm.setBounds(206, 256, 256, 20);
		contentPane.add(passConfirm);
		
		
		
		//Campos de texto
		textEmail = new JTextField();
		textEmail.setBounds(206, 109, 256, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		textData = new JTextField();
		textData.setBounds(206, 153, 256, 20);
		contentPane.add(textData);
		textData.setColumns(10);
		textData.setText("DD/MM/AAAA");
		
		
		
		//Botões
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(180, 355, 134, 55);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 17, 89, 23);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBackground(new Color(239, 239, 239));
		contentPane.add(btnVoltar);
		
		JLabel lblData = new JLabel("Data de Nascimento");
		lblData.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblData.setBounds(42, 150, 149, 23);
		contentPane.add(lblData);
		
		
		
		//Ações dos botões
		textData.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				if (textData.getText().startsWith("DD/MM/AAAA")) {
					textData.setText("");
				}
			}
		});
		
		//=-=-=-=-=-=-=
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Verificar se todos os campos estão preenchidas
				if ((!a.senha(passSenha).equals("")) && (!a.senha(passConfirm).equals("")) && (!textEmail.getText().equals("")) && (!textData.getText().equals(""))) {
					
					//Verificar se a senha e a confirmação de senha são iguais
					if (a.senha(passSenha).equals(a.senha(passConfirm))) {
						
						//Verificar se há duplicidade de e-mails
						boolean repetido = false;
						for (int i=0; i<Vetor.vetorUsuarios.size(); i++) {
							if (textEmail.getText().equals(Vetor.vetorUsuarios.get(i).getEmail())) {
								repetido = true;
							}
						}
						
						if (repetido == false) {
						
						at.setSenha(a.senha(passSenha));
						at.setEmail(textEmail.getText());
						at.setAdmin(false);
						at.setData(a.data());
						at.setHora(a.horario());
						at.setNascimento(textData.getText());
						a.cadastrarUsuarios(at);
						
						Formulario form = new Formulario();
						setVisible(false);
						form.setVisible(true);	
						
						}else {
							JOptionPane.showMessageDialog(null, "E-mail já cadastrado");
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "As senhas não coincidem");
					}
					
		}else {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos");
		}
				
				//Limpar campos de texto e de senha
				textEmail.setText("");
				passSenha.setText("");
				passConfirm.setText("");
				
			}
		});
		
		//=-=-=-=-=-=-=-=-=	
		
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int sair = JOptionPane.showConfirmDialog(null, "Deseja voltar ao Menu Principal? Mudanças não salvas serão perdidas");
				
				if (sair == 0) {
				setVisible(false);
				Formulario form = new Formulario();
				form.setVisible(true);
				}
				
				
			}
		});
		
	}
}
