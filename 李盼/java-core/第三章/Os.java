/*
�ж�һ�����ǲ���ż��
*/
import java.util.Scanner;
public class Os{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		if(a%2==0)
			System.out.println("���Ǹ�ż��");
		else
			System.out.println("���Ǹ�����");
	}
}