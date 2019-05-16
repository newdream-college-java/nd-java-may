import java.util.Scanner;
public class To7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入两个整数:");
		int a=input.nextInt();
		int b=input.nextInt();
		System.out.println("请输入运算符号:+,-,*,/");
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
				System.out.println("输入错误");
		}
		System.out.println("计算的结果为"+sum);

}
}