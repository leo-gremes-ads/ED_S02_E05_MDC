package controller;

import java.util.Scanner;

public class ValidaEntrada
{
	public ValidaEntrada()
	{
		super();
	}
	
	public int validaEntrada(String msg, boolean close)
	{
		String num;
		int n;
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print(msg);
			num = s.nextLine();
			try {
				n = Integer.parseInt(num);
			} catch (Exception e) {
				System.out.println("Não é número. Tente novamente");
				continue;
			}
			if (n <= 0) {
				System.out.println("Número deve ser positivo. Tente novamente");
				continue;
			}
			break;
		}
		if (close)
			s.close();
		return n;
	}
}
