
public class Decorator extends Soldado {
	
	private Soldado soldado;
	
	public Decorator(Soldado soldado) {
		this.soldado = soldado;
	}

	
	@Override
	public void showGuns() {
		this.soldado.showGuns();
		
	}

}
