/*
����һ������n��ͳ��1��n���ж��ٸ�������ż��
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("������һ��������");
		int num = input.nextInt();
		int m=0,n=0;
		for(int i = 1;i<=num;i++){
			if(i%2==0){
				m++;
			}
			else{
				n++;
			}
		}
		System.out.println("��1��"+num+"����"+m+"��ż��");
		System.out.println("��1��"+num+"����"+n+"������");
	}
}