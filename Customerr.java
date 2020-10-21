package assignSE;
import java.util.Scanner;
public class Customerr {
	

	
		  private String name;
		 private String email;
		 private int Cid;
		private String address;
		
		void setData()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter customers info:");
			name = sc.nextLine();
			email= sc.nextLine();
			Cid= sc.nextInt();
			address= sc.next();

		}
			
			void display()
			{
				System.out.println(" Details are as follows:");	
				System.out.println(name+" "+email+" "+Cid+" "+address );
			
		  }

	}

