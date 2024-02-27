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
		
		x = ve.validaEntrada("Digite um n�mero: ", false);
		y = ve.validaEntrada("Digite outro n�mero: ", true);
		m = mdc.maxDivComum(x,  y);
		System.out.println("O M�ximo divisor comum �: " + m);
	}
}