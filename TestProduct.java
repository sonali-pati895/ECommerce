package assignSE;

import java.util.Scanner;


public class TestProduct {
	public static void main(String[] args) {
		 int id;
		 String name;
		 String descr;
		 double price;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the product info:");
		id= input.nextInt();
		name = input.next();
		descr=input.next();
		price = input.nextDouble();
		
		Product p=new Product( id,  name, descr,  price);
		p.display();
	}
}

  
	
	