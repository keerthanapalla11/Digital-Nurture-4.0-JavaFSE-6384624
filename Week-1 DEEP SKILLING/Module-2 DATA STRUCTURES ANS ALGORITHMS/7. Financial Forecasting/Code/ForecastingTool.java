package forecastingtool;

public class ForecastingTool {
	static double Recursion(double initial,double rate,int years)
	{
		if(years==0)
		{
			return initial;
		}
		return (1+rate)*Recursion(initial,rate,years-1);
	}
	static double Iteration(double initial,double rate,int years)
	{
		double ans=initial;
		for(int i=0;i<years;i++)
		{
			ans*=(1+rate);
		}
		return ans;
	}
}
