package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pessoa p;
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Numero de pessoas: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Fisica ou juridica (F/J): ");
			char resp = sc.next().toUpperCase().charAt(0);
			if (resp == 'F') {
				System.out.println("Imposto pessoa fisica #" + (i + 1) + ":");
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.print("Renda anual: R$ ");
				Double renda = sc.nextDouble();
				
				if(renda > 20000.0) {
				
				System.out.print("Valor do plano: ");
				Double saude = sc.nextDouble();

				p = new Fisica(nome, renda, saude);
				list.add(p);
				}
				else {
					p = new Fisica(nome, renda);
					list.add(p);
				}
			}
			if (resp == 'J') {
				System.out.println("Imposto pessoa juridica #" + (i + 1) + ":");
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();

				System.out.print("Renda anual: R$ ");
				Double renda = sc.nextDouble();

				System.out.print("Numero de funcionarios: ");
				int x = sc.nextInt();

				p = new Juridica(nome, renda, x);
				list.add(p);
			}
			System.out.print("");
		}

		Double soma = 0.0;
		for (Pessoa l : list) {
			System.out.println(l);
			soma += l.calculoImposto();
		}
		System.out.println("Total impostos: " + String.format("%.2f", soma));

		sc.close();
	}

}
