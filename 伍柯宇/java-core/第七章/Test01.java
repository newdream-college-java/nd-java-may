/*
��д Java ����ʵ�ֽ����û����������������������Ľ׳ˡ�Ҫ����������������� 1-10 ֮�䣬
��Ч���ݽ�����ʾ�����������������磺4��=1*2*3*4=24
*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("������1~10����������");
		int a=input.nextInt();
		int sum=1;
		if(a<=10&&a>=1){
			for(int i=1;i<=a;i++){
				sum*=i;
			}
		}else{
			System.out.print("������󣡣���");
		}
		System.out.print(sum);
	}
}