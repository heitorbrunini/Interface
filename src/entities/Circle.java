package entities;

public class Circle extends form implements areacalc{
	private Double raio;
	
	public Circle(String nome, Double raio) {
		super(nome);
		this.raio = raio;
	}
	
	public final double  pi = 3.14;
	
	@Override
	public Double getArea() {
		Double area = raio * raio * pi;
		return area;
	}
	
	
}
