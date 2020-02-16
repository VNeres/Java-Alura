package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Mario"; //forma literal
		String outro = new String ("Alura"); // má prática, usar sempre a forma literal
		
		String replace = outro.replace("A", "a");
		//System.out.println(replace);
		
		String lower = nome.toLowerCase();
		//System.out.println(lower);
		
		String upper = nome.toUpperCase();
		//System.out.println(upper);
		
		char c = nome.charAt(3);
		//System.out.println(c);
		
		int pos = nome.indexOf("rio");
		//System.out.println(pos);
		
		String sub = nome.substring(1);
		//System.out.println(sub);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		
	}

}
