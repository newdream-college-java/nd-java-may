import java.util.Scanner;
public class To4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		
		System.out.println("�����һλ����a");
		int a=input.nextInt();
		
		System.out.println("����ڶ�λ����b");
		int b=input.nextInt();
		int c;
		c=b;
		b=a;
		a=c;
		
		System.out.println("a="+a+","+"b="+b);
	}
}