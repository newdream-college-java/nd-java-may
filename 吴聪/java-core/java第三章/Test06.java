/*
����һ��int�����ݣ��ж��������ż������������
*/
import java.util.Scanner;
public class Test06{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("����һ������:");
		int a = in.nextInt();
		if(a%2==0){
			System.out.print(a+"��ż��");
		}else{
			System.out.print(a+"������");
		}
	}
}