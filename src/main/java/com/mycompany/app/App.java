package com.mycompany.app;

import com.github.tomaslanger.chalk.Chalk;

public class App 
{
    public static void main( String[] args )
    {
    	//Printer p = new Printer();
    	//p.print("Printing");
    	System.out.println("This message is " + Chalk.on("IMPORTANT").red().underline());
    }
}
