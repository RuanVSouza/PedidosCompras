package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities_enum.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		//Formatações
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		//Começando programa com o cliente
		System.out.println("Enter client data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("email: ");
		String email = sc.nextLine();
		
		System.out.print("BirthDay (DD/MM/YYYY) : ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status:");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(),status,client);
		
		//Quantidade de itens
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		
		for(int k=1; k<=n; k++) {
			System.out.println("Enter #" + k + " item data:");
			System.out.print("Product name:");
			String productName = sc.next();
			
			System.out.print("Product price: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addOrderItem(it);
			
		}
		
		System.out.println();
		System.out.println(order);
		
		
		
		
		
		
		sc.close();

	}

}
