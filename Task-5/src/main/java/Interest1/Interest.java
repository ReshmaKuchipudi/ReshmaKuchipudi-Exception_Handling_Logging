package Interest1;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Logger;

public class Interest
{
	private static final Logger LOGGER = Logger.getLogger(Interest.class.getName());
	public Interest()
	{
        LOGGER.info("Logger Name: "+LOGGER.getName());
	    Scanner scan = new Scanner(System.in);
		PrintStream print = new PrintStream(new FileOutputStream(FileDescriptor.out));
	    print.println("Enter your choice\n1.Simple interest\n2.Compound interest");
	    try {
	    	int choice =scan.nextInt();
	    	if(choice==1 || choice==2)
	    	{
	    		print.println("Enter principal amount:");
	    		double principal_amount=scan.nextInt();
	    		print.println("Enter rate of interest:");
	    		double rate =scan.nextInt();
	    		print.println("Enter time (in years):");
	    		int time=scan.nextInt();
	    		if(choice==1)
	    		{
	    			print.println("Simple interest of the amount "+principal_amount+" is Rs."+(principal_amount*time*rate)/100);
	    		}
	    		else if(choice==2)
	    		{
	    			print.println("Compound interest of the amount "+principal_amount+" is Rs."+(principal_amount*Math.pow((1+rate/100),time)));
	    		}
	    	}
	    	else
	    	{
	    		throw new Exception();
	    	}
	    }
	    catch(Exception e)
	    {
	    	LOGGER.warning("Please select the valid choices");
	    }
	}
}
