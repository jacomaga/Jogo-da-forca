package br.com.fiap.view;

import javax.swing.JOptionPane;

public class ForcaView {

	String palavra;
	char tentativa;
	static Boolean statusJogo;

	public static void main(String[] args) {
		int vidas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vidas: "));
		String palavra = JOptionPane.showInputDialog("Digite a palavra");
		String palavraCript = "";

		for (int i = 0; i < palavra.length(); i += 1) {
			palavraCript += "*";
		}

		char[] aux = palavraCript.toCharArray();
		;
		int index;

		//verificando se h� espa�os na palavra
		if (palavraCript.indexOf(" ") != -1) {
			//limpando os espa�os
			index = palavra.indexOf(" ");
			aux[index] = ' ';
			while (index >= 0) {
				aux[index] = ' ';
				index = palavra.indexOf(" ", index + 1);

			}
		}
		
		String string = String.copyValueOf(aux);
		System.out.println("Essa � a palavra oculta, tente adivinhar " + string);
		statusJogo = true;
		do {

						
				if (vidas <= 0) {
					System.out.println("O jogo acabou");
					statusJogo = false;
				} else {
					char tentativa = JOptionPane.showInputDialog("Digite sua tentativa: ").charAt(0);

					
					//verificando se a tentativa existe no �ndice da palavra
					if (palavra.indexOf(tentativa) == -1) {
						System.out.println("tentativa errada");
						vidas -= 1;
						System.out.println(vidas + " vidas restante(s).");
					} else {
						//procurando a tentativa na palavra 
						//ap�s procurar, ele mapeia a localiza��o
						//e altera na palavra criptografada
						//a palavra criptografada que virou um char array 
						//depois atrav�s de uma vari�vel auxiliar recebe seu valor
						// e � impresso
						index = palavra.indexOf(tentativa);
						aux[index] = tentativa;
						while (index >= 0) {

							aux[index] = tentativa;
							string = String.copyValueOf(aux);
							index = palavra.indexOf(tentativa, index + 1);
						}
						//Verificando vit�ria
						if (string.toString().contains("*")) {

							System.out.println("O jogo ainda n�o acabou \n A palavra �: " + string);
						} else {

							System.out.println(" A palavra era: " + string + "\nParab�ns, voc� ganhou");
							statusJogo = false;
						}
					}

				}

			

		} while (statusJogo == true);
	}
}
