import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("����һ�����");
		int a=input.nextInt();
		int b=a%4;
		int c=a%100;
		if(b==0&&c!=0){
			System.out.println("����һ������");
		}else{
			System.out.println("��һ����ƽ��");
		}
	}
}