package edu.mum.cs.cs390fpp.lab2.exercise7;

import java.util.Random;

public class Prog7 {

	public static void main(String[] args){
		Random rand=new Random();
		
		String output = "";
		output = String.format("%16d %12d %12d %12d %n %n",	rand.nextInt(100),rand.nextInt(100),rand.nextInt(100),rand.nextInt(100));
		output += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+",rand.nextInt(100), "+", rand.nextInt(100) ,"+",rand.nextInt(100),"+",rand.nextInt(100));
		output += String.format("%16s %12s %12s %12s","____", "____","____","____");
		System.out.println(output);
		String output2 = "";
		output2 = String.format("%n %n %n %n" ) +String.format("%16d %12d %12d %12d %n %n", rand.nextInt(100), rand.nextInt(100),rand.nextInt(100),rand.nextInt(100));
		output2 += String.format("%13s %2d %9s %2d %9s %2d %9s %2d %n","+",rand.nextInt(100), "+", rand.nextInt(100) ,"+",rand.nextInt(100),"+",rand.nextInt(100));
		output2 += String.format("%16s %12s %12s %12s","____", "____","____","____");
		System.out.println(output2);
	}

}
