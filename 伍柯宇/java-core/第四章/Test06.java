import java.util.Scanner;
public class Test06{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.println("�������꣬�£��գ�");
		int year = input.nextInt();
		int month = input.nextInt();
		int day = input.nextInt();

		int sum = 0;

		//1��������+2��������+....+4��������
		int i=1; //i��ʾ�·�
		while(i<month){
			//sum+=30;
			if(i==2){//2��
				if(year%4==0&&year%100!=0||year%400==0){//����
					sum+=29;
				}else{	
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){//С��
				sum+=30;
			}else{//����
				sum+=31;
			}
			i++;
		}
		//5��14��
		sum+=day;

		System.out.println("������Ϊ��"+sum);



	}
}