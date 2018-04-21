public class Animal{
	private float height;
	private float weight;
	
	Animal(){
		System.out.println("Constructor of superclass Animal!");
	}
	
	public void setHeight(float height) {
		this.height = height;
	}
	
	public float getHeight() {
		return this.height;
	}
	
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public float getWeight() {
		return this.weight;
	}
	
	public void sound(){
	    System.out.println("Animal is making a sound");   
	}
}