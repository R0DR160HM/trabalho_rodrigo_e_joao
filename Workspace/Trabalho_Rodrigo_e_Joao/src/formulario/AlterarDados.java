package formulario;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Atributos;
import dados.Vetor;
import formulariosAdmin.FAdmin;
import formulariosUsuario.JComum;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AlterarDados extends JFrame {

	private JPanel contentPane;



	//Criar formulário
	public AlterarDados() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 277);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		//Instanciar objeto da classe Atributos
		Atributos at = new Atributos();
		
		
		
		//Rótulos
		JLabel lblAlterarDadosDe = new JLabel("Alterar Dados de:");
		lblAlterarDadosDe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAlterarDadosDe.setBounds(124, 11, 144, 36);
		contentPane.add(lblAlterarDadosDe);
		
		JLabel lblEmail = new JLabel("E-mail Atual: "+Vetor.vetorUsuarios.get(Formulario.indice).getEmail());
		lblEmail.setBounds(10, 162, 371, 14);
		contentPane.add(lblEmail);
		
		JLabel lblDataDeC = new JLabel("Data de Cria\u00E7\u00E3o: "+Vetor.vetorUsuarios.get(Formulario.indice).getData());
		lblDataDeC.setBounds(10, 201, 414, 14);
		contentPane.add(lblDataDeC);
		
		JLabel lblHorrioDeCriao = new JLabel("Hor\u00E1rio de Cria\u00E7\u00E3o: "+Vetor.vetorUsuarios.get(Formulario.indice).getHora());
		lblHorrioDeCriao.setBounds(10, 213, 416, 14);
		contentPane.add(lblHorrioDeCriao);
		
		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento atual: "+Vetor.vetorUsuarios.get(Formulario.indice).getNascimento());
		lblDataDeNascimento.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblDataDeNascimento.setBounds(10, 176, 295, 14);
		contentPane.add(lblDataDeNascimento);
		
		
		
		//Botões
		JButton btnAlterarSenha = new JButton("Alterar Senha");
		btnAlterarSenha.setBackground(Color.WHITE);
		btnAlterarSenha.setBounds(75, 89, 180, 23);
		contentPane.add(btnAlterarSenha);
		
		JButton btnAlterarEmail = new JButton("Alterar E-mail");
		btnAlterarEmail.setBackground(Color.WHITE);
		btnAlterarEmail.setBounds(75, 67, 180, 23);
		contentPane.add(btnAlterarEmail);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 11, 89, 23);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBackground(new Color(239, 239, 239));
		contentPane.add(btnVoltar);
		
		JButton btndata = new JButton("Alterar Data de Nascimento");
		btndata.setBackground(Color.WHITE);
		btndata.setBounds(75, 111, 180, 23);
		contentPane.add(btndata);
		
		
		
		//Ações dos botões
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

		//=-=-=-=-=
		
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
				at.setNascimento(Vetor.vetorUsuarios.get(Formulario.indice).getNascimento());
				
				Vetor.vetorUsuarios.set(Formulario.indice, at);
				
				JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
				
				
				
				}else {
					JOptionPane.showMessageDialog(null, "As duas senhas não coincidem");
				}
				

			
			}
		});
		
		//=-=-=-=-=
		
		btnAlterarEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String email = JOptionPane.showInputDialog("Informe o novo e-mail");
				
				at.setAdmin(Vetor.vetorUsuarios.get(Formulario.indice).isAdmin());
				at.setData(Vetor.vetorUsuarios.get(Formulario.indice).getData());
				at.setEmail(email);
				at.setHora(Vetor.vetorUsuarios.get(Formulario.indice).getHora());
				at.setSenha(Vetor.vetorUsuarios.get(Formulario.indice).getSenha());
				at.setNascimento(Vetor.vetorUsuarios.get(Formulario.indice).getNascimento());
				
				Vetor.vetorUsuarios.set(Formulario.indice, at);
				
				JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
				
				lblEmail.setText("E-mail Atual: "+Vetor.vetorUsuarios.get(Formulario.indice).getEmail());
			
			}
		});
		
		//=-=-=-=-=-=
		
		btndata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data = JOptionPane.showInputDialog("Informe a nova data de nascimento");
				
				at.setAdmin(Vetor.vetorUsuarios.get(Formulario.indice).isAdmin());
				at.setData(Vetor.vetorUsuarios.get(Formulario.indice).getData());
				at.setEmail(Vetor.vetorUsuarios.get(Formulario.indice).getEmail());
				at.setHora(Vetor.vetorUsuarios.get(Formulario.indice).getHora());
				at.setSenha(Vetor.vetorUsuarios.get(Formulario.indice).getSenha());
				at.setNascimento(data);
				
				Vetor.vetorUsuarios.set(Formulario.indice, at);
				
				JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
				
				lblDataDeNascimento.setText("Data de Nascimento atual: "+Vetor.vetorUsuarios.get(Formulario.indice).getNascimento());
				
			}
		});
		
		
		
		
		
		
		
		
		
		
	}
}
