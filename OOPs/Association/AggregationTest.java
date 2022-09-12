package Association;

public class AggregationTest   {
	
	Operation op;
	double area (int radius)
	{
		double pi = 3.142;
		op = new Operation();
		double res;
		res = pi*op.square(radius);
		return res;
	}
	
	public static void main(String[] args) {
		AggregationTest agt = new AggregationTest();
		double area = agt.area(25);
		System.out.println("Area of circle is : " + area);
	}
	
}
