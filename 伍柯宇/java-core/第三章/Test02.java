import java.util.Scanner;

public class Test02{
	public static void main(String[] args){
		
		Scanner a=new Scanner(System.in);
		System.out.print("������һ����ݣ�");
		int year=a.nextInt();
		if(year%4==0 && year%100!=0){
			System.out.println(year+"�����꣡");
		}else{
			if(year%400==0){
				System.out.println(year+"�����꣡");
			}else{
				System.out.println(year+"�������꣡");
			}
		}
	}
}