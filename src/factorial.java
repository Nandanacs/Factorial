import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		int n,fact=1;
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number");
		n=scanner.nextInt();
		for(int i= 1; i<= n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+n +" is " +fact);
	}

}
