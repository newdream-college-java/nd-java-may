/*
1.7��ѭ��������� 0 �����ֽ����ۼӣ�
ֱ�����������Ϊ 0���ͽ���ѭ�������������ۼӵĽ����
*/
import java.util.Scanner;
public class Test07{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(;;){
			int a=input.nextInt();
			if(a!=0){
				sum+=a;
			}else{
				break;
			}
			System.out.print("�ۼӵĽ��Ϊ��"+sum+"---");
		}
	}
}