/*
���ʵ�ֽ����û����������������������Ľ׳ˡ����磺��������4�������4��=4*3*2*1=24.Ҫ����������1~10��������ʾ����
*/
import java.util.Scanner;
public class Test01{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("����һ����������");
		int a=in.nextInt();
		int b=1;
//		for(int i=1;i<=a;i++){
//			b*=i;
			if(a<1||a>10){
			System.out.print("�������");
			}else{
				for(int i=1;i<=a;i++){
					b*=i;
				}
				System.out.print(b);
			}
//		}
	}
}