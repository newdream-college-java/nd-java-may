/*
����һ�������������ж���������ٸ�Сʱ
*/
import java.util.Scanner;
public class C{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt(),b,c;
		//������
		b = a / 24;
		//��Сʱ
		c = a %24;
		System.out.println(b+"����"+c+"��Сʱ");
	}

}