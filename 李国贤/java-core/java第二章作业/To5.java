import java.util.Scanner;
public class To5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("�����һ������a ����Сʱ");
		int a=input.nextInt();
		int b=a/24;
		int c=a%24;
		System.out.println("����"+b+","+"ʣ��Сʱ"+c);

	}
}