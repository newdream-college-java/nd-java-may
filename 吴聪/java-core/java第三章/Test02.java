/*
����һ����ݣ��ж������껹��ƽ�꣺
1.�ܱ�4�����Ҳ��ܱ�100����Ϊ����
2.�ܱ�400�����������꣨�����꣩
*/
import java.util.Scanner;
public class Test02{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		System.out.print("��������ݣ�");
		int a = in.nextInt();
		if( a%4==0&&a%100!=0||a%400==0 ){
			System.out.println(a+"��������");
		}else{
			System.out.println(a+"����ƽ��");
		}
	}
}