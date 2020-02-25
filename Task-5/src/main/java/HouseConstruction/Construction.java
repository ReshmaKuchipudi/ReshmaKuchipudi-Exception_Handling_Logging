package HouseConstruction;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

import Interest1.Interest;

public class Construction {
	public Construction()
	{
		final Logger lOGGER = Logger.getLogger(Interest.class.getName());
		Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
		print.println("Enter your choice of materials\n1.Standard materials\n2.Above Standard materials\n3.High Standard material");
		try {
			int choice =scan.nextInt();
			if(choice==1 ||choice==2 ||choice==3)
			{
				print.println("Enter total area of house(in sq_feets)");
				int square_feet=scan.nextInt();
				if(choice==1)
				{
					print.println("Cost of the house is Rs."+(1200*square_feet));
				}
				else if(choice==2)
				{
					print.println("Cost of the house is Rs."+(1500*square_feet));
				}
				else if (choice==3)
				{
					print.println("Do you want fully automated house?Yes/No:");
					try {
						String ch=scan.next();
						if(ch.equals("Yes") ||ch.equals("No"))
						{
							if (ch.equals("Yes"))
								print.println("Cost of the house is Rs."+(2500*square_feet));
							else if (ch.contentEquals("No"))
								print.println("Cost of the house is Rs."+(1800*square_feet));
						}
						else
						{
							throw new Exception();
						}
					}
					catch(Exception a)
					{
						lOGGER.warning("Please enter Yes/No ");
					}
				}
			}
			else
			{
				throw new Exception();
			}
		}
		catch(Exception e )
		{
			lOGGER.warning("Please enter the valid choices");
		}
	}

}
