package prjlista04;

public class ex03 {

	public class Ex3 {
	    public static void main(String[] args) {
	        int[] vetor = {3, 7, 2, 9, 5, 1};
	        int maior = vetor[0];

	        for (int i = 1; i < vetor.length; i++) {
	            if (vetor[i] > maior) {
	                maior = vetor[i];
	            }
	        }

	        System.out.println("Maior valor: " + maior);
	    }
	}
}
