package Aula28_08;


public class Calculadora implements Calculos{
	
	@Override
	public double somar() {
		return 12+8;
	}

	@Override
	public double sub() {
		return 52-9;
	}

	@Override
	public double mult() {
		return 15*2;
	}

	@Override
	public int div() {
		return 25/5;
	}

	@Override
	public int exp() {
		return 2^5;
	}
	
	
	
	

}
