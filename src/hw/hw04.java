package hw;
import java.util.*;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int n=src.nextInt();
			float sum=0;
			for(float i=1;i<n;i++)
			{
				sum=sum+1/((2*i-1)*(2*i));
			}
			System.out.print(sum);
	}

}
