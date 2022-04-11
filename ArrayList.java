package Polymorphism;

import java.util.Scanner;

public class ArrayList {
	
	public static void main(String[] args) {
		int n,a,flag=0,i=0;
		System.out.println("enter your elements");
		
		Scanner scanner = new Scanner(System.in);
		n=scanner.nextInt();
		
		int b[]= new int[n];
		
		
		for(i=0;i<n;i++)
		{
			b[i]=scanner.nextInt();
		}
		System.out.println("enter the element you want to find");
		a=scanner.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(b[i]==a)
			{
				flag=1;
		}
			else
			{
				flag=0;
			}
			if(flag==1)
			{
				System.out.println("element find positon");
			}
			else
			{
				System.out.println("element not find");
			}
		}
		
	}

}
