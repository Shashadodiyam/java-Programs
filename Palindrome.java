import java.util.*;
class Palindrome {
    public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=0;i<n-1;i++){
            for(int j=n-1;j>0;j--){
                if(i==j){
                    System.out.println("palindrome");
				}
                else
                System.out.println("not a palindrome");
            }
        }
    }
}