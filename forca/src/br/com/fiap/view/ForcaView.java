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

		//verificando se há espaços na palavra
		if (palavraCript.indexOf(" ") != -1) {
			//limpando os espaços
			index = palavra.indexOf(" ");
			aux[index] = ' ';
			while (index >= 0) {
				aux[index] = ' ';
				index = palavra.indexOf(" ", index + 1);

			}
		}
		
		String string = String.copyValueOf(aux);
		System.out.println("Essa é a palavra oculta, tente adivinhar " + string);
		statusJogo = true;
		do {

						
				if (vidas <= 0) {
					System.out.println("O jogo acabou");
					statusJogo = false;
				} else {
					char tentativa = JOptionPane.showInputDialog("Digite sua tentativa: ").charAt(0);

					
					//verificando se a tentativa existe no índice da palavra
					if (palavra.indexOf(tentativa) == -1) {
						System.out.println("tentativa errada");
						vidas -= 1;
						System.out.println(vidas + " vidas restante(s).");
					} else {
						//procurando a tentativa na palavra 
						//após procurar, ele mapeia a localização
						//e altera na palavra criptografada
						//a palavra criptografada que virou um char array 
						//depois através de uma variável auxiliar recebe seu valor
						// e é impresso
						index = palavra.indexOf(tentativa);
						aux[index] = tentativa;
						while (index >= 0) {

							aux[index] = tentativa;
							string = String.copyValueOf(aux);
							index = palavra.indexOf(tentativa, index + 1);
						}
						//Verificando vitória
						if (string.toString().contains("*")) {

							System.out.println("O jogo ainda não acabou \n A palavra é: " + string);
						} else {

							System.out.println(" A palavra era: " + string + "\nParabéns, você ganhou");
							statusJogo = false;
						}
					}

				}

			

		} while (statusJogo == true);
	}
}
