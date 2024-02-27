package controller;

public class MDC
{
	public MDC()
	{
		super();
	}
	
	public int maxDivComum(int a, int b)
	{
		if (a == b)
			return a;
		if (a > b)
			return maxDivComum(a - b, b);
		return maxDivComum(b, a);
	}
}
