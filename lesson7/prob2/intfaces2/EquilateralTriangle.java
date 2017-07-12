package labs.lab7.prob2.intfaces2;

public class EquilateralTriangle implements Polygon {
	private double side;
	
	public EquilateralTriangle(double side) {
		this.side = side;
		
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public double[] getSides() {
		double[] sides = {this.side, this.side, this.side};
		return sides;
	}


}
