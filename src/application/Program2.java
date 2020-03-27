package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();
		double totalTaxes = 0;
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		
		for (int i=1; i<=number; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (type == 'i' ) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		for (TaxPayer payer : list) {
			double tax = payer.valorImposto();
			totalTaxes += tax;
			System.out.println(payer.getNome() + ": $ " + String.format("%.2f", tax));
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + totalTaxes);
		
		sc.close();

	}

}
