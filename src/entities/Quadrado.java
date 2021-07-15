package entities;

public class Quadrado extends form implements areacalc{
	private Double lado;
	
	public Quadrado(String nome, Double lado) {
		super(nome);
		this.lado = lado;
	}
	
	public final double  pi = 3.14;
	
	@Override
	public Double getArea() {
		Double area = lado * lado ;
		return area;
	}
	
	
}
