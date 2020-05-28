package Basicos;

public class SequenciaIJ3 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i += 2) {
			for (int j = (7 + i) - 1; j > 4 + (i - 1); j -= 1) {
				System.out.printf("I=%d J=%d\n", i, j);
			}
		}

	}

}
