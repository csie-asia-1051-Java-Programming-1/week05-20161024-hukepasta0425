package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src=new Scanner(System.in);
		int n=src.nextInt();
		int sum=1;
		while(n>0)
		{
			sum=sum*n;
			n--;
		}
		System.out.print(sum);
	}

}
