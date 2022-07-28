package mypackage;
import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.*;

public class menu {
	
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int option;
		int suboption;
		System.out.println("Application Developer : siva");
		System.out.println("File Menu Related Application");
		
		
		do
		{
			System.out.println("Choose your option");
			System.out.println("1 - Display the Current File Name");
			System.out.println("2 - Display the user interface");
			System.out.println("3 - Exit");
			option=sc.nextInt();
			switch(option)
			{
			case 1:// you need to write the logic to display the 
					// current file name 
				System.out.println("You are in Case 1");
				Iterable<Path> dirs = FileSystems.getDefault().getRootDirectories();
				for (Path name: dirs) {
				    System.err.println(name);
				}
				break;
			case 2: //you need to write the logic to display the user
					//interface to perform various operations of file
				System.out.println("You are in Case 2");
				System.out.println("Choose the operation to do...");
				System.out.println("11 - Add File");
				System.out.println("12 - Delete File");
				System.out.println("13 - Search File");
				System.out.println("14 - Back to Main Menu");
				suboption=sc.nextInt();
				switch(suboption)
				{
				case 11:
					// you need to write a logic to add a file
				case 12:
					// you need to write a logic to delete a file
				case 13: 
					// you need to write a logic to search a file
				case 14:
					// you need to write a logic to return to main menu
				}
				break;
			case 3: 
				System.out.println("You are in Case 3");
				return;
			
			}
			
		}while(true);
	}
	

}

