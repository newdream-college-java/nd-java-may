import java.util.Scanner;

public class Test03{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		int y=0;//ż������
		int x=1;//ѭ���������
		while(x<=10){
			int a=input.nextInt();
			x++;
			if(a%2==0){
				y++;
			}
		}
		System.out.println("ż������Ϊ��"+y);
	}
}