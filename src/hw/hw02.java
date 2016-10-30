package hw;
import java.util.*;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int n=src.nextInt();
			int sum=0,i=1;
			while(n>=sum)
			{
				sum+=i;
				i++;
			}
			System.out.print(i-1);
	}

}
