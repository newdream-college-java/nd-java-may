/*
�Ӽ���������һ������������ 1~7 ʱ����ʾ�����Ӧ����Ϣ������ 1~7 ֮��
��ֵʱ����ʾ�����������룬ֱ������ 0 �˳�ѭ����
1��MON 2��TUE 3:WED 4:THU 5:FRI 6:SAT 7:SUN
*/
import java.util.Scanner;
public class To7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("������1~7�κ�һ������:");
		int a=input.nextInt();
		if(a>=1&&a<=7){
		switch(a){
			case 1:
				System.out.println("MON ");
			break;
			case 2:
				System.out.println("TUE ");
			break;
			case 3:
				System.out.println("WED");
			break;
			case 4:
				System.out.println("THU");
			break;
			case 5:
				System.out.println("SAT");
			break;
			case 6:
				System.out.println("SAT ");
			break;
			case 7:
				System.out.println("SUN");
			break;
			}
			}
			else if(a==0){
				System.out.println("����ѭ��:");}
			else{
				System.out.println("�������");
			}

}
}