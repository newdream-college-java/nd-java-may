/*
���쵽����1��1�յ������� 5��14
1��������+2��������+....+4��������+5��14��
	30    30            30      14
//����ÿ���¶���30��
�·�������
���£�1��3��5��7��8��10��12 -----31��
С�£�4��6��9��11			 -----30��
2�£�����--29��  ƽ��---28��
*/
import java.util.Scanner;
public class Test06{
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
/*		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		switch(b){
			case 1:
			System.out.print(c-1);
			break;
			case 2:
			System.out.print(31+c-1);
			break;
			case 3:
			System.out.print(31+28+c-1);
			break;
			case 4:
			System.out.print(31+28+31+c-1);
			break;
			case 5:
			System.out.print(31+28+31+30+c-1);
			break;
			case 6:
			System.out.print(31+28+31+30+31+c-1);
			break;
			case 7:
			System.out.print(31+28+31+30+31+30+c-1);
			break;
			case 8:
			System.out.print(31+28+31+30+31+30+31+c-1);
			break;
			case 9:
			System.out.print(31+28+31+30+31+30+31+31+c-1);
			break;
			case 10:
			System.out.print(31+28+31+30+31+30+31+31+30+c-1);
			break;
			case 11:
			System.out.print(31+28+31+30+31+30+31+31+30+31+c-1);
			break;
			case 12:
			System.out.print(31+28+31+30+31+30+31+31+30+31+30+c-1);
			break;
		} */
		System.out.println("�������꣬�£��գ�");
		int year = in.nextInt();
		int month = in.nextInt();
		int day = in.nextInt();
		int a = 0;
		int i=1; 
		while(i<month){
			if(i==2){
				if(year%4==0&&year%100!=0||year%400==0){
					a+=29;
				}else{	
					a+=28;
				}
			}else if(i==4||i==6||i==9||i==11){
				a+=30;
			}else{
				a+=31;
			}
			i++;
		}
		a+=day;
		System.out.println("������Ϊ��"+a);
	}
}