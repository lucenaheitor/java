package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner tc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		System.out.print("Enter  department's name: ");
		String departmentName = tc.nextLine();
		System.out.print("  Enter work data: ");
		System.out.print("Name: ");
		String workerName = tc.nextLine();
		System.out.print("Level: ");
		String workerLevel = tc.nextLine();
		System.out.print("Bse Salary: ");
		double baseSalary = tc.nextDouble();
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,  new Department(departmentName));
		
		
		System.out.print("How many contracts to this worker: ");
		int n = tc.nextInt();
		
		for(int i = n; i <=n; i++) {
			System.out.println("Enter  contract #" + i + " data:");
			System.out.print("DD/MM/YYYY: ");
			Date contractDate = sdf.parse(tc.next());
			System.out.print("Value per hour: ");
			double valuePerHour = tc.nextDouble();
			System.out.print("Duration(huor): ");
			int hour = tc.nextInt();
			
				HourContract contract = new HourContract(contractDate, valuePerHour, hour);
				
				
			worker.addContract(contract);	





			
		}
		


		
		
		
		tc.close();

	}

}
