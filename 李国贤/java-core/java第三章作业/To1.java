import java.util.Scanner;
public class To1{
	public static void main(String[] args){
		System.out.println("����һ����λ��");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=a%10;
		int c=a/10%10;
		int d=a/100%10;
		
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		if (d>c&&c>b){
			System.out.println("����һ��������");
		}else{
			System.out.println("������ǽ�����");
		}
	}

}