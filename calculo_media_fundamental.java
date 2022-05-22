package jojopose;

import java.util.Scanner;

public class calculo_media_fundamental {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in); // Nosso Scanner que fara a leitura do codigo 
		int i, quantAluno = 0, cod; // nossas variaveis do codigo 
		double media, nota1, nota2, nota3; // nossas variaveis do codigo
		
		for (i = 0; i < 10 ; i++ ) { // For para contagem e repetição do programa
			quantAluno++;
			System.out.printf("Aluno" + quantAluno + ", Digite seu codigo: ");// A inerface que sera exibida para o usario
			cod = ler.nextInt(); //Fara a leitura da String
			
			if (cod!= 0) {
			
			System.out.printf("Aluno" + quantAluno + ", Digite a primeira nota: ");// A inerface que sera exibida para o usario
			nota1 = ler.nextDouble(); //Fara a leitura da String
			
			System.out.printf("Aluno" + quantAluno + ", Digite a segunda nota: ");// A inerface que sera exibida para o usario
			nota2 = ler.nextDouble(); //Fara a leitura da String
			
			System.out.printf("Aluno" + quantAluno + ", Digite a terceira nota: ");// A inerface que sera exibida para o usario
			nota3 = ler.nextDouble(); //Fara a leitura da String
			
			media = ( nota1 + nota2 + nota3 ) / 3; // calculo da media 
			
			if (media<=6) { // estrutura de decisao 
				System.out.printf("Voce foi reprovado! A sua media e: %2f\n", + media); //A inerface que sera exibida para o usario
			}
			else if (media < 8 && media > 6) { // estrutura de decisao
				System.out.printf(" Voce está de recuperação! A sua media e: %2f\n", + media); //A inerface que sera exibida para o usario
			}
			else if (media >= 8) { // estrutura de decisao
				System.out.printf(" Voce foi aprovado, Parabens! A sua media e: %2f\n", + media); //A inerface que sera exibida para o usario
			}
			}else { // estrutura de decisao
				break; // forcar parada do codigo

			}
		}
	}
}

