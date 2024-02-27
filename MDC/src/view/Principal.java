package view;

import controller.MDC;
import controller.ValidaEntrada;

public class Principal
{
	public static void main(String[] args)
	{
		int x, y, m;
		MDC mdc = new MDC();
		ValidaEntrada ve = new ValidaEntrada();
		
		x = ve.validaEntrada("Digite um número: ", false);
		y = ve.validaEntrada("Digite outro número: ", true);
		m = mdc.maxDivComum(x,  y);
		System.out.println("O Máximo divisor comum é: " + m);
	}
}