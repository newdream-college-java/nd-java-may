import java.util.*;

public class Test07{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		System.out.print("����������ݣ�");
		int year = input.nextInt();
		System.out.print("�������·ݣ�");
		int month = input.nextInt();

		int sum= 0;
		//1.������=��������+��������+1��
		//1.1��������=1900��+1901��+......+(year-1)��
		for(int i=1900;i<year;i++){
			if(i%4==0&&i%100!=0||i%400==0){//����
				sum+=366;
			}else{
				sum+=365;
			}
		}
		//1.2��������=2018���1��+2��+����������+��month-1��������
		for(int i=1;i<month;i++){
			if(i==2){
				if(i%4==0&&i%100!=0||i%400==0){//����---2019��
					sum+=29;
				}else{//ƽ��
					sum+=28;
				}
			}else if(i==4||i==6||i==9||i==11){//С��
				sum+=30;
			}else{//�ж��������ķŵ�else  ����
				sum+=31;
			}
		}
		//1.3��1����һ��
		sum+=1;
		//2.�ؼ�Ҫ�� 2:ȷ����һ����һ�µ�����?
		int days = 0;//��ʾ����µ�������
		if(month==2){
				if(year%4==0&&year%100!=0||year%400==0){//����
					days+=29;
				}else{//ƽ��
					days+=28;
				}
		}else if(month==4||month==6||month==9||month==11){//С��
			days+=30;
		}else{//�ж��������ķŵ�else  ����
			days+=31;
		}
		//3.���������
		//3.1�����ͷ
		System.out.println("\t\t"+year+"��"+month+"��");
		//3.2�������
		System.out.println("��\tһ\t��\t��\t��\t��\t��\t");
		//3.3�������
		//1-ȷ��1�ŵ�λ�ã�1�������ڼ�ǰ��ʹ򼸸�\t
		for(int i=1;i<=sum%7;i++){
			System.out.print("\t");
		}
		for(int i=1;i<=days;i++){
			System.out.print(i+"\t");
			if(sum%7==6){//�����һ�����������ͻ���
				System.out.print("\n");
			}
			sum++;//ÿ���ӡһ����������+1

		}
	}
}







