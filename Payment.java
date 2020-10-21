package assignSE;

import java.util.Scanner;

public class Payment {
	 private String cardType;
	 private int cardNo;
	 private String Custname;
	private int codeNo;
	
	void setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter payment info:");
		cardType = sc.next();
		cardNo= sc.nextInt();
		Custname= sc.next();
		codeNo= sc.nextInt();

	}
		
		void display()
		{
			System.out.println(" Details are as follows:");	
			System.out.println(cardType+" "+cardNo+" "+Custname+" "+codeNo );
		
	  }

}



