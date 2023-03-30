package studio7;

public class Die {
	
	private int numSides;
	
	public Die(int initNumSides) {
		numSides = initNumSides;
	}
	
	public Die() {
		numSides = 0;
	}
	
	public int getNumSides() {
		return numSides;
	}
	
	public void setNumSides(int newNumSides) {
		numSides = newNumSides;
	}
	
	public String toString() {
		return "Number of Sides is " + numSides; 
	}
	
	public int thrown() {
		return (int) (Math.random()*numSides + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die d1 = new Die(6);
		Die d2 = new Die();
		d2.setNumSides(3);
		
		
		for (int i = 0; i < 20; i++) {
			System.out.println(d1.thrown());
		}
		
		for (int i = 0; i < 20; i++) {
			System.out.println(d2.thrown());
		}
		
	}

}
