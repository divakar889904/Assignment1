package com.assesment;

 import java.util.*;

 public class Arraylistassesment {

 public static void main(String[] args) {


	System.out.println("Enter number of strings to be printed:");

	
	int i;
	
	   Scanner sc= new Scanner(System.in);
	   
		int n=sc.nextInt();
		String []name= new String[n];
		for(i=0;i<n;i++) {
			name[i]=sc.next();
		}
		
		//String name[]= {"Divakar"," ravi", "peeky","boo"};
		
		
		
		
		
		List<String> str=new ArrayList<String>();
		//str=Arrays.asList(name);
		//System.out.println(str);
		str=Arraytostring(name);
		System.out.println(str);
		
	
	 }
static List<String> Arraytostring(String[] name){
	 List<String> alt=new ArrayList<String>();
	 alt=Arrays.asList(name);
	 return alt;
 }

}
