import java.util.Scanner;

public class Test05{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a==b&&b==c){
			System.out.println("�����������");
		}else{
			if((a+b+c)>1000){
				System.out.println("������������1000");
			}
			else{
				System.out.println("��������������1000");
			}
		}
	}
}