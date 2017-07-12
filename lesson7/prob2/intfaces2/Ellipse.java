package labs.lab7.prob2.intfaces2;

public class Ellipse implements ClosedCurve {
	private double a;
	private double E;
	
	public Ellipse(double a, double E) {
		this.a = a;
		this.E = E;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getE() {
		return E;
	}

	public void setE(double e) {
		E = e;
	}
	
	@Override
	public double computePerimeter() {
		return (4*a*E);
	}


}
