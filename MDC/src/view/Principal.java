package view;

import java.util.Scanner;
import controller.MDC;

public class Principal
{
	public static void main(String[] args)
	{
		int x, y, m;
		MDC mdc = new MDC();
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		x = s.nextInt();
		System.out.print("Digite outro número: ");
		y = s.nextInt();
		s.close();
		m = mdc.maxDivComum(x,  y);
		System.out.println("O Máximo divisor comum é: " + m);
	}
}