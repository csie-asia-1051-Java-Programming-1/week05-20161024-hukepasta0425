package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，以字元 '*' 輸出邊長為 n 的正方形 (請利用迴圈，不要直接用 printf 方式直接輸出)。
 * Date: 2016/10/24
 * Author: 105021031 孟京澤
 */
import java.util.*;
public class ex04 {

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
