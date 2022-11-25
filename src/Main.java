
public class Main {
	
	public static void main(String[] args) {
		
		Soldado seal = new Seal();
		Soldado marine = new Marine();
		
		seal = new  Granada(seal);
		seal = new  Pistola(seal);
		seal = new  Granada(seal);
		
		marine = new Pistola(marine);
		marine = new Granada(marine);
		marine = new Faca(marine);
		
		seal.showGuns();
		System.out.println("");
		marine.showGuns();
		
	}

}
