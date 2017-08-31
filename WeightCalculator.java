public class WeightCalculator
{
	public static void main(String[] args)
	{
		double W = Double.parseDouble(args[0]);
		double M = W * 0.38;
		double J = W * 2.36;
		double V = W * 0.91;
		double S = W * 1.06;
		System.out.println("Earth:" + W);
		System.out.println("Mars:" + M);
		System.out.println("Jupiter:" + J);
		System.out.println("Venus:" + V);
		System.out.println("Saturn:" + S);
	}
}