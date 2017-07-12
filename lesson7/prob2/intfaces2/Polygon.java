package labs.lab7.prob2.intfaces2;

public interface Polygon extends ClosedCurve{
	 
	public double[] getSides();
	
	public default double computePerimeter() {
		
		if(getSides().length == 0) return 0.0;
		
		double perimeter = 0;
		double[] sides = getSides();
		
		for(int i=0; i<sides.length; i++) {
			perimeter = perimeter + sides[i];
		}
		
		return perimeter;
	}

}
