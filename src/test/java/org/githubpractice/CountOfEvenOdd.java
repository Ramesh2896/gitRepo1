package org.githubpractice;

import java.util.Scanner;

public class CountOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		int even=0;
		int odd=0;
		while(num>0)
		{
			 int rem=num%10;//4 3 2 1
			if(num%2==0)
			{
				
				even++;
			}
			else
			{
				odd++;
			}
		
		
		num=num/10;//123 12 1 0
		}
		System.out.println("count of even is:"+even);
		System.out.println("count of odd is:"+odd);
	}

}
