package prjlista04;

public class ex01 {

	private static java.util.Scanner sc;

	public static void main(String[] args) {
        int[] vetor = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            sc = null;
			vetor[i] = sc.nextInt();
        }
        System.out.println("Valores digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }
    }
}

