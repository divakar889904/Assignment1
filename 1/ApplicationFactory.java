package com.assesment;

//Program for Question 1
import java.util.*;
public class ApplicationFactory {	
	public String fetchApplication(int a){
		String[] app= {"springboot","Microsoft Teams","Eclipse"};
		return app[a];
}
public void applicationDetails(String ans) {
	String[][]app1= {
			{"springboot","Spring Boot is an open source Java-based framework used to create a micro Service."},
			{"Microsoft Teams","Microsoft Teams is a collaboration app that helps your team stay organized and have conversations—all in one place."},
			{"Eclipse","Eclipse is an integrated development environment used in computer programming. It contains a base workspace and an extensible plug-in system for customizing the environment."}
	};
	
	for(int i=0;i<3;i++) {
		if(app1[i][0]==ans)
		System.out.println(app1[i][1]);
	}
}	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int loop=1;
		do {
		System.out.println("Select an option:\n1.springboot\n2.Outlook\n3.Eclipse");
		int opt=sc.nextInt();
		ApplicationFactory af=new ApplicationFactory();
		String ans=af.fetchApplication(--opt);
		af.applicationDetails(ans);
		System.out.println("To exit press 0 //Press any number to continue");
		loop=sc.nextInt();
	}while(loop!=0);
		System.out.println("!!END!!");
		sc.close();
	}

}