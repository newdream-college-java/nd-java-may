import java.util.Scanner;
public class To7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("��������������:");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("�������������:+,-,*,/");
		String f=input.next();
		int sum=0;
		switch(f){
			case "+":
				sum=a+b;
			break;
			case "-":
				sum=a-b;
			break;
			case "*":
				sum=a*b;
			break;
			case "/":
				sum=a/b;
			break;
			default:
				System.out.println("�������");
		}
		System.out.println("����Ľ��Ϊ"+sum);

}
}