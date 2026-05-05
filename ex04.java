package prjlista04;

public class ex04 {

  public static void main(String[] args) {
	  int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8};
	   int pares = 0;

	   for (int i = 0; i < vetor.length; i++) {
	      if (vetor[i] % 2 == 0) {
	                pares++;
	            }
	        }

	     System.out.println("Quantidade de pares: " + pares);
	    }
	}

