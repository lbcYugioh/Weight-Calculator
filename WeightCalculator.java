public class WeightCalculator
{
	public static void main(String[] args)
	{
		double w = Double.parseDouble(args[0]);
		System.out.println("Earth:" + w);
		printPlanet(w, 0.38, "Mars");
		printPlanet(w, 2.36, "Jupiter");
		printPlanet(w, 0.91, "Venus");
		printPlanet(w, 1.06, "Saturn");
	}
	public static void printPlanet(double earth, double factor, String planet)
	{
		double weight = earth * factor;
		System.out.println(planet + "; " + weight);
	}
}