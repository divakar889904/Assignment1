package com.assesment;


import java.util.*;
public class Assesment8 {

	public static void main(String[] args) {
		String names[][]=new String[2][3];
		System.out.println("Enter the Elements");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
			for(int j=0;j<3;j++) {
				names[i][j]=sc.nextLine();
				if(names[i][j]=="") {
					System.out.println("NULL");
					sc.close();
					System.exit(0);
					
				}
			}
	}

}