/*
����һ����n��ͳ��1��n��������ż���ĸ�����
*/
import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("������һ������");
		int num = in.nextInt(),a=0,b=0;
		if(num!=0){
			for(int i=0;i<=num;i++){
				if(i%2==0){
					a++;
				}else{
					b++;
				}
			}
			System.out.print("ż��"+a+"��\n����"+b+"��");
		}else{
			System.out.print("ż��1��\n����0��");
		}
	}
}