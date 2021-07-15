package application;

import entities.Circle;
import entities.Quadrado;
import entities.form;

public class program {

	public static void main(String[] args) {
		double raio = 2;
		String namec = "04";
		form circulo = new Circle(namec,raio);
		System.out.println(circulo.getNome());
		System.out.println(circulo.getArea());
		
		double lado = 2;
		String nameq = "05";
		form quadrado = new Quadrado(nameq,lado);
		System.out.println(quadrado.getNome());
		System.out.println(quadrado.getArea());

	}

}
