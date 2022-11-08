package start;

import java.util.Scanner;

public class pedraPapelTesoura {

	public static void main(String[]args) {
		int jogador,computador;
		Scanner teclado = new Scanner(System.in);
		System.out.println("---Pedra Papel ou Tesoura---");
		System.out.println("");
		System.out.println("Por favor escolha:");
		System.out.println("");
		System.out.println("1 --> PEDRA <-- ");
		System.out.println("2 --> PAPEL <--");
		System.out.println("3 --> TESOURA <--");
		
		jogador = teclado.nextInt();
		switch(jogador){
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu TESOURA");
			break;
		default:
		System.out.println("---ESCOLHA INCORRETA---");
		System.out.println("---POR FAVOR ESCOLHA 1, 2 OU 3---");
		break;
}
		teclado.close();

		computador = (int)(Math.random() * 3 + 1);
		switch(computador){
		case 1:
			System.out.println("Computador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Computador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Computador escolheu TESOURA");
			break;
		}
		System.out.println("");
		if (jogador == computador) {
			System.out.println("EMPATE");
		}else {
			if ((jogador == 1 && computador == 3)|| (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)){
			System.out.println("PARABENS!!! VOCÊ VENCEU!!!");
			}else{
				System.out.println("COMPUTADOR VENCEU!!!");
				
			}
		}
		
}
}