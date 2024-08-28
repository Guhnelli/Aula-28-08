package Aula28_08;

public class Principal_Veiculo {

	public static void main(String[] args) {

		Carros Car = new Carros ();
		Onibus Bus = new Onibus ();

		System.out.println(" CAR ");
		Car.acelerar();
		Car.frear();
		Car.virar();
		Car.ligar();

		System.out.println(" BUS ");
		Bus.acelerar();
		Bus.frear();
		Bus.virar();
		Bus.ligar();

	}

}
