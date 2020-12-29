package application;

import java.util.Locale;
import java.util.Scanner;

import java.util.ArrayList;
import entities.Employee;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int x = sc.nextInt();
		Employee[] vector = new Employee[x];
		Employee[] e = new Employee[x];
		
		String id;
		String name = null;
		float salary;
		
		List<String> listName = new ArrayList<>();
		List<String> listId = new ArrayList<>();
		List<Float> listSalary = new ArrayList<>();
		List<Employee> listEmployee = new ArrayList<>();
		
		//Input e Output inicial
		for (int i = 0; i<vector.length; i++) {
			System.out.println("Employee #:" + (i+1));
			e[i] = new Employee();
			
			System.out.println("ID: ");
			id = sc.next();
			if (listId.indexOf(id) < 0) {
				e[i].setId(id);
				listId.add(e[i].getId());
			}else {
				System.out.println("O ID informado já existe. ");
				//System.exit(0);
			}
			
			System.out.println("Name: ");
			sc.next();
			name = sc.nextLine();
			e[i].setName(name);
			listName.add(e[i].getName());
			
			System.out.println("Salary: ");
			salary = sc.nextFloat();
			e[i].setSalary(salary);
			listSalary.add(e[i].getSalary());
			
			listEmployee.add(e[i]);
			
			}
		
		
		
		
		//Adicionando os vetores a listas para reaproveitar o código
		/*
		for (int i = 0; i<vector.length; i++) {
			listName.add(e[i].getName());
			listId.add(e[i].getId());
			listSalary.add(e[i].getSalary());
		}*/ //O código acima foi movido para o INPUT e OUTPUT inicial
		
		//Input e Output médio
		for (int i = 0; i<1; i++) {
			System.out.println("Enter the employee id that will have salary increase: ");
			id = sc.next();
			if (listId.indexOf(id) < 0) {
				System.out.println("Esse ID não existe");
				//System.exit(0);
			}
			
			int id2 = listId.indexOf(id);
			//System.out.println(id2);
			
			System.out.println("Enter the percentage");
			salary = sc.nextFloat();
			e[id2].upSalary(salary);
			
		}
		
		//Fim
		for (int i = 0; i<vector.length; i++) {
			System.out.println(e[i].toString());
		}
		
		
		sc.close();
	}
}