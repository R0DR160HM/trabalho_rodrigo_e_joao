package formulariosAdmin;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class JCadastrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtPais;
	private JTextField txtMarca;
	private JTextField txtPreco;

	public JCadastrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 358, 479);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar objeto da classe Acao
		Acao a = new Acao();
		
		JLabel lblNewLabel = new JLabel("Cadastrar Produto");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(99, 11, 140, 26);
		contentPane.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(109, 112, 229, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNome.setBounds(10, 115, 79, 14);
		contentPane.add(lblNome);
		
		JLabel lblPasDeOrigem = new JLabel("Pa\u00EDs de Origem");
		lblPasDeOrigem.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPasDeOrigem.setBounds(10, 146, 79, 14);
		contentPane.add(lblPasDeOrigem);
		
		txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(109, 143, 229, 20);
		contentPane.add(txtPais);
		
		JComboBox cbxCor = new JComboBox();
		cbxCor.setEnabled(false);
		cbxCor.setBackground(Color.WHITE);
		cbxCor.setBounds(109, 205, 229, 20);
		cbxCor.addItem("Branco");
		cbxCor.addItem("Tinto");
		contentPane.add(cbxCor);
		
		JComboBox cbxTipo = new JComboBox();
		cbxTipo.setEnabled(false);
		cbxTipo.setBackground(Color.WHITE);
		cbxTipo.setBounds(109, 236, 229, 20);
		cbxTipo.addItem("Seco");
		cbxTipo.addItem("Tinto");
		contentPane.add(cbxTipo);
		
		JLabel lblCor = new JLabel("Cor ");
		lblCor.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCor.setBounds(10, 208, 28, 14);
		contentPane.add(lblCor);
		
		JLabel lblTipo = new JLabel("Tipo");
		lblTipo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblTipo.setBounds(10, 239, 28, 14);
		contentPane.add(lblTipo);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblMarca.setBounds(10, 177, 42, 14);
		contentPane.add(lblMarca);
		
		txtMarca = new JTextField();
		txtMarca.setBounds(109, 174, 229, 20);
		contentPane.add(txtMarca);
		txtMarca.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Selecione o tipo de produto");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 48, 183, 14);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton rdVinho = new JRadioButton("Vinho");
		
		rdVinho.setBackground(Color.WHITE);
		rdVinho.setBounds(10, 69, 109, 23);
		contentPane.add(rdVinho);
		
		JRadioButton rdChamp = new JRadioButton("Queijos");
		
		rdChamp.setBackground(Color.WHITE);
		rdChamp.setBounds(143, 69, 95, 23);
		contentPane.add(rdChamp);
	
		ButtonGroup group = new ButtonGroup();
		group.add(rdVinho);
		group.add(rdChamp);
		
		JLabel lblAnimalDeOrigem = new JLabel("Animal de Origem");
		lblAnimalDeOrigem.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblAnimalDeOrigem.setBounds(10, 276, 95, 14);
		contentPane.add(lblAnimalDeOrigem);
		
		JComboBox cbxAnimal = new JComboBox();
		cbxAnimal.setEnabled(false);
		cbxAnimal.setBackground(Color.WHITE);
		cbxAnimal.addItem("Vaca");
		cbxAnimal.addItem("Cabra");
		cbxAnimal.addItem("Ovelha");
		cbxAnimal.addItem("Búfala");

		cbxAnimal.setBounds(109, 272, 229, 20);
		contentPane.add(cbxAnimal);
		
		JLabel lblConsistncia = new JLabel("Textura");
		lblConsistncia.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblConsistncia.setBounds(10, 306, 72, 14);
		contentPane.add(lblConsistncia);
		
		JComboBox cbxTex = new JComboBox();
		cbxTex.setEnabled(false);
		cbxTex.addItem("Macio");
		cbxTex.addItem("Semimacio");
		cbxTex.addItem("Semifirme");
		cbxTex.addItem("Firme");

		cbxTex.setBackground(Color.WHITE);
		cbxTex.setBounds(109, 303, 229, 20);
		contentPane.add(cbxTex);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		
		btnCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCadastrar.setBackground(Color.WHITE);
		btnCadastrar.setBounds(127, 406, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnVoltar = new JButton("Voltar");
		
		btnVoltar.setBackground(Color.WHITE);
		btnVoltar.setBounds(10, 11, 70, 19);
		contentPane.add(btnVoltar);
		
		JLabel lblPreo = new JLabel("Pre\u00E7o");
		lblPreo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPreo.setBounds(10, 339, 79, 14);
		contentPane.add(lblPreo);
		
		txtPreco = new JTextField();
		txtPreco.setColumns(10);
		txtPreco.setBounds(109, 334, 229, 20);
		contentPane.add(txtPreco);
		
		//Vinho
		rdVinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cbxCor.setEnabled(true);
			cbxTipo.setEnabled(true);
			cbxTex.setEnabled(false);
			cbxAnimal.setEnabled(false);
			}
		});
		
	//Quiejo	
		rdChamp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			cbxTex.setEnabled(true);
			cbxAnimal.setEnabled(true);
			cbxTipo.setEnabled(false);
			cbxCor.setEnabled(false);
			}
		});
	//Botao cadastrar
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
				if (rdVinho.isSelected() == true) {
					
					a.cadastrarVinho(txtNome.getText(), txtPais.getText(), txtMarca.getText(), Double.parseDouble(txtPreco.getText()), cbxCor.getSelectedItem().toString(), cbxTipo.getSelectedItem().toString());
					setVisible(false);
					FAdmin frame = new FAdmin();
					frame.setVisible(true);
					
				}else if (rdChamp.isSelected() == true) {
					
					a.cadastrarQueijo(txtNome.getText(), txtPais.getText(), txtMarca.getText(), Double.parseDouble(txtPreco.getText()), cbxAnimal.getSelectedItem().toString(), cbxTex.getSelectedItem().toString());
					setVisible(false);
					FAdmin frame = new FAdmin();
					frame.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "Selecione um tipo de produto");
				}
				
			}
		});
		
	//Ação do botao voltar
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			setVisible(false);
			FAdmin frameAdmin = new FAdmin();
			frameAdmin.setVisible(true);
			
			}
		});	
	}
}
