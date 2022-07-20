package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.service.BrasilTaxService;
import model.service.RentalServices;

public class Program {

	public static void main(String[] args)  throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy HH:ss");
		
		System.out.println("Enter rental data: ");
		System.out.print("Car model: ");
		String carModel = sc.nextLine();
		System.out.print("Pickup (dd/MM/yyyy hh: ss): ");
		Date start = sdf.parse(sc.nextLine());
		System.out.print("Return (dd/MM/yyyy hh:ss)");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental cr = new CarRental(start, finish,  new Vehicle(carModel));
		
		System.out.println("Enter price per hour: ");
		double pricePerHour =  sc.nextDouble();
		System.out.println("Enter price per day: ");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalService = new RentalServices(pricePerDay, pricePerHour,  new BrasilTaxService());
		
		rentalService.processInvoice(cr);
		
		System.out.println("IVOICE: ");
		System.out.println("Bsic payment: " + String.format("%2f", cr.getInvoice().getBasicPayment()));
		System.out.println("Tax: " + String.format("%2f", cr.getInvoice().getTax()));
		System.out.println("Total payment: " + String.format("%2f", cr.getInvoice().getTotalPayment()));


		sc.close();
	}

}