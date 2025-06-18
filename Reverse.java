import java.util.*;
public class Reverse{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		int rev=0;
		while(n>0){
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		System.out.print(rev);
	}
}

