import java.util.Scanner;

public class Test01{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ����λ������");
		int x=sc.nextInt();
		int a=x%10;
		int b=x/10%10;
		int c=x/100%10;
		if(c>b&&b>a){
			System.out.println("�����ǽ�����");
		}else{
			System.out.println("�������ǽ�����");
		}
	}		
}