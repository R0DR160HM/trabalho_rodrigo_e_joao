package principal;

import java.util.Random;

import acao.Acao;
import beans.Atributos;
import formulario.Formulario;


public class Principal {
public static void main(String[] args) {
	
	//Instanciar objetos das classes Acao e Atributos
			Acao a = new Acao();
			Atributos at = new Atributos();
			
			//Cadastrar usuário administrador (padrão)
			at.setAdmin(true);
			at.setData(a.data());
			at.setEmail("admin@entra21.com");
			at.setHora(a.horario());
			at.setSenha("java");
			a.cadastrarUsuarios(at);
			
						//Instanciar um objeto da classe Formulario e exibi-lo
						Formulario frame = new Formulario();
						frame.setVisible(true);

	
	}
}
