/*
����һ������n�����n>0,����ͣ�1+1/2+1/3+...+1/n,����������������
*/
import java.util.Scanner;
public class Test05{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("����һ��������");
		int num = in.nextInt();
		int b=0;
		if(num>0){
			for(int i=1;i<=num;i++){
				b+=1/i;
			}
		}else{
			System.out.print("�������");
		}
		System.out.print(b);
	}
}