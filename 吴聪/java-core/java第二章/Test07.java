/*
дһ��Pay���������ʱ�û�֧��1500Ԫ����ӡ����СƱ������˴ι����õĻ�Ա���֣�ÿ����100Ԫ���3�֣�
*/
import java.util.Scanner;
public class Test07{
	public static void main	(String	[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("������T�����ۣ�");
		double a = in.nextDouble();		 //����T������
		System.out.print("�����빺��������");
		double b = in.nextDouble();
	//	int c = a*b;
	//	int c = (new Double(a)).intValue();
		double d = a*b;					//T���ܼ�
	//	System.out.print(d);
		System.out.print("����������Ь���ۣ�");
		double e = in.nextDouble();		 //��������Ь����
		System.out.print("�����빺��������");
		double f = in.nextDouble();
		double g = e*f;	 				//����Ь�ܼ�
		System.out.print("�����������ĵ��ۣ�");
		double h = in.nextDouble();		 //���������ĵ���
		System.out.print("�����빺��������");
		double i = in.nextDouble();
		double j = h*i;					 //�������ܼ�
		double s = d+g+j;				//�����ܽ��
		System.out.print("����������ۿۣ�");
		double z = in.nextDouble(); 	//�����ۿ�
		System.out.print("�Ѹ��");
		double money = in.nextDouble(); //ʵ�ʽ���
		double	back = money-s*z;
	//	System.out.print(back);
		int k = (new Double(s)).intValue();
		int jf = k/100*3;
	//����Ϊ��ӡ����СƱ
		System.out.println("***************���ѵ�***************");
		System.out.println("������Ʒ\t����\t����\t���");
		System.out.println("����Ь\t\t"+e+"\t"+f+"\t"+g);
		System.out.println("������\t\t"+h+"\t"+i+"\t"+j+"\n");
		System.out.println("�ۿۣ�\t\t"+z+"��");
		System.out.println("�����ܽ�\t"+s);
		System.out.println("ʵ�ʽ��ѣ�\t"+money);
		System.out.println("��Ǯ��\t\t"+back);
		System.out.println("���ι�������õĻ����ǣ�"+jf);
	}
}