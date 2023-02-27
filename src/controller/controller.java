package controller;

public class controller {

	public controller() {
 super ();
	}
public int pares(int [] vetor, int tamanho) {
	if(tamanho == 0) {
		return 0;		
	}
	else {
		int ultimo = vetor [tamanho -1];
		int quantpar = ultimo % 2 == 0 ? 1 : 0;
		return quantpar + pares (vetor, tamanho - 1);
	}
}
}
