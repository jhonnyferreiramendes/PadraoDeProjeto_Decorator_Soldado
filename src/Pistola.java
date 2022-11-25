
public class Pistola extends Decorator{

	public Pistola(Soldado soldado) {
		super(soldado);
		// TODO Auto-generated constructor stub
	}
	
	public void showGuns() {
		super.showGuns();
		System.out.print("Pistola: ");
		
	}

}
