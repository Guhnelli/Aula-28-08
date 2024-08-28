package Aula28_08;

public class Carros extends veiculos02 {

	@Override
	public void acelerar() {
		System.out.println("Acelerando;");
	}

	@Override
	public void frear() {
		System.out.println("Freiando;");
	}

	@Override
	public void virar() {
		System.out.println("Virando;");
	}

	@Override
	public void ligar() {
		System.out.println("Ligando.");
	}
}


