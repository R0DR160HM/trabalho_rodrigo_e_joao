package acao;

import java.time.LocalDateTime;

import javax.swing.JPasswordField;

import beans.Atributos;
import dados.Vetor;

public class Acao {
	
	//Cadastrar ao ArrayList
	public void cadastrarUsuarios(Atributos at) {
		Vetor.vetorUsuarios.add(at);
		
	}
	
	//Cadastrar produtos
	
	
	
	
	//Retornar data
	public String data() {
		LocalDateTime date = LocalDateTime.now();
		
		int dia = date.getDayOfMonth();
		int mes = date.getMonthValue();
		int ano = date.getYear();
		String texto = dia+"/"+mes+"/"+ano;
		
		return texto;
	}
	
	
	
	//Retornar hora
	public String horario() {
		LocalDateTime date = LocalDateTime.now();
		
		int hora = date.getHour();
		int minuto = date.getMinute();
		
		String texto = hora+":"+minuto;
		
		return texto;
	}
	
	
	
	//Converter senha em String
	public String senha(JPasswordField senha) {
		
		char[] texto = senha.getPassword();
		String resultado = "";
		
		for (int i=0; i<texto.length; i++) {
			resultado+=texto[i];
		}
		
		return resultado;
		
	}
	
	
	
}
