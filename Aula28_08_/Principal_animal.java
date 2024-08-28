package Aula28_08_;

public class Principal_animal {

	public static void main(String[] args) {

		Galo galo = new Galo();
		lobo02 lobo = new lobo02 ();
		Leao leao = new Leao ();
		Tigre tigre = new Tigre();
		Cachorro cachorro = new Cachorro();
		
		System.out.println("-----[objeto]-----");
		System.out.println("-------Lobo-------");
		lobo.setNome("luke");
		lobo.setSexo("Masculino");
		lobo.setRaca("Lobo-Cinzento");
		lobo.dorme();
		lobo.caminha();
		lobo.corre();
		lobo.emitirSom();
		
		System.out.println(lobo.getNome());
		System.out.println(lobo.getSexo());
		System.out.println(lobo.getRaca());
		
		System.out.println("-----[objeto]-----");
		System.out.println("-------Leão-------");
		leao.setNome("Liteo");
		leao.setSexo("Masculino");
		leao.setRaca("Leão-Albino");
		leao.dorme();
		leao.corre();
		leao.caminha();
		leao.emitirSom();
		
		System.out.println(leao.getNome());
		System.out.println(leao.getSexo());
		System.out.println(leao.getRaca());
		
		System.out.println("-----[objeto]-----");
		System.out.println("------Tigre======");
		tigre.setNome("Tor");
		tigre.setSexo("Masculino");
		tigre.setRaca("Tigre dente de sabre");
		tigre.dorme();
		tigre.corre();
		tigre.caminha();
		tigre.emitirSom();
		
		System.out.println(tigre.getNome());
		System.out.println(tigre.getSexo());
		System.out.println(tigre.getRaca());
		
		System.out.println("-----[objeto]-----");
		System.out.println("-----Cachorro-----");
		cachorro.setNome("Pandora");
		cachorro.setSexo("Femea");
		cachorro.setRaca("Pug");
		cachorro.dorme();
		cachorro.corre();
		cachorro.caminha();
		cachorro.emitirSom();
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getSexo());
		System.out.println(cachorro.getRaca());
		
		
		System.out.println("-----[objeto]-----");
		System.out.println("------Galo------");
		galo.setNome("Felipe");
		galo.setSexo("Masculino");
		galo.setRaca("Galizé");
		galo.dorme();
		galo.corre();
		galo.caminha();
		galo.emitirSom();
		
		System.out.println(galo.getNome());
		System.out.println(galo.getSexo());
		System.out.println(galo.getRaca());
		System.out.println("");
	}
}

