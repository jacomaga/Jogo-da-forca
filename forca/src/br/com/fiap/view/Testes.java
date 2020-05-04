package br.com.fiap.view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Testes {
	public static void main(String[] args) {
		String palavra = "coco de coco";
		//System.out.println(palavra.indexOf("o",2));
		char tentativa=JOptionPane.showInputDialog("Digite sua tentativa: ").charAt(0);
		String palavraCript  = "";
		for (int i = 0; i < palavra.length(); i += 1) {
			palavraCript += "*";
		}
		
		///
		char[] aux = palavraCript.toCharArray();
		int index = palavra.indexOf(tentativa);
		 aux[index] = tentativa;
		while (index >= 0) {
		    System.out.println(index);
		    
		    aux[index] = tentativa;
		    
		    index = palavra.indexOf(tentativa, index + 1);
		}
		System.out.println(aux);
	}
}
