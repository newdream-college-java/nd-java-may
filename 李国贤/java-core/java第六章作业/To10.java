/*
ѭ��¼�� 3 λ��Ա����Ϣ����Ա�źϷ�����ʾ¼����Ϣ��������ʾ¼��ʧ��
*/
import java.util.Scanner;
public class To10{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		for(int i=1;i<=3;i++){
			System.out.println("������4λ���ֵĻ�Ա��:");
			int a=input.nextInt();
			System.out.println("�������Ա����:");
			int b=input.nextInt();
			System.out.println("�������Ա����:");
			int c=input.nextInt();
			if(a/1000<1||a/10000>=1){
				System.out.print("������Ļ�Ա������\n\n");
			}else{
				System.out.println("������Ļ�Ա��Ϣ��:\n"+a+"\t"+b+"\t"+c+"\n\n");

			}

		}
	}
}