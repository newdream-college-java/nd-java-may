import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input = new  Scanner(System.in);
		System.out.print("�������һ����ֵ��");
		double num1 = input.nextDouble();
		System.out.print("������ڶ�����ֵ��");
		double num2 = input.nextDouble();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
	//	System.out.print(d);
	//	System.out.println(num1+num2);
		System.out.printf("%f, %f",num1,num2);
	}
}