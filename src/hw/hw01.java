package hw;

import java.util.Scanner;

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		for(int i=1;i<=n;i++)
		{
		for(int j=1;j<=n;j++)
		{
			System.out.print("*");
		}
		System.out.println("");		
		}
	}

}
