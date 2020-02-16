package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		
		Integer idadeRef = 29;
		int primitivo = new Integer(21);
		
		List<Integer> lista = new ArrayList<>();
		lista.add(idadeRef);
		lista.add(primitivo); //autoboxing
		
		int i1 = lista.get(0); //uboxing
		Integer i2 = lista.get(1);
		
		System.out.println(i1);//29
		System.out.println(i2);//21
		
		Integer valorRef = Integer.valueOf(33);//delegando a criação para método valueOf
		int valorPri = valorRef.intValue();
		
		System.out.println(valorPri);//33
		
		Integer iParseado1 = Integer.valueOf("42");//parseando e devolvendo referência
		int iParseado2 = Integer.parseInt("44"); //parseando e devolvendo primitivo
		
	}

}
