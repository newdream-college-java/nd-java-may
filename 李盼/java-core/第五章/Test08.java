/*
ѭ��������Ʒ��ţ���ʾ��Ӧ����Ʒ�۸����롰n������ѭ��
����ѭ��������Ʒ��ź͹�������,�Զ�����ÿ����Ʒ�ļ�Ǯ(����*��������)����
�ۼӵ��ܽ��
������ n ʱ���ˣ�����ʱ�������ܰ����Żݣ�����Ӧ��������
*/
import java.util.Scanner;
public class Test08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("***********************************************************\n��ѡ�������Ʒ��ţ�\n1��T��\t2������Ь\t3��������\n***********************************************************\n\n");
		String m="y";
		int sum=0,s;
		do{
			System.out.println("��������Ʒ��ţ�");
			int i = input.nextInt();
			System.out.println("�����빺��������");
			int j = input.nextInt();
			if(i==1){
				s = 245*j;
				sum = sum +s;
				System.out.println("T����245\t����"+j+"\t�ϼ�"+"��"+s);  
			}
			else if(i==2){
				s = 570*j;
				sum = sum +s;
				System.out.println("����Ь��570\t����"+j+"\t�ϼ�"+"��"+s);
			}
			else if(i==3){
				s = 390*j;
				sum = sum +s;
				System.out.println("�����ģ�390\t����"+j+"\t�ϼ�"+"��"+s);
			}
			else{
					System.out.println("�������");
			}
			System.out.println("�Ƿ����(y/n)��");
			m = input.next();
		}while(m.equals("y"));
		System.out.println("������ʵ����");
		int a = input.nextInt();
		System.out.println("�ۿۣ�0.8\nӦ����"+(sum*0.8)+"\nʵ����"+a+"\n��Ǯ��"+(a-sum*0.8));
	}
}