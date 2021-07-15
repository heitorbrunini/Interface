package entities;

public abstract class form implements areacalc {
	protected String Nome;
	
	public form(String nome) {
		Nome = nome;
	}

	public String getNome(){return Nome;}
	public void setNome(String nome){Nome=nome;}

}
