package Exercicios;

import javax.swing.JOptionPane;

public class Exercicio16 {

	public static void main(String[] args) {

		/*
		 * Cadastro de Usuários: Solicite ao usuário que insira informações de várias
		 * pessoas (nome, idade, e-mail, etc.) até que ele decida parar.
		 */

		String[] nomes = new String[5];

		String[] emails = new String[5];

		int[] idades = new int[5];

		String resposta = null;

		do {

			for (int i = 0; i < nomes.length; i++) {

				nomes[i] = JOptionPane.showInputDialog(null, " Digite alguns nomes para preencher o array");

				emails[i] = JOptionPane.showInputDialog(null, " Digite alguns emails para preencher o array");

				try {
					idades[i] = Integer.parseInt(
							JOptionPane.showInputDialog(null, " Digite algumas idades para preencher o array"));

					if (idades[i] < 0) {
						JOptionPane.showMessageDialog(null, " A idade não pode conter números negativos \n ERRO!");
						break;
					}

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, " Você precisa preencher o campo com números");
					break;
				}

			}

			resposta = JOptionPane.showInputDialog(null, " Deseja continuar??");

			if (resposta.equalsIgnoreCase("nao")) {

				System.out.println("Fim da aplicacao");

				for (int i = 0; i < nomes.length; i++) {

					System.out.print(nomes[i] + " ");

					System.out.println();

					System.out.print(emails[i] + " ");

					System.out.println();

					System.out.print(idades[i] + " ");

				}
				break;
			}

		}

		while (resposta.equalsIgnoreCase("sim"));
	}

}
