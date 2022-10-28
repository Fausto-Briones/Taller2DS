package LSP;

public class Client {
	public static void main(String[] args) {
		
		AvesVoladoras pj = new AvesVoladoras();
		Avestruz av = new Avestruz();
		pj.volar();
		//Ahora avestruz no puede acceder a volar, evitando errores
		
	}
}
