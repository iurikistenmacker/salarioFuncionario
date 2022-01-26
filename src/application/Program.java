package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Funcionarios> list = new ArrayList<>();
		
		
		System.out.print("How many emplyoee will be registered? ");
		int N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			System.out.println("Emplyoee #" + i +":");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Funcionarios(id, name, salary));
		}
		
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Funcionarios func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(func == null) {
			System.out.println("this id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double porcentagem = sc.nextDouble();
			func.mudaSalario(porcentagem);
		}
		
		
		System.out.println("List of employees: ");
		for(Funcionarios x : list) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		sc.close();

	}

}
