/*
��ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ��
*/
import java.util.Scanner;
public class To7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(;;){	
			System.out.println("������һ������0����:");
			int num = input.nextInt();
			if(num==0){
			break;
			}else{
				sum+=num;
			}
		}
		System.out.println(sum);
	}
}