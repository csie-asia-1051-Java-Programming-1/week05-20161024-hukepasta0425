package ex;

/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 1050210XX 周永振老師
 */
import java.util.*;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = src.nextInt();

		}
			int max=0;
			int m=0;	
			int sum=0;
			
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(data[k]>max)
				{
					max=data[k];
					m=k;
				}
			}
			sum=max;
			data[m]=-1;
			max=0;
					m=0;
					System.out.print(sum);
		}
			
			
			
//		int a = 0;
//
//		for (int j = 0; j < n; j++) {
//			if (data[(j + 1)] > data[j] ) {
//				a = data[j];
//				
//				data[j] = data[(j+1)];
//				
//				data[(j+1)] = a;
//
//			} else {
//			j=n;
//			}
//
//		}
//		for (int k = 0; k < n; k++) {
//			System.out.println(data[k]);
//		}

	}
}
