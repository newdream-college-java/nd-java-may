import java.util.Scanner;
public class To7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.println("����T������:");
		int a=input.nextInt();

		System.out.println("��������Ь����:");
		int b=input.nextInt();

		System.out.println("��������������:");
		int c=input.nextInt();

		System.out.println("�����ۿ�(С��):");
		double d=input.nextDouble();

		System.out.println("����ʵ��֧���ķ���:");
		int e=input.nextInt();

		int g=245*a;   //T��
		int h=570*b;   //����Ь
	 	int j=320*c;   //������
		double z=(g+h+j)*d;//������Ʒ���ܽ��
		double q=e-z;  //��Ǯ
		int f = (int)z/100*3;
		System.out.println("******************���ѵ�********************");
		System.out.println("����Ʒ\t����\t\t����\t\t���");
		System.out.println("T��\t\t��245\t\t"+a+"\t\t"+g+"\n����Ь\t\t��570\t\t"+b+"\t\t"+h);
		System.out.println("������\t\t��320\t\t"+c+"\t\t"+j);
		System.out.println("�ۿ�:\t\t"+d+"\n�����ܽ��"+"\t��"+z+"\nʵ�ʽ���"+"\t��"+e+"\n��Ǯ\t\t"+"��"+q+"\n���ι������û���"+f);		



	}
}