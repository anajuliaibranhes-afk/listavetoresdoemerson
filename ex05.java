package prjlista04;

public class ex05 {

	public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};

        System.out.println("Vetor invertido:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}

