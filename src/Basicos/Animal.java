package Basicos;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String n1 = entrada.next();
		String n2 = entrada.next();
		String n3 = entrada.next();

		if (n1.equals("vertebrado")) {
			if (n2.equals("ave")) {
				if (n3.equals("carnivoro")) {
					System.out.print("aguia\n");
				} else {
					System.out.print("pomba\n");
				}
			} else if (n2.equals("mamifero")) {
				if (n3.equals("onivoro")) {
					System.out.print("homem\n");
				} else {
					System.out.print("vaca\n");
				}
			}
		}

		if (n1.equals("invertebrado")) {
			if (n2.equals("inseto")) {
				if (n3.equals("hematofago")) {
					System.out.print("pulga\n");
				} else {
					System.out.print("lagarta\n");
				}
			}
			else if (n2.equals("anelideo")) {
				if (n3.equals("hematofago")) {
					System.out.print("sanguessuga\n");
				} else {
					System.out.print("minhoca\n");
				}
			}
		}

		entrada.close();
	}

}
