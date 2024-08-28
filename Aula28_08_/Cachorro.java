package Aula28_08_;

public class Cachorro extends Animals02 {
	
	@Override
	public void dorme() {
		System.out.println("dormindo;");
	}

	@Override
	public void caminha() {
		System.out.println("caminhando;");
	}

	@Override
	public void corre() {
		System.out.println("correndo;");
	}

	@Override
	public void emitirSom() {
		System.out.println("late;");
	}

}



