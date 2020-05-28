package Basicos;

import java.util.Scanner;

public class RestoDaDivisao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int x = entrada.nextInt();
		int y = entrada.nextInt();

		if (x > y) {
			for (int i = y + 1; i < x; i++) {
				if (i % 5 == 2 || i % 5 == 3) {
					System.out.print(i+"\n");

				}
			}
		}
		if (x < y) {
				for (int i = x + 1; i < y; i++) {
					if (i % 5 == 2 || i % 5 == 3) {
							System.out.print(i+"\n");
						}
					}
				}
			
			entrada.close();
		}

	}


