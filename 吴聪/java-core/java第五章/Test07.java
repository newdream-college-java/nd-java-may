/*
 �Ӽ���������һ������������ 1~7 ʱ����ʾ�����Ӧ����Ϣ������ 1~7 ֮��
��ֵʱ����ʾ�����������룬ֱ������ 0 �˳�ѭ����
1��MON 2��TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("�����������һ������");
		int a = in.nextInt();
		while(a!=0){
			if(a>0&&a<8){
				if(a==1){
					System.out.println("MON");
					System.out.print("��������һ������");
				}
				if(a==2){
					System.out.println("TUE");
					System.out.print("��������һ������");
				}
				if(a==3){
					System.out.println("WED");
					System.out.print("��������һ������");
				}
				if(a==4){
					System.out.println("THU");
					System.out.print("��������һ������");
				}
				if(a==5){
					System.out.println("FRI");
					System.out.print("��������һ������");
				}
				if(a==6){
					System.out.println("SAT");
					System.out.print("��������һ������");
				}
				if(a==7){
					System.out.println("SUN");
					System.out.print("��������һ������");
				}
			}else{
				System.out.print("��������������룺");
			}
			a=in.nextInt();	
		}
	}
}