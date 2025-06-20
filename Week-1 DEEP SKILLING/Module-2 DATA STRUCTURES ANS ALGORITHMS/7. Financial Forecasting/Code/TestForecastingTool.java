package forecastingtool;

public class TestForecastingTool {

	public static void main(String[] args)
	{
		double amt=2000;
		double rate=0.25;
		int years=7;
		double a1=ForecastingTool.Recursion(amt,rate,years);
		System.out.printf("Using Recursion- Predicted Values after %d years:%.2f\n",years,a1);
		double a2=ForecastingTool.Iteration(amt,rate,years);
		System.out.printf("Using Iteration- Predicted Values after %d years:%.2f\n",years,a2);
	}
}
