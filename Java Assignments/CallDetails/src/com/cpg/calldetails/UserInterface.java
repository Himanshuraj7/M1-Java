package com.cpg.calldetails;

import java.util.Scanner;

public class UserInterface {
	
public static void main(String [] args) {
	
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	Scanner sc1=new Scanner(System.in);
	long calledNumber=sc1.nextLong();
	
	Call call=new Call();
	call.parsedata(input);
	
	CallHistory callhistory=new CallHistory();
	callhistory.addCal(call);
	
	System.out.println(callhistory.findTotalDuration(calledNumber));
	
	sc.close();
	sc1.close();
}
}
