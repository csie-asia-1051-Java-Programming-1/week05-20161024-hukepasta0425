package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+Math.pow(2,i);
					
		}
		System.out.print(sum);
	}

}
