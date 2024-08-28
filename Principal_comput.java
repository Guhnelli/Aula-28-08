package Aula28_08;

public class Principal_comput {

	public static void main(String[] args) {
		
		Gamer gamer01 = new Gamer();
		Home home01 = new Home();
		Work work01 = new Work();
		
		System.out.println("-----[objeto]------");
		gamer01.ligar();
		gamer01.reiniciar();
		gamer01.desligar();
		gamer01.carregandoSistema();
		
		System.out.println("-----[objeto]------");
		home01.ligar();
		home01.reiniciar();
		home01.desligar();
		home01.carregandoSistema();
		
		System.out.println("-----[objeto]------");
		work01.ligar();
		work01.reiniciar();
		work01.desligar();
		work01.carregandoSistema();
		
		


	}

}
