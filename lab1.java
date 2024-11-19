//corresponds with DLLemployee
//creating double linked list

import java.util.Scanner;

public class lab1 
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// Create a DLL
		DoublyLinkedListINT employees = new DoublyLinkedListINT();
		
		// Display size
		System.out.println("List size: " + employees.size() );
		System.out.println("Adding 5 employees");
		
		// Add some data
		employee e1 = new employee ("Ian", 100);
		employees.addLast(e1);
		
		employee e2 = new employee ("Josh", 100);
		employees.addLast(e2);
		
		employee e3 = new employee ("Sabrina", 100);
		employees.addLast(e3);
		
		employee e4 = new employee ("Angela", 100);
		employees.addLast(e4);
		
		employee e5 = new employee ("Greg", 100);
		employees.addLast(e5);
		
		//print list
		for(int i=0; i<employees.size(); i++)
		{
			employee emp = employees.removeFirst();
			System.out.println(emp.getName());
			System.out.println(emp.getPay());
			
			employees.addLast(emp);
		}
		
		
		/*
		//give all employees a raise
		for(int i=0; i<employees.size(); i++)
		{
			employee emp = employees.removeFirst();
			emp.setPay(emp.getPay()*1.1);

			employees.addLast(emp);
		}
		
		
		
		//print list again
		
		
		
		//find highest paid employee
		
		
		
		//remove employee
		*/
	}
}