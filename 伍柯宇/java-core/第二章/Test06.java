import java.util.Scanner;

public class Test06{
	public static void main(String[] args){
		System.out.println("������һ����λ����");
		Scanner input = new Scanner(System.in);
		int x=input.nextInt();
		int a=x%10;
		int b=x/10%10;
		int c=x/100%10;
		int y=a*100+b*10+c*1;
		System.out.println(y);
	}
}