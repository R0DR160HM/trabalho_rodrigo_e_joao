package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Atributos;
import dados.Vetor;
import formulariosAdmin.FAdmin;
import formulariosUsuario.JComum;
import principal.Principal;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarDados extends JFrame {

	private JPanel contentPane;



	/**
	 * Create the frame.
	 */
	public AlterarDados() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 238);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Acao a = new Acao();
		Atributos at = new Atributos();
		
		JLabel lblAlterarDadosDe = new JLabel("Alterar Dados de:");
		lblAlterarDadosDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlterarDadosDe.setBounds(124, 11, 144, 36);
		contentPane.add(lblAlterarDadosDe);
		
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setBackground(Color.WHITE);
		btnAlterarSenha.setBounds(171, 67, 134, 36);
		contentPane.add(btnAlterarSenha);
		
		JButton btnAlterarEmail = new JButton("Alterar E-mail");
		btnAlterarEmail.setBackground(Color.WHITE);
		btnAlterarEmail.setBounds(10, 67, 134, 36);
		contentPane.add(btnAlterarEmail);
		
		JLabel lblEmail = new JLabel("E-mail Atual: "+Vetor.vetorUsuarios.get(Formulario.indice).getEmail());
		lblEmail.setBounds(10, 123, 371, 14);
		contentPane.add(lblEmail);
		
		JLabel lblDataDeC = new JLabel("Data de Cria\u00E7\u00E3o: "+Vetor.vetorUsuarios.get(Formulario.indice).getData());
		lblDataDeC.setBounds(9, 156, 414, 14);
		contentPane.add(lblDataDeC);
		
		JLabel lblHorrioDeCriao = new JLabel("Hor\u00E1rio de Cria\u00E7\u00E3o: "+Vetor.vetorUsuarios.get(Formulario.indice).getHora());
		lblHorrioDeCriao.setBounds(11, 175, 416, 14);
		contentPane.add(lblHorrioDeCriao);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if (Vetor.vetorUsuarios.get(Formulario.indice).isAdmin() == true) {
					FAdmin form =new FAdmin();
					form.setVisible(true);
					
					
				}else {
					JComum form = new JComum();
					form.setVisible(true);
				}
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBackground(new Color(239, 239, 239));
		contentPane.add(btnVoltar);
		
		
		
		
		btnAlterarSenha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String senha = JOptionPane.showInputDialog("Informe a nova senha");
				String senha2 = JOptionPane.showInputDialog("Confirme a nova senha");
				
				if (senha.equals(senha2)) {
				at.setAdmin(Vetor.vetorUsuarios.get(Formulario.indice).isAdmin());
				at.setData(Vetor.vetorUsuarios.get(Formulario.indice).getData());
				at.setEmail(Vetor.vetorUsuarios.get(Formulario.indice).getEmail());
				at.setHora(Vetor.vetorUsuarios.get(Formulario.indice).getHora());
				at.setSenha(senha);
				
				Vetor.vetorUsuarios.set(Formulario.indice, at);
				
				JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
				
				
				
				}else {
					JOptionPane.showMessageDialog(null, "As duas senhas não coincidem");
				}
				

			
			}
		});
		
		
		
		btnAlterarEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String email = JOptionPane.showInputDialog("Informe o novo e-mail");
				
				at.setAdmin(Vetor.vetorUsuarios.get(Formulario.indice).isAdmin());
				at.setData(Vetor.vetorUsuarios.get(Formulario.indice).getData());
				at.setEmail(email);
				at.setHora(Vetor.vetorUsuarios.get(Formulario.indice).getHora());
				at.setSenha(Vetor.vetorUsuarios.get(Formulario.indice).getSenha());
				
				Vetor.vetorUsuarios.set(Formulario.indice, at);
				
				JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
				
				lblEmail.setText("E-mail Atual: "+Vetor.vetorUsuarios.get(Formulario.indice).getEmail());
			
			}
		});
		
		
		
		
		
		
		
		
		
		
	}
}
