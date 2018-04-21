public class Car{
	//Here the variables speed and direction are global to the car object’s methods
	//and local to the car object.
	private float speed;
	private String direction = "";
	
	Car(){
		System.out.println("Constructor of Car class!");
	}
	
	public void Gas(){
	    System.out.println("Gas pedal");   
	}
	
	public void breakPedal(){
	    System.out.println("break pedal");   
	}
}