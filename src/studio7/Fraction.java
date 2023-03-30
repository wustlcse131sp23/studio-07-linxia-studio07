package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	
	public Fraction(int initN, int initD) {
		numerator = initN;
		denominator = initD;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public String toString() {
		return numerator + "/" + denominator; 
	}
	
	public Fraction add(Fraction f) {
		int newD = this.denominator*f.getDenominator();
		int newN = this.denominator*f.getNumerator() + this.numerator*f.getDenominator();
		Fraction f2 = new Fraction(newN,newD);
		return f2.simplify();
	}
	
	public Fraction multiply(Fraction f) {
		Fraction f2 = new Fraction(this.numerator*f.getNumerator(),this.denominator*f.getDenominator());
		return f2.simplify();
	}
	
	public Fraction reciprocal() {
		Fraction f2 = new Fraction(denominator,numerator);
		return f2;
	}
	
	public Fraction simplify() {
		int n = this.getNumerator();
		int d = this.getDenominator();
		
		int f = findLargestFactor(n,d);
		
		n = n/f;
		d = d/f;
		
		Fraction f2 = new Fraction(n,d);
		return f2;
		
	}
	
	private int findLargestFactor(int n1, int n2) {
		int m;
		if (n1 < n2) {
			m = n1;
		} else {
			m = n2;
		}
		for (int i = m; i > 1; i--) {
			if (n1%i == 0 && n2%i == 0) {
				return i;
			}
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f = new Fraction(72,180);
		Fraction f2 = new Fraction(3,10);
		System.out.println(f.simplify());
		System.out.println(f.add(f2));
		System.out.println(f.multiply(f2));
		System.out.println(f2.reciprocal());

	}

}
