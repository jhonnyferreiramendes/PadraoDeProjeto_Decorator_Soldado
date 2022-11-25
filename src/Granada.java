
public class Granada extends Decorator {

	public Granada(Soldado soldado) {
		super(soldado);
		
	}
	public void showGuns() {
		super.showGuns();
		System.out.print("Granada: ");
		
	}
	
	

}
