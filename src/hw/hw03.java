package hw;
import java.util.*;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner src=new Scanner(System.in);
			int n=src.nextInt();
			int sum=n,i=1;;
			while(true)
			{
				if(sum<10000)
				{
					sum=sum*n;
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.print(i);
	}

}
