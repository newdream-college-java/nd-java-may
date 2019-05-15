import java.util.Scanner;

public class Test01{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int sum=0;
		int x=1;
		while(x<=5){
			int a=input.nextInt();
			x++;
			sum=a+sum;
		}
		System.out.println("ºÍµÈÓÚ"+sum);
	}
}