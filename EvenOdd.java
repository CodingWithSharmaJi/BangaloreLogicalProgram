import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n number");
		int n=sc.nextInt();
		int even=0,odd=0;
		for(int i=0;i<=n;i++) {
			if(i%2==0)
				even++;
			else
				odd++;
		}
		System.out.println("Total Even Number Is="+even);
		System.out.println("Total Odd Number Is="+odd);

	}
}
	
