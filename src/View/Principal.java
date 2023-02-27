package View;

import controller.controller;

public class Principal {
	public static void main (String args[]) {
		controller par = new controller();
		int [] vetor = {2,0,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int tamanho = vetor.length;
	    int pares = par.pares(vetor, tamanho);
		System.out.println("A quantidade de numeros pares é: " +pares);
		
		
	}
}
