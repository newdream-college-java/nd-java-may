/*
���ʵ�ֽ����û����������������������Ľ׳ˡ����磺��������4�������4!=4*3*2*1=24.Ҫ����������1~10��������ʾ����
*/
import java.util.Scanner;
public class To1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������һ��1~10������");
		int num=input.nextInt();
		int sum=1;
		for(int i=1;i<=num;i++){
			sum=sum*i;
		}
			System.out.println(sum);
	}
}