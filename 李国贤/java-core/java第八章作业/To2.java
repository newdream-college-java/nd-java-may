/*ѭ������5��ѧ���ĳɼ���ͳ���ж����˵ĳɼ�����80�֣�Ҫ��ʹ��
cont inue������
*/
import java.util.Scanner;
public class To2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=5;i++){
			System.out.println("�������"+i+"��ѧ���ĳɼ�:");
			int score=input.nextInt();
			if(score>80){
				sum++;
			continue;
			}
		}
		System.out.println("80�����ϵ���"+sum+"��");
	}
}